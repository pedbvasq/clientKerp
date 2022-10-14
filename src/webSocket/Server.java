/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webSocket;
import javax.websocket.OnClose;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Christian
 */
@ServerEndpoint("/Server")
public class Server {
   
    
       @OnOpen
    public void onOpen (Session peer) {
     
    }

    @OnClose
    public void onClose (Session peer) {
      
    }
}
