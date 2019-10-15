/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan37.ratanilai.oop;

import java.util.Scanner;

/**
 *
 * @author Trizky
 */
public class PBO210118080Latihan37RataNilaiOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        Scanner banyak = new Scanner(System.in);
        mhs.BanyakMhs=banyak.nextInt();
        mhs.masukNilai();
        System.out.println("");
        mhs.HasilHitung();
        System.out.println("Developed By : Taufiq Rizky");
    }
    
}
