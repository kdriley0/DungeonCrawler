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
     Hero player ;
    static Monster mon =new Monster();
    static   int position;
    public static final int WIDTH = 6;
    public int depth = 1;
    static int[] dung = new int[WIDTH] ;
 //   int[][] dungeon= new int[width][depth];
   public Dungeon(Hero player){
       this.player=player;
    }
   
    public void startGame(){
       position=0;
      // System.out.println(" what is the heroes name?");
    //  String name = scan.nextLine();
      // Hero p1= new Hero(name);
    System.out.println(" hello brave adventurer "+player.name);
       
       while(position!= WIDTH){
            System.out.println("ypur position is "+position);
             System.out.println("you can go forward type f or swing your sword type s");
        char in = scan.next().charAt(0);
           switch (in){
           case 'f':
           moveForward(position);
           break;
           case 's':
          this.swingSword(position);
           break;
           default:
              System.out.println("please try again \nyou can go forward type f or swing your sword type s");
              
      
       }

           
       }
        System.out.println("the hero emerges victorius");
       
    }
       public void swingSword(int position){
           if(position==WIDTH-1){
               System.out.println("The mighty hero "+ this.player.name+ " swings his sword");
               System.out.println("Decapitating "+mon.toString() +"!");
               position++;
           }else {
               System.out.println("The mighty hero "+ this.player.name+ " swings his sword");
               System.out.println("at nothing has he gone mad?");
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
             //System.out.println(" and slays the scary monster");
             
              break;
          default:
              System.out.println("the hero emerges victorius");
              position++;
      }
        
        return position+1;
    }
   
}
