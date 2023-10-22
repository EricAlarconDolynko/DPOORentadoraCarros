package RentadoraConsola;

import RentadoraModelo.AdministradorGeneral;
import RentadoraModelo.AdministradorLocal;
import RentadoraModelo.Cliente;
import RentadoraModelo.EmpleadoInventario;
import RentadoraModelo.EmpleadoMostrador;
import RentadoraModelo.RentadoraCarros;
import RentadoraModelo.Sede;
import RentadoraModelo.Usuario;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class Consola {

	//Attributes
	
	private RentadoraCarros rentadora;
	
	//Constructor
	
	public Consola() {
			this.rentadora = new RentadoraCarros("Cuchau Motors");
			ejecutarConsola();
		}

	public void ejecutarConsola() {
		System.out.println("===============================================================");
		System.out.println("¡¡¡Bienvenido a CUCHAU MOTORS!!!");
		System.out.println("Donde prestamos carros más rapidos que el propio Rayo McQueen");
		System.out.println("===============================================================");
		
		Scanner reader = new Scanner(System.in);
		boolean flag = true;
		while (flag == true) {
			System.out.println("======= MENU PRINCIPAL ============");
			System.out.println("Escriba la opción que desea ejecutar");
			System.out.println("1. Registrarse en CUCHAU MOTORS (Nueva Cuenta para clientes)");
			System.out.println("2. Logearse en CUCHAU MOTORS (Cuenta Existente)");
			System.out.println("0. Salir de esta maravillosa aplicacion (Adios, CUCHAU)");
			
			String answer = reader.next();
			Properties pLogin = new Properties();
			
			//PRIMERA OPCION
			if (answer.equals("1")) {
				System.out.println("Cual va a ser su nuevo User?");
				answer = reader.next();
				try {
				pLogin.load(new FileInputStream(new File("./RentadoraStorage/Login.txt")));
				Set<Object> llavesLogin = pLogin.keySet();
				
				if (llavesLogin.contains(answer)) {
					System.out.println("Lo siento, el usuario está tomado, tiene que ser mas creativo");
					System.out.println("No se guardo su login");
				}
				else {
					String userLogin = answer;
					ArrayList<String> datosPersonales = new ArrayList<String>();
					
					System.out.println("Digite su contraseña y recuerdela porfavor");
					datosPersonales.add(reader.next());
					System.out.println("Ahora le pedire unos datos personales antes de crear su cuenta");
					System.out.println("PORFAVOR NO INCLUIR ESPACIOS EN LAS RESPUESTAS \n");
					System.out.println("Cuál es su nombre completo");
					datosPersonales.add(reader.next());
					System.out.println("Cual es su fecha de nacimiento en formato dd/mm/YYYY");
					datosPersonales.add(reader.next());
					System.out.println("Cuál es su nacionalidad");
					datosPersonales.add(reader.next());
					System.out.println("Cuál es su documento de identidad");
					datosPersonales.add(reader.next());
					datosPersonales.add("Imagen.pdf");
					System.out.println("Cuál es su numero de celular");
					datosPersonales.add(reader.next());
					System.out.println("Cuál es su numero de email");
					datosPersonales.add(reader.next());
					System.out.println("Cuál es su metodo de pago");
					datosPersonales.add(reader.next());
					System.out.println("Cuál es el número de su tarjeta de credito");
					datosPersonales.add(reader.next());
					System.out.println("Cuando vence su tarjeta de credito en mm/YYYY");
					datosPersonales.add(reader.next());
					System.out.println("Cual es el número de su licencia de conducción");
					datosPersonales.add(reader.next());
					System.out.println("En que país se expidió la licencia");
					datosPersonales.add(reader.next());
					System.out.println("Cuando vence su licencia en dd/mm/YYYY");
					datosPersonales.add(reader.next());
					datosPersonales.add("true");
					datosPersonales.add("cliente");

					String informacionJunta = String.join(";", datosPersonales);
					 
					pLogin.put(userLogin, informacionJunta);
				}
				
				guardarLogin(pLogin);
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			//SEGUNDA OPCION
			
			else if (answer.equals("2")) {
				System.out.println("Ingrese su User");
				answer = reader.next();
				try {
					pLogin.load(new FileInputStream(new File("./RentadoraStorage/Login.txt")));
					Set<Object> llavesLogin = pLogin.keySet();
					
					if (llavesLogin.contains(answer)) {
						System.out.println("Ingrese su contraseña");
						String infoLogin = (String) pLogin.get(answer);
						String[] listaInfoLogin = infoLogin.split(";");
						String password = reader.next();
						
						if (password.equals(listaInfoLogin[0])) {
							String rolUsuario = (String) listaInfoLogin[listaInfoLogin.length-1];
							menuUsuario(rolUsuario, listaInfoLogin);
						}
						
						else {
							System.out.println("Contraseña Incorrecta, no tiene acceso");
						}
					}
					
					else {
						System.out.println("No está en nuestro sistema, por favor registrese");
					}
					
					
					}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
			
			//OPCION SALIDA
			
			else if (answer.equals("0")) {
				flag = false;
			}
			
			else {
				System.out.println("Ingrese una opcion valida");
			}
			
		}
		
	}
	
	//LOAD SPECIFIC MENU BY ROLE
	
	public void menuUsuario(String rol, String[] info) {
		
		if (rol.equals("cliente")) {
			Cliente usuarioActual =  new Cliente(info[1],info[2],info[3],info[4],
										info[5],rol,info[6],info[7],info[8],info[9],
										info[10],info[11],info[12],info[13],Boolean.parseBoolean(info[14]));
			menuCliente(usuarioActual);
		}
		else if (rol.equals("local")) {
			AdministradorLocal usuarioActual = new AdministradorLocal(info[1],info[2],
					info[3],info[4],info[5],rol,info[6], Boolean.parseBoolean(info[7]));
//			menuLocal();
		}
		else if (rol.equals("general")) {
			AdministradorGeneral usuarioActual = new AdministradorGeneral(info[1],info[2],
					info[3],info[4],info[5],rol);
//			menuGeneral();
		}
		else if (rol.equals("mostrador")) {
			EmpleadoMostrador usuarioActual = new EmpleadoMostrador(info[1],info[2],
					info[3],info[4],info[5],rol,info[6], Boolean.parseBoolean(info[7]));
//			menuMostrador();
		}
		else if (rol.equals("inventario")) {
			EmpleadoInventario usuarioActual = new EmpleadoInventario(info[1],info[2],
					info[3],info[4],info[5],rol,info[6], Boolean.parseBoolean(info[7]));
//			menuInventario();
		}
		
	}
	
	//INDIVIDUAL MENU
	
	public void menuCliente(Cliente clienteActual) {
		
		Scanner reader = new Scanner(System.in);
		boolean flag = true;
		while (flag == true) {
			System.out.println("=======================================================");
			System.out.println("BIENVENIDO NUESTRO QUERIDO CLIENTE " + clienteActual.getNombre());
			System.out.println("=======================================================");
			
			
			boolean sedeFlag = true;
			while (sedeFlag == true) {
			sedeFlag = false;
			System.out.println("Seleccione una sede porfavor");
			System.out.println("1. Radiator Spring");
			System.out.println("2. Carburetor Canyon");
			System.out.println("3. Emeryville");
			System.out.println("4. Motor Speedway");
			
			Sede sedeActual = null;
			String leerSede = reader.next();
			Properties pSedes = new Properties();
			try {
			pSedes.load(new FileInputStream(new File("./RentadoraStorage/Sedes.txt")));
			
			
			if (leerSede.equals("1")) {
				String stringSede = (String) pSedes.get("RadiatorSping");
				String[] infoSede = stringSede.split(";");		
				sedeActual = new Sede(infoSede[0],infoSede[1],infoSede[2],infoSede[3]);
				
				
			}
			else if (leerSede.equals("2")) {
				String stringSede = (String) pSedes.get("RadiatorSping");
				String[] infoSede = stringSede.split(";");	
			}
			else if (leerSede.equals("3")) {
				String stringSede = (String) pSedes.get("RadiatorSping");
				String[] infoSede = stringSede.split(";");	
			}
			else if (leerSede.equals("4")) {
				String stringSede = (String) pSedes.get("RadiatorSping");
				String[] infoSede = stringSede.split(";");	
			}
			else {
				System.out.println("Ingrese una opción valida");
				sedeFlag = true;
			}
			
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
			}
			
			System.out.println("Que día quiere recoger el carro");
			System.out.println("Escoga una opcion");
			System.out.println("1. Iniciar una reserva");
			System.out.println("2. Formalizar un alquiler");
			System.out.println("3. Registrar conductor adicional (Necesita una reserva)");
			System.out.println("4. Entregar un vehículo (Necesita tener un vehículo alquilado)");
			System.out.println("0. Cerrar Sesion");
			
			String answer = reader.next();
			
			//RESERVAR UN CARRO
			
			if (answer.equals("1")) {
							
//				reservaCliente = clienteActual.iniciarReserva();
				
				
				
			}
			else if (answer.equals("2")) {
				clienteActual.formalizarAlquiler();
			}
			else if (answer.equals("3")) {
				clienteActual.registrarOtroConductor();
			}
			else if (answer.equals("4")) {
				clienteActual.entregarVehiculo();
			}
			else if (answer.equals("0")) {
				flag = false;
			}
			else {
				System.out.println("Ingrese una opción valia");
			}
			
		}
		
	}
	
	//GUARDAR EN LOGIN.TXT
	
	public void guardarLogin(Properties p) {
		try {
		p.save(new FileOutputStream(new File ("./RentadoraStorage/Login.txt")),"");
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		}
	}

	
	//Main method
	public static void main(String[] args) {
		Consola consola = new Consola();
		}


}
