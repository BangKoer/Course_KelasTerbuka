/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCM_OverloadingConstructor_Method;

/**
 *
 * @author Lenovo V14
 */
public class Player {
    private String name;
    private static int JmlPlayer;
    
    // Overloading Constructor
    // opsi 1
    Player(String name){
        Player.JmlPlayer++;
        this.name = name;
    }
    
    // opsi 2
    Player(){
        Player.JmlPlayer++;
        this.name = "Player" + Player.JmlPlayer;
    }
    
    void show(){
        System.out.println("Name : "+this.name);
    }
}
