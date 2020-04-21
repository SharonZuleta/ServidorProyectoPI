
package servidorproyectofinal;

import java.net.ServerSocket;
import java.net.Socket;

public class ServidorProyectoFinal {

    public static void main(String[] args) throws Exception{
        
        int puerto = 6060;

        ServerSocket servidor = new ServerSocket(puerto);

        while (true) {

            Socket cliente = servidor.accept();

            // Construye un objeto para procesar el mensaje de solicitud HTTP.
            SolicitudHTTP solicitud = new SolicitudHTTP( cliente);

            // Crea un nuevo hilo para procesar la solicitud.
            Thread hilo = new Thread(solicitud);

            // Inicia el hilo.
            hilo.start();
        
        }
    }
    
}
