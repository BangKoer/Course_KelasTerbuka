/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;
    // Encapsulasi = memberi suatu batasan akses pada class

class Data{
    public int intPub;
    private int intPrv;
    private double doubPrv;
    
    public Data(){
        this.intPrv = 10;
        this.intPub = 0;
    }
    
    // GETTER
    public int getIntPrv(){
        return this.intPrv;
    }
    
    // SETTER
    public void setDoubPrv(double value){
        this.doubPrv = value;
    }
}

class Lingkaran{
    private double diameter;
    
    Lingkaran(double diameter){
        this.diameter = diameter;
    }
    
    //Setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }
    
    //Getter
    public double getJari2(){
        return this.diameter/2;
    }
    
    //Getter2
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}

public class Main {
    public static void main(String[] args) {
        Data obj = new Data();
        //Read n Write with Public
        obj.intPub = 5; //Write
        System.out.println("Public : "+obj.intPub); //Read
        
        //Read only (with GETTER)
         obj.getIntPrv(); 
         int angka = obj.getIntPrv();
         System.out.println("Getter : "+ angka);
         
        //Write Only (with SETTER) 
        obj.setDoubPrv(0.12);
        
        //Read n Write (with SETTER GETTER)
        Lingkaran obj2 = new Lingkaran (5);
        System.out.println("Jari2 : "+obj2.getJari2());
        obj2.setJari2(18);
        System.out.println("Jari2 : "+obj2.getJari2());
        System.out.println("Luas : "+obj2.getLuas());
        
    }
}
 