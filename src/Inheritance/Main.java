/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

// Inheritance adalah hubungan is-a

// Super-Class
//class Hero{
//    String name;
//    
//    void display(){
//        System.out.println("Name : "+this.name);
//    }
//}

// HeroStrength is-a Hero, maka akan mengambil attribute dari Super-Class
// Sub-Class
//class HeroStrength extends Hero{
//    
//}

// Sub-Class
//class HeroIntell extends Hero{
//    
//}

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "Sage";
        h1.display();
        
        HeroStrength h2 = new HeroStrength();
        h2.name = "Omen";
        h2.display();
        
        HeroIntell h3 = new HeroIntell();
        h3.name = "Chamber";
        h3.display();
    }
}
