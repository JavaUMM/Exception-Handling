/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import java.util.Scanner;

/**
 *
 * @author Muhammad Fikri
 */
public class DaftarBuku {
    private static Scanner input = new Scanner(System.in);;
    public static void main(String [] args){
        KelolaBuku x = new KelolaBuku();
        String[] type_buku = new String[2];
        String[] judul_buku = new String[2];
        int[] jumlah_hal = new int [2];
        try {
            for(int i = 0; 0 >= 0; i++){
                System.out.print("Masukkan type buku : ");
                type_buku[i] = input.next();
                x.getType_buku();
                System.out.print("Masukkan judul buku : ");
                judul_buku[i] = input.next();
                x.getJudul_buku();
                System.out.print("Masukkan jumlah hal : ");
                jumlah_hal[i] = input.nextInt();
                x.getJumlah_hal();
                System.out.println();
            }
        } 
        catch(java.util.InputMismatchException a){
            System.out.println("Masukkan Tipe Integer (Angka)");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hanya dapat menyimpan 2 judul buku");
        }
        System.out.println("\nBuku yang tersimpan ");
        for(int i = 0; i <= type_buku.length || i <= judul_buku.length || i <= jumlah_hal.length; i++ ){
            System.out.println("type buku : "+type_buku[i]);
            System.out.println("judul buku : "+judul_buku[i]);
            System.out.println("jumlah halaman : "+jumlah_hal[i]);
            System.out.println();
        }
    }    
}
