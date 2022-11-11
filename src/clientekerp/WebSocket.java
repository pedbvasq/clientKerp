package clientekerp;




import java.awt.Color;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

@ClientEndpoint
public class WebSocket extends Thread{

//variables
    private static String json;
 

    public static String getJson() {
        return json;
    }

    public static void setJson(String json) {
        WebSocket.json = json;
    }
    public static  Cliente cliente ;
    private static Object waitLock = new Object();

  


//message
    @OnMessage
    public  void onMessage(String message,Session session) {
        try {
            Thread.sleep(50);

       
            json = message;
            Thread fill = new Thread(new VisorClientKerp());
             fill.start();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(WebSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       
        
    }
    
    @OnOpen
    public void onOpen(Session session,  EndpointConfig config){
   
        VisorClientKerp.getConection().setForeground( Color.GREEN);
       VisorClientKerp.getConection().setText("Conectado");
    
    }
    @OnClose
    public void onClose(Session session,  EndpointConfig config){
    
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(WebSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
         VisorClientKerp.getConection().setText("Desconectado");
         VisorClientKerp.getConection().setForeground( Color.RED);
        
        
    }
    

//signal
    private static void wait4TerminateSignal() {
        synchronized (waitLock) {
            try {
                waitLock.wait();
          
               
            } catch (InterruptedException e) {
            }
        }
    }

//main connection
   
    @Override
    public void run() {
 
        WebSocketContainer container = null;
        Session session = null;
         
        try {

            container = ContainerProvider.getWebSocketContainer();
           
            session = container.connectToServer(WebSocket.class, URI.create("ws://localhost:3000/"));
            wait4TerminateSignal();
            
        } catch (Exception e) {
    
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
          
                }

            }

        }
    }
}
