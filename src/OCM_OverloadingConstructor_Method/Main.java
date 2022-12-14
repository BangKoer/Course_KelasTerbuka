/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCM_OverloadingConstructor_Method;


public class Main {
    public static void main(String[] args) {
        // Overloading pada Constructor
        Player p1 = new Player("Sage");
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player("Omen");
        
        p1.show();
        p2.show();
        p3.show();
        p4.show();
        
        // Overloading Method
        int a = mtk.tambah(2, 4);
        System.out.println(a);
        double b = mtk.tambah(5, 1.80);
        System.out.println(b);
    }
}
