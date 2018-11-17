/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Scanner;

/**
 *
 * @author kevinn riley on 11/16/18
 * to hold the Dungeon object -- my array to hold the hero and monster 
 */
public class Dungeon {
    
    static Scanner scan= new Scanner(System.in);
    static Hero player = new Hero();
    static Monster mon =new Monster();
    static   int position;
    public static final int WIDTH = 6;
    public int depth = 1;
    static int[] dung = new int[WIDTH] ;
 //   int[][] dungeon= new int[width][depth];
    public void startGame(){
       position=0;
       System.out.println(" what is the heroes name?");
       String name = scan.nextLine();
       Hero p1= new Hero(name);
        System.out.println(" hello brave adventurer "+p1.name);
       
       while(position!= WIDTH){
           moveForward(position);
       }
    }
    public static int moveForward(int currP){
      switch(currP){
          case 0:
              System.out.println("The Hero takes a step forward");
              position++;
              break;
          case 1:
              System.out.println("The Hero takes another step forward");
              position++;
              break;
          case 2:
              System.out.println("The Hero finds gold");
              position++;
              break;
          case 3:
              System.out.println("The Hero finds a dimond ring");
              position++;
              break;
          case 4:
              System.out.println("The Hero find a ruby the size of his fist");
              position++;
              break;
          case 5:
              System.out.println("The Hero runs into " + mon.toString());
             System.out.println(" and slays the scary monster");
             position++;
              break;
          default:
              System.out.println("the hero emerges victorius");
              position++;
      }
        
        return position+1;
    }
   
}
