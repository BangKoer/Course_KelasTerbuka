/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClass_Inheritance;


public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        HeroSTR h2 = new HeroSTR();
        
        h1.display();
        h2.display();
        h2.displaySuper();
    }
}
