/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_N_Object;


class Mahasiswa {
    String Nama;
    String Nim;
    String Jurusan;
    double IPK;
    int Umur;
}

public class Main {
    public static void main(String[] args) {
        // Instantiasi / membuat objek
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.Nama = "Miftahul Khair";
        mhs1.Nim = "210605110024";
        mhs1.Jurusan = "T.Informatika";
        mhs1.IPK = 3.5;
        mhs1.Umur = 19;
        
        System.out.println(mhs1.Nama);
        System.out.println(mhs1.Nim);
        System.out.println(mhs1.Jurusan);
        System.out.println(mhs1.IPK);
        System.out.println(mhs1.Umur);
    }
    
}
