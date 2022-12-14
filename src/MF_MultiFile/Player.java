/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MF_MultiFile;


class Player{
    private String name;
    
    Player(String name){
        this.name = name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    void show(){
        System.out.println("Player Name = "+this.name);
    }
}
