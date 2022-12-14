/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HP_HierarkiPackage;

import HP_Terminal_Example.Console;

// Visibility pada class ini adalah default
class Player {
    private String name;
    
    Player(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void show(){
//        System.out.println("Player Name : "+ this.name);
          Console.log("Menggunakan Console");
          Console.log("Player Name : "+ this.name);
    }
}
