import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		
		ListadoComandos comando = new ListadoComandos();

		
		System.out.println("  						          	 Bienvenido a mi programa              ");
		System.out.println("                                                   ");
		System.out.println("*******************************************************************************************************************************************************");
		System.out.println("                 							  COMANDOS                        ");
		System.out.println("*******************************************************************************************************************************************************");
		System.out.println("                                                   ");
		System.out.print("Ingresa el nombre del comando:  ");
		
		
		boolean programaEncendido = true;
		
		do {
		
			int correcto= 0;
		
		Scanner preguntaComando = new Scanner(System.in);
		String noEncontrado = "Comando no encontrado";
		String datoUsuario = preguntaComando.nextLine();
		
		if (datoUsuario.equals("")) {
			correcto = 1;
			 System.out.println("*******************************************************************************************************************************************************");
			System.out.print("Ingresa el nombre del comando: ");
			
			
			}else if (datoUsuario.equalsIgnoreCase("exit")) {
			programaEncendido = false;
			correcto = 1;
				
			} else {
					for(int i = 0;i<comando.comandos.length;i++) {
					
						if(datoUsuario.equalsIgnoreCase(comando.comandos [i])) {
					
							System.out.println("                                                   ");
							System.out.println("Comando:     "+comando.comandos [i]);
							System.out.println("Definición:  "+comando.DefinicionComandos [i]);
							System.out.println("                                                   ");
							System.out.println("Presiona enter para ingresar un nuevo comando o exit para salir");
							correcto =1;
						}
				}
		}
		if(correcto==0) {
			 System.out.println("                                                   ");
			 System.out.println("*******************************************************************************************************************************************************");
			 System.out.println("Comando no encontrado");
			 System.out.println("*******************************************************************************************************************************************************");
			 System.out.println("                                                  ");
			 System.out.print("Ingresa el nombre del comando: ");
		}
	}while (programaEncendido);
}
}
