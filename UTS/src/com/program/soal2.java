package com.program;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tinggi_sgt,i,j,k;

        System.out.print("masukkan tinggi segitigas :");
        tinggi_sgt=input.nextInt();
        System.out.println("");

        for(i = tinggi_sgt; i >= 1; i--){
            
            for(j=1; j<=tinggi_sgt-i; j++){
                System.out.print(" ");}
                
            for(k = 1; k<=i; k++){
                System.out.print(" *");}

            System.out.println(); 
        }

        for(i = 1; i <= tinggi_sgt; i++){
            
            for(j=1; j<=tinggi_sgt-i; j++){
                System.out.print(" ");}

            for(k = 1; k<=i; k++){
                System.out.print(" *");}

            System.out.println(); 
        }           
        


    }
}
