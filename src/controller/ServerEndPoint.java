package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;


//@TODO
public class ServerEndPoint {
  
  private static List<Session> sessions = Collections.synchronizedList(new ArrayList<Session>()); 

  /**
   * Sends a broadcast message with the name of the device.
   * @param deviceName The device Name to be sent as a message.
   */
  public void sendBroadcastStatusChanged(String deviceName) {
  //@TODO
 
  //        .....sendText(deviceName);
 
  }
  
  @OnOpen
  public void onOpen(Session session) {
    sessions.add(session);
  }
  
  @OnClose
  public void onClose(Session session) {
    sessions.remove(session);
  }  
}
