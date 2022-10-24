
package clientekerp;

import javax.websocket.ClientEndpoint;






@ClientEndpoint
public class ClienteKerp  {

    public static void main(String[] args)  {
             
        WebSocket connection = new WebSocket();
        Thread fill = new Thread(new VisorClientKerp());
        //fill 
    
        //webSocket conectado
         connection.start();
         //inicio de interfaz 
         VisorClientKerp ventana = new VisorClientKerp();
        ventana.setVisible(true);
            fill.start();
      

    }
}