/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClass_Inheritance;

/**
 *
 * @author Lenovo V14
 */

// this.name akan mengkakses att jika ada di class ini
// jika tidak ada maka akan mengakses att superclass

// super.name akan selalu mengakses att superclass
public class HeroSTR extends Hero {
    String name = "Class Strength";
    
    @Override
    void display(){
        System.out.println("Ini adalah "+this.name);
        this.dummyMethod();
    }
    
    void displaySuper(){
        System.out.println("Ini adalah "+super.name);
        super.dummyMethod();
    }
    
    void dummyMethod(){
        System.out.println("Method ini ada di Sub-class");
    }

}
