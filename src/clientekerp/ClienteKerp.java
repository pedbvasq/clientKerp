
package clientekerp;

import javax.websocket.ClientEndpoint;






@ClientEndpoint
public class ClienteKerp  {
static VisorClientKerp  ventana = new VisorClientKerp();
        
    public static void main(String[] args)  {
        
      
        WebSocket connection = new WebSocket();
       ventana.setVisible(true);
        
        connection.setPriority(1);
        connection.start();
      
      
      

    }
}