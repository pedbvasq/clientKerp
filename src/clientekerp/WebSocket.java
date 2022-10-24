package clientekerp;

import java.net.URI;

import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

@ClientEndpoint
public class WebSocket {

//variables
    private static String json = null;
    private static Object waitLock = new Object();

//message
    @OnMessage
    public  void onMessage(String message) {
 

        System.out.println("Received msg: " + message);
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
    public static void connection() {
        System.out.println("entre");
        WebSocketContainer container = null;
        Session session = null;
        try {
            System.out.println("hello");
            //Tyrus is plugged via ServiceLoader API. See notes above
            container = ContainerProvider.getWebSocketContainer();
           
            session = container.connectToServer(WebSocket.class, URI.create("ws://localhost:3000/"));
            wait4TerminateSignal();
        } catch (Exception e) {
            System.out.println("entre1");
            System.out.println(e.getMessage());
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    System.out.println("entre2");
                     System.out.println(e.getMessage());
                }

            }

        }

    }
}
