/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_n_Method;
// Sesuatu yang berhubungan dengan static maka akan slalu "nempel" pada class nya

import java.util.ArrayList;

class Player{
    
     private static int sumPlayer;
     private static ArrayList<String> nameList = new ArrayList<String>();
     
     private String name;
     
     Player(String name){
         this.name = name;
         Player.sumPlayer++;
         Player.nameList.add(this.name);
     }
     
     void show(){
         System.out.println("Player Name : "+this.name);
     }
     
     // static method
     static void showsumPlayer(){
         System.out.println("Number of Player = "+Player.sumPlayer);
     }
     
     static ArrayList<String> getName(){
         return Player.nameList;
     }
}

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Sage");
        Player p2 = new Player("Omen");
        Player p3 = new Player("Chamber");
        Player p4 = new Player("Sova");

        
        
        Player.showsumPlayer();
        System.out.println("Names = "+Player.getName());
//        System.out.println("Names = "+p1.getName()); // Bisa namun tidak direkomendasikan
    }
}
