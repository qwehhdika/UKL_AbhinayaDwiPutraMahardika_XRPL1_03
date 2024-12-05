/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ukl1;

/**
 *
 * @author User
 */
public class UKL1 {

    public static void main(String[] args) {
        for (int i = 50; i > 0; i--) {
            if (i == 1) {
                System.out.println(i+". saya senang");
            } else if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }        
    }
}
