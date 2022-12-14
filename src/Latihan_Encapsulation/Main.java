/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_Encapsulation;

class Player{
    private String name;
    private int baseHP;
    private int baseAtk;
    private int Lvl;
    private int incrementHP;
    private int incrementAtk;
    private int totalDMG;
    private Armor armor;
    private Weapon weapon;
    private boolean isAlive;
    
    
    
    // Obj Member
    public Player(String name){
        this.name = name;
        this.baseHP = 100;
        this.baseAtk = 100;
        this.Lvl = 1;
        this.incrementHP = 20;
        this.incrementAtk = 40;
        this.isAlive = true;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHP(){
        return this.maxHP() - this.totalDMG;
    }
    
    public void display(){
        System.out.println("Player\t\t: "+this.name);
        System.out.println("Level\t\t: "+this.Lvl);
        System.out.println("Health\t\t: "+this.getHP()+"/"+this.maxHP());
        System.out.println("Attack\t\t: "+this.getAtkPower());
        System.out.println("Status\t\t: "+this.isAlive +"\n");
    }
    
    public void attack(Player opponent){
        // Hitung DMG
        int damage = this.getAtkPower();
        
        // Print event
        System.out.println(this.name+" is Attacking "+ opponent.getName()+ " with DMG " + damage);
        // Attack opponent
        opponent.defence(damage);
        
        this.LvlUP();
    }
        
    public void defence(int damage){
        // Receive DMG
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;
        System.out.println(this.name + " Defence Power = " + defencePower);
        if(damage > defencePower){
           deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        System.out.println("Damage Earned = " + deltaDamage + "\n");
        // Adding Total DMG
        this.totalDMG += deltaDamage;
        
        // Check IsAlive
        if(this.getHP() <= 0){
            this.isAlive = false;
            this.totalDMG = this.maxHP();
        }
        
        this.display();
    }
        
    
    private void LvlUP(){
        this.Lvl++;
    }
    
    public void setArmor(Armor armor){
        this.armor = armor;
    }
    
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public int maxHP(){
        return this.baseHP +this.Lvl*this.incrementHP+ this.armor.getAddHealth();
    }
    
    private int getAtkPower(){
        return this.baseAtk + this.Lvl*this.incrementAtk + this.weapon.getAtk();
    }
}

class Weapon{
    private String name;
    private int Atk;
    
    public Weapon(String name, int Atk){
        this.name = name;
        this.Atk = Atk;
    }
    
    public int getAtk(){
        return this.Atk;
    }
}

class Armor{
    private String name;
    private int Strength;
    private int health;
    
    public Armor(String name, int strength , int HP){
        this.name = name;
        this.Strength = strength;
        this.health = HP;
    }
    
    public int getAddHealth(){
        return this.Strength*2 + this.health;
    }
    
    public int getDefencePower(){
        return this.Strength*2;
    }
}



public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Sage");
        Armor a1 = new Armor("Besi",5,80);
        Weapon w1 = new Weapon("Pedang",30);
        p1.setArmor(a1);
        p1.setWeapon(w1);
        
        Player p2 = new Player("Omen");
        Armor a2 = new Armor("Kaen",8,100);
        Weapon w2 = new Weapon("Bow",100);
        p2.setArmor(a2);
        p2.setWeapon(w2);
        
        p1.display();
        p2.display();
        p1.attack(p2);
        p2.attack(p1);
    }
}
