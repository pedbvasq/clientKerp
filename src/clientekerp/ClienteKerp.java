
package clientekerp;

import javax.websocket.ClientEndpoint;






@ClientEndpoint
public class ClienteKerp  {

    public static void main(String[] args)  {
        
    
        WebSocket connection = new WebSocket();
        Thread fill = new Thread(new VisorClientKerp());
       
        connection.setPriority(1);
        connection.start();
       
        fill.start();
         
      
      

    }
}