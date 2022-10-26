package clientekerp;

import com.google.gson.Gson;
import java.net.URI;

import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.OnMessage;
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
    public  void onMessage(String message) {
 

        System.out.println(message);
        json = message;
       
        

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
          
            //Tyrus is plugged via ServiceLoader API. See notes above
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
