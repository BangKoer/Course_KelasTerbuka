/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

class Mahasiswa{
    String nama;
    String NIM;
    
    //constructor (method khusus yang akan dipanggil saat objek ini dibuat)
    Mahasiswa(String inputNama, String inputNIM){
        // this disini mengacu pada classnya (mahasiswa) / obj , jd akan sama outputnya dengan system.out.println(mahasiswa.nama) di psvm
        this.nama = inputNama;
        this.NIM = inputNIM;
    }
    
    // method tanpa return dan tanpa parameter
    void display(){
        System.out.println("Nama : "+this.nama);
        System.out.println("NIM  : "+this.NIM);
    }
    
    // method tanpa return dgn parameter
    void setNama(String nama){
        this.nama = nama;
    }
    
    // method dgn return tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    
    // method dgn return dan parameter
    String sayHi(String msg){
        return msg + "juga, nama saya adalah " + this.nama;
    }
} 

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("ucup","133325");
        // method
        m1.display();
        
        m1.setNama("tutung");
        m1.display();
        
        System.out.println(m1.getNama());
        System.out.println(m1.getNIM());
        
        String data = m1.sayHi("halo ");
        System.out.println(data);
    }
    
}
