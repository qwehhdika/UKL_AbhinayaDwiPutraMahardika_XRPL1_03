/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;

/**
 *
 * @author User
 */
public class UKL2 {

    public static void main(String[] args) {
        int tabungan= 100000;
        int total=0;
        for(int bul=1;bul<=12;bul++){
                System.out.println("Tabungan Bulan Ke-"+bul+": Rp. "+tabungan);
                total+=tabungan;
                tabungan+=50000;
        }
        System.out.println("Total uang tabungan adalah : Rp. "+total);
    }
}