/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HP_HierarkiPackage;

// Tentang Visibility
// jika menggunakan Default sebelum class, maka class tersebut hanya bisa visible ke sesama class yg sama package
// jika meggunakan Public sebelum class, maka class tersebut akan visible ke semua class, walaupun beda package.

// ini akan mengimport class Console
import HP_Terminal_Example.Console;

// mengimport static method dari class Console
import static HP_Terminal_Example.Console.log;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Sage");
        p1.show();
        
        Console.log("Menampilkan Data Dengan HP_Terminal_Example.Console");
        Console.log(p1.getName());
        System.out.println();
        log("Menampilkan Data dengan log saja");
        log(p1.getName());
        

    }
}



