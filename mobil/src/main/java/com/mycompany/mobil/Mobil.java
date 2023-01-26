/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mobil;

/**
 *
 * @author nurfadila
 */
public class Mobil {
    // Menyiapkan objek
    String warna = "merah";
    String merk = "Porsche";
    int tahun = 2010;
    
    // Menyiapkan method
    void diam() {
        System.out.println("Mobil "+merk+" warna "+warna+" sedang diam");
    }
    
    void maju() {
        System.out.println("Mobil "+merk+" warna "+warna+" sudah maju");
    }
    
    void tahun() {
        System.out.println("Mobil itu keluaran tahun "+tahun);
    }
    public static void main(String[] args) {
        // Membuat objek
        // class namaObjek = new class();
        Mobil mobilPorsche = new Mobil();
        
        // Memanggil method
        // namaObjek.method();
        mobilPorsche.diam();
        mobilPorsche.maju();
        mobilPorsche.tahun();
    }
}
