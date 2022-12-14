/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_n_Attribute;

// Static itu ialah sebuah variable yang diam dan dibsa ada di semuanya
// Nonstatic dpt berubah nilainya tergantung dari objeknya
class Display{
    static String type = "Display"; // Disharing semua nya
    private String name;
    
    Display(String name){
        this.name = name;
    }
    
    void setType(String typeInput){
        // Cara 1
//         type = typeInput;
         
        // Cara 2 
         this.type = typeInput;
         
        // Cara 3 (Rekomen)
        Display.type = typeInput;
    }
    
    void show(){
        System.out.println("Display name = "+this.name);
    }
}


public class Main {
    public static void main(String[] args) {
        Display d1 = new Display("Monitor");
        d1.show();
        
        Display d2 = new Display("Smartphone");
        d2.show();
        
        // Tampilkan static variable / class variable
        
        // Mencoba mengganti variable Staticnya
        d1.setType("Monitor");
        
        System.out.println("\nMenampilkan Static atau class Variable");
        System.out.println(d1.type);
        System.out.println(d2.type);
        System.out.println(Display.type); // maka class Display punya Attribute yaitu type
    }
}
