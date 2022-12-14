/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HP_Terminal_Example;

//  Visibility public
public class Console {
    // Karena Static maka ia akan nempel ke Class nya
    public static void log(String message){
        System.out.println(message);
    }
}

// ini hanya akan bisa diakses dari HP_Terminal_Example.Terminal
class Terminal {
        public static void log(String message){
        System.out.println(message);
    }
}
