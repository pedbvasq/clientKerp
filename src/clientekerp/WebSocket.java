package clientekerp;


import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.EndpointConfig;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

@ClientEndpoint
public class WebSocket extends Thread{

//variables
    private static String json;
    private Set<Session> sessions = new HashSet<>();
    List<String> listMesages = new ArrayList();
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
 
        System.out.println("el mensaje es " + message);
        
        
       json = message;
       
        

    }
   
    @OnOpen
    public void onOpen(Session session,  EndpointConfig config){
        
    }
    
    

//signal
    private static void wait4TerminateSignal() {
        synchronized (waitLock) {
            try {
                waitLock.wait();
                System.out.println(waitLock);
               
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
