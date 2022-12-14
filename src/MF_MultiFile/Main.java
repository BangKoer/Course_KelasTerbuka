/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MF_MultiFile;

// Keyword import untuk package eksternal
// import namaPackage.namaClass
import MF_Terminal_Example.Console;

public class Main {
    public static void main(String[] args) {
        // Jika Class dalam package yang sama. bisa gunakan ini
        Player p1 = new Player("Sage");
        Player p2 = new Player("Omen");
        Player p3 = new Player("Chamber");
        p1.show();
        p2.show();
        p3.show();
        
        // Jika beda Package, gunakan ini yang sebelumnya mengimport terlebih dahulu.
        // Manggil class Console dari package lain
        Console.log("Hallo");
        Console.log("hi !");
    }
}
