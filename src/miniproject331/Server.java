/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject331;

import Game.Dungeon;
import Game.Hero;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author kevin on 11/20/18 to act as a server to my project
 *
 * has a constructor that takes a port number
 * 
 * it also sends the victory message back to the client
 */
public class Server implements Runnable{
    
      private DatagramSocket sock;//declaring variables
      private int port;
      private static  Dungeon d ;
      private final int PORT=7777;
      private InetAddress localHost;
      
      
      Server(int p){
          port=p;
      }
      
    
    public void run(){
       try{
           
           localHost=InetAddress.getLocalHost();
           sock=new DatagramSocket(port);
           
           byte[] b1 = new byte[1024];//needs to first be initialzed to a size bigger than the packet it is going to accept
           DatagramPacket dp = new DatagramPacket(b1,b1.length);// declaring and initialzing a datagram packet  
           sock.receive(dp);//recieving a datagram packet from the socket declared
           String data = new String(dp.getData());
           //System.out.println(data);
           d=new Dungeon(new Hero(data));//creating a new dungeon with the hero name that I received from the client
           d.startGame();
           
           byte[] b2= d.toString().getBytes();//sending back the victory message 
           
           
           DatagramPacket dp1 = new DatagramPacket(b2, b2.length,localHost,dp.getPort());
           sock.send(dp1);
           sock.close();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
    

