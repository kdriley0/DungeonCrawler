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
    
    String name;
    int health;
    double attack;
    int pos;
    Hero(String n){
        name =n;
    }
    Hero()
    {
        
    }
    public String toString(){
        String out= name;
        return out;
        
    }
}
