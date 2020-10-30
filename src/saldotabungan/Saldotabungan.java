/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

/**
 *
 * @author Frda
 * KELAS : PBO 2
 * NIM : 10116415
 * Deskripsi 
 * program: program ini berisi program untuk menampilkan hasil
 * kelipatan angka 3,5 secara menaik
 
 */

import java.util.Scanner;
public class Saldotabungan {
    
static int saldoAkhir;
static Void hitung(int a, int b){
    saldoAkhir =  (a + (a*b/100));
    return null;
}

    public static void main(String[] args) {
        // TODO code application logic here
             
        int i = 1;
        int saldoAwal = 2500000;
        double bunga = 0.15;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " + saldoAwal);
            i++;
        } while (i<=6);
    }
    
}
