/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding_Method_Inheritance;

// sesuatu yang diwariskan dari Super-Class dapat dimodifikasi oleh Sub-Class
// Method calls in Inheritance
/* ketika memanggil method pada suatu class, maka akan dicari terlebih dahulu 
   pada class yang dipanggil (misal disini ialah HeroSTR), jika di class tersebut
   tidak ada method yang dicari maka, akan dicari kembali pada class si sang pewaris
   (Misal disini ialah Hero), jika ada maka barulah method tersebut dipanggil */

/* Dalam Program ini, Method yang di Override ialah display, jika pada class HeroSTR tdk
   terdapat method display maka, method yang diambil ialah method dari sang pewaris, yaitu class Hero*/

// Override prioritasnya ialah Sub-Class = Priotiras 1, Super-Class = Prioritas 2, dst.

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "Sova";
        h1.display();
        
        HeroSTR h2 = new HeroSTR();
        h2.name = "Sage";
        h2.defPower = 111;
        h2.display();
    }
}
