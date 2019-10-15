/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan37.ratanilai.oop;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Trizky
 */
public class Mahasiswa {
    public int BanyakMhs;
    public int[] nilai; 

    
    
    public void masukNilai(){
        nilai= new int[BanyakMhs];
        for (int i = 0; i < BanyakMhs; i++) {
            
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" :");
            Scanner N = new Scanner(System.in);
            nilai[i]=N.nextInt();
        }
    }
    
    public double getSum(){
        return IntStream.of(nilai).sum();
    }
    public double getAvg(){
        return getSum()/BanyakMhs;
    }
    public void HasilHitung(){
        System.out.println("Maka, Rata-rata Nilainya adalah "+getAvg());
        
    }
}
