/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author kevinn riley on 11/16/18
 * to house my player object 
 */
public class Hero {
    
   public String name;
    public int health;
   public double attack;
    public int pos;
   public Hero(String n){
        name =n;
    }
    
    public String toString(){
        String out= name;
        return out;
        
    }
}
