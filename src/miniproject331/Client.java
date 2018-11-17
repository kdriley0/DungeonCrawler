/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject331;

import Game.*;// i am lazy 
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author kevin
 */
public class Client  implements Runnable{
    
    
    Dungeon d= new Dungeon();
     private final int PORT=7777;
     int port;
     Client(int port){
         this.port=port;
     }
    public void run(){
       try{
           DatagramSocket ds= new DatagramSocket();
           int i=8;
           
           byte[] b= (i+"").getBytes();
           
           InetAddress ia = InetAddress.getLocalHost();
           DatagramPacket dp= new DatagramPacket(b,b.length,ia,port);
           ds.send(dp);
           byte[] b1 = new byte[1024];
           DatagramPacket dp1= new DatagramPacket(b1,b1.length);
           ds.receive(dp1);
           
           String str = new String(dp1.getData());
           
           System.out.println("what we got back was "+ str);
           
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
