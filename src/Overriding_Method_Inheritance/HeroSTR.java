/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding_Method_Inheritance;

/**
 *
 * @author Lenovo V14
 */
public class HeroSTR extends Hero {
    double defPower;
    
    @Override
    void display(){
        System.out.println("\nHero STR");
        System.out.println("Hero Name : "+ this.name);
        System.out.println("DEF : "+this.defPower);
    }
}
