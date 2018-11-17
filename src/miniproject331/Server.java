/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject331;

import Game.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author kevin
 */
public class Server implements Runnable{
      DatagramSocket sock;
      String hostName;
      int port;
      Server(int p){
          port=p;
      }
    static  Dungeon d = new Dungeon();
      private final int PORT=7777;
      InetAddress localHost;
    public void run(){
       try{
           localHost=InetAddress.getLocalHost();
           sock=new DatagramSocket(port);
           
           byte[] b1 = new byte[1024];
           DatagramPacket dp = new DatagramPacket(b1,b1.length);
           sock.receive(dp);
           d.startGame();
           String data = new String(dp.getData());
           System.out.println(data);
          
           byte[] b2= (data+ "").getBytes();
           
           
           DatagramPacket dp1 = new DatagramPacket(b2, b2.length,localHost,dp.getPort());
           sock.send(dp1);
           
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
    

