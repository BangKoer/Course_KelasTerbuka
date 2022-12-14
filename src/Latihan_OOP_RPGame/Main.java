/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_OOP_RPGame;


//Player
class Player{
    String name;
    double health;
    int level;
    //obj Member
    Weapon weapon;
    Armor armor;
    
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    
    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " Attacking " + opponent.name + " with Power "+attackPower);
        
        opponent.defence(attackPower);
    }
    
    void defence(double attackPower){
        
        //akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " Get damage " + damage);
    }
    
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    
    void display(){
        System.out.println("\nName   : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        this.weapon.display();
        this.armor.display();
    }
}
    
//Weapon
class Weapon{
    double attackPower;
    String name;
    
    Weapon(String name, double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }
    
    void display(){
        System.out.println("Weapon : " + this.name + " , Power : " + this.attackPower);
    }
} 

//Armor
class Armor{
    double defencePower;
    String name;
    
    Armor(String name,double defencePower){
        this.defencePower = defencePower;
        this.name = name;
    }
    
    void display(){
        System.out.println("Armor : " + this.name + ", defence : " + this.defencePower);
    }
}


public class Main {
    public static void main(String[] args) {
        
        //Membuat objek Player
        Player p1 = new Player("Saya",100);
        Player p2 = new Player("Dia",100);
        
        //Membuat obj Weapon
        Weapon sword = new Weapon("Metal Sword",20);
        Weapon Bow = new Weapon("Metal Bow",25);
        
        //Membuat obj Armor
        Armor leather = new Armor("Leather",10);
        Armor Chainmail = new Armor("Chainmail",5);
        
        //Player 1
        p1.equipWeapon(sword);
        p1.equipArmor(leather);
        p1.display();
        
        //Player 2
        p2.equipWeapon(Bow);
        p2.equipArmor(Chainmail);
        p2.display();
        
        //Interaction
        System.out.println("\nEngagement");
        System.out.println("\nChapter - 1\n");
        p1.attack(p2);
        p1.display();
        p2.display();
        System.out.println("\nChapter - 2\n");
        p2.attack(p1);
        p1.display();
        p2.display();
    }
}
