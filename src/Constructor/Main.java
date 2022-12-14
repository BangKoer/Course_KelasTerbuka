/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

// class tanpa constructor 
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan Constructor (class yang pertama kali dipanggil ketika objek dibuat)
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    
    //Nama constructor harus sama dengan nama class
//    Mahasiswa(){
//        System.out.println("Ini adalah constructor");
//    }
    
    // Constructor dengan Parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        
        
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
        System.out.println("=======================");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa ("ucup","13390","T.informatika");
        Mahasiswa mhs2 = new Mahasiswa ("ucap","13391","T.informasi");



//        Polos objPolos = new Polos();
//        objPolos.dataString = "Polos";
//        objPolos.dataInteger = 0;
//        System.out.println(objPolos.dataInteger);
//        System.out.println(objPolos.dataString);
    }
   
}
