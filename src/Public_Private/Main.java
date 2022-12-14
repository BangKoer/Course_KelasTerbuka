/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Public_Private;

class Player{
    String name; // Default, maka akan bisa di baca dan ditulis di luar class
    public int exp; // Public, maka sama sifatnya dengan default, bisa read n write diluar class
    private int health; // Private, maka hanya bisa dibaca dan ditulis didalam class saja
    
    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }
    
    //default modifier access
    void display(){
        tambahExp(); // Contoh akses private method
        System.out.println("\nName\t: "+ this.name);
        System.out.println("exp\t: "+ this.exp);
        System.out.println("Health\t: "+ this.health); //Membaca namun didalam class.
    }
    
    //Public
    public void ubahNama(String namaNew){
        this.name = namaNew;
    }
    
    //Private
    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Saya",0,50);
        
        //default = otomatis public
        System.out.println(p1.name); // Read data
        p1.name = "dia";     // Write data
        System.out.println(p1.name); // Read data
        
        //Public
        System.out.println(p1.exp); // Read data
        p1.exp = 100;     // Write data
        System.out.println(p1.exp); // Read data
        
//        //Private (tidak bisa di akses / error)
//        System.out.println(p1.health); // Read data
//        p1.health = 100;     // Write data
//        System.out.println(p1.health); // Read data

         // Method
         
         // Default
        p1.display();
        
         // Public
         p1.ubahNama("Kamu");
         p1.display();
         
//         // Private (Tidak bisa diakses)
//         p1.tambahExp();
        
    }
}
