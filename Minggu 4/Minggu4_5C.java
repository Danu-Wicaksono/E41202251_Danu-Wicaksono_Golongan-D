/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_5c;

import java.util.Scanner;

/**
 *
 * @author Danu Wicaksono
 */
public class Minggu4_5C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int jumlah = 0, banyak;
        float average;

        Scanner data_nilai= new Scanner(System.in);

        System.out.print("Masukkan banyaknya data nilai = ");
        banyak = data_nilai.nextInt();
        int data[] = new int[banyak];

        //input
        for (int i = 0; i < banyak; i++){
            System.out.print("Masukkan data nilai ke-" + (i+1) + " = ");
            data[i] = data_nilai.nextInt();
        }
        System.out.println("");

        
        int dataMax = data[0];
        int dataMin = data[0];
        
        //Nilai Max
        for (int i = 0; i < banyak; i++){
            if (data[i] > dataMax){
                dataMax = data[i];
               
                //Nilai Min
            }else if(data[i] < dataMin){
                dataMin = data[i];
            }
        }
        System.out.println("Nilai minimum = " + dataMin);
        System.out.println("Nilai maximum = " + dataMax);

        //Rata-rata
        for (int i = 0; i < banyak; i++){
            jumlah += data[i];
        }
        average = jumlah / banyak;
        System.out.println("Nilai rata ratanya adalah = " + average);
  
    }
    
}
