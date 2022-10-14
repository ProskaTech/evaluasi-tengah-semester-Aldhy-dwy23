package com.program;

import javax.swing.JOptionPane;

public class soal3 {
        public static void main(String[] args) {
            
            String nilai = JOptionPane.showInputDialog("masukkan nilai  : ");
            int num = Integer.parseInt(nilai);
    
    if(num>0){
            JOptionPane.showMessageDialog(null,num+" adalah bilangan positif");}

            else{
            JOptionPane.showMessageDialog(null,num+" adalah bilangan negatif");}
        }
}
