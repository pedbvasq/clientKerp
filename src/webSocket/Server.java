/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webSocket;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
 import java.net.URI;
 import java.util.concurrent.TimeUnit;
/**
 *
 * @author Christian
 */
@ServerEndpoint("/Server")
public class Server extends Endpoint{
   
    
       @OnOpen
       @Override
    public void onOpen (Session peer,EndpointConfig endpointConfig) {
     RemoteEndpoint .Basic remoteEndpointBasic = peer.getBasicRemote();
     peer.addMessageHandler(new messageHandler(remoteEndpointBasic) );
    }

    @OnClose
    public void onClose (Session peer) {
      
    }

    @Override
    public void onError(Session session, Throwable thr) {
        super.onError(session, thr); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   

   
    private static class messageHandler 
            implements MessageHandler.Whole<String>{

        private final RemoteEndpoint.Basic remoteEndpointBasic;

       private messageHandler(RemoteEndpoint.Basic remoteEndpointBasic){
           this.remoteEndpointBasic=remoteEndpointBasic;
       }
        @Override
        public void onMessage(String message) {
           if(remoteEndpointBasic !=null){
               try {
                   remoteEndpointBasic.sendText(message);
                   
               } catch (IOException ex) {
                   Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
    }
    
}
