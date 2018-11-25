/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author kevin on 11/16/18
 * to hold my monster class
 * 
 * all it does is hold the monster name and 
 * a to string class to return it 
 * 
 * same as the hero class 
 * I had much bigger ideas which I may still implement
 */
public class Monster {
    String name;
    int hp;
    double damage;
    Monster(int hp){
        
    }
    Monster(){
        this.name="The Diabolical Bane Snake"; 
    }
    public String toString(){
        String out="";
        out+=this.name;
        return out;
    }
        
}
