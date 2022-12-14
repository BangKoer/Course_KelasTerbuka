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
public class Hero {
    String name = "Class Hero";
    
    void display(){
        System.out.println("Ini adalah "+this.name);
    }
    
    void dummyMethod(){
        System.out.println("Method ini ada di super-class");
    }
}
