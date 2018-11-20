/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject331;

import Game.Dungeon;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author kevin
 */
public class MiniProject331 {
   static Dungeon d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port=50001;
      //  d.startGame();
    Client c = new Client(port);
    Server s= new Server(port);
     
     ExecutorService exS= Executors.newFixedThreadPool(2);
    
     exS.submit(s);
     exS.submit(c);
    }
    
}
