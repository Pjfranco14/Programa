public class ListadoComandos {
	
	String comandos [] = new String[17];
	String DefinicionComandos [] = new String [17];
		
	ListadoComandos() {
			
			comandos[0]="pwd";
			comandos[1]="cd";
			comandos[2]="ls";
			comandos[3]="cat";
			comandos[4]="cp";
			comandos[5]="sudo";
			comandos[6]="head";
			comandos[7]="tail";
			comandos[8]="chmod";
			comandos[9]="clear";
			comandos [10]="mv";
			comandos [11]="mkdir";
			comandos [12]="rmdir";
			comandos [13]="rm";
			comandos [14]="touch";
			comandos [15]="chown";
			comandos [16]="nano";
			

			
			
	
			
			DefinicionComandos [0]= "Usa el comando pwd para encontrar la ruta del directorio (carpeta) de trabajo actual en el que te encuentras.";
			DefinicionComandos [1]= "Para navegar por los archivos y directorios de Linux, usa el comando cd.";
			DefinicionComandos [2]= "El comando ls se usa para ver el contenido de un directorio. Por defecto, este comando mostrará el contenido de tu directorio de trabajo actual.";
			DefinicionComandos [3]= "Se utiliza para listar el contenido de un archivo en la salida estándar (sdout).";
			DefinicionComandos [4]= "Usa el comando cp para copiar archivos del directorio actual a un directorio diferente. ";
			DefinicionComandos [5]= "Abreviatura de «SuperUser Do» (SuperUsuario hace), este comando te permite realizar tareas que requieren permisos administrativos o raíz.";
			DefinicionComandos [6]= "El comando head se usa para ver las primeras líneas de cualquier archivo de texto.";
			DefinicionComandos [7]= "El comando tail mostrará las últimas diez líneas de un archivo de texto.";
			DefinicionComandos [8]= "chmod es otro comando de Linux, utilizado para cambiar los permisos de lectura, escritura y ejecución de archivos y directorios.";
			DefinicionComandos [9]= "limpiar pantalla";
			DefinicionComandos [10]= "El uso principal del comando mv es mover archivos, aunque también se puede usar para cambiar el nombre de los archivos.";
			DefinicionComandos [11]= "Usa el comando mkdir para crear un nuevo directorio: si escribes mkdir Musica, creará un directorio llamado Musica.";
			DefinicionComandos [12]= "Si necesitas eliminar un directorio, usa el comando rmdir. Sin embargo, rmdir solo te permite eliminar directorios vacíos.";
			DefinicionComandos [13]= "El comando rm se usa para eliminar directorios y el contenido dentro de ellos.";
			DefinicionComandos [14]= "El comando touch te permite crear un nuevo archivo en blanco a través de la línea de comando de Linux.";
			DefinicionComandos [15]= "El comando chown te permite cambiar o transferir la propiedad de un archivo al nombre de usuario especificado. ";
			DefinicionComandos [16]= "El comando nano permite leer, crear y editar un archivo.";

		}
}
