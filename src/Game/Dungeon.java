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
    
    private static Scanner scan= new Scanner(System.in);
    private Hero player ;
    private static Monster mon =new Monster();
    private static   int position;
    private static final int WIDTH = 6;
    private int depth = 1;// I thought about doing a 2d array of rooms but that would take too long
    private static int[] dung = new int[WIDTH] ;
 //   int[][] dungeon= new int[width][depth];
   public Dungeon(Hero player){
       this.player=player;
    }
   /**
    * my start game method 
    * essentially runs the game 
    * starts the hero at the beginning of the the dungeon and 
    * ends when the hero makes it to the end
    */
    public void startGame(){
       position=0;
      // System.out.println(" what is the heroes name?");
    //  String name = scan.nextLine();
      // Hero p1= new Hero(name);
    System.out.println(" Hello brave adventurer "+player.name);
       
       while(position < WIDTH){
          //  System.out.println("ypur position is "+position);
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
        System.out.println();
       
    }
    /**
     * my swing sword method it allows the user to swing a sword 
     * could be later updated with damage / health of monsters 
     * but seeing as how this is a mini project I wanted to keep it simple 
     * 
     * @param pos 
     */
       public void swingSword(int pos){
           if(position==WIDTH-1){
               System.out.println("The mighty hero "+ this.player.name+ " swings his sword");
               System.out.println("Decapitating "+mon.toString() +"!");
               position++;
           }else {
               System.out.println("The mighty hero "+ this.player.name+ " swings his sword");
               System.out.println("at nothing has he gone mad?");
           }
           
       }
    /**
     * my move forward method 
     * essentially prints off what happens as the hero makes their way through the dungeon
     * @param currP
     * @return not necessary but if its not broke don't fix it haha
     */
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
              System.out.println("an error has occurred");
              position++;
      }
        
        return position+1;
    }
    /**
     * my toString method returns the victory statement
    */
    public String toString(){
        String out="";
        out+= "The hero emerges victorius";
        return out;
    }
   
}
