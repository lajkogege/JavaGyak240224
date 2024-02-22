/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feladatok;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class Gyakorlas {
   static Random rnd = new Random();
   static Scanner sc= new Scanner(System.in);
   
    public static void main(String[] args) {
        int max=10;
        int min=3;
        int veletlenSzam = rnd.nextInt(max - min + 1) + min;
        System.out.println("Véletlen szám generlásása 3 és 10 között: "+veletlenSzam);
        
        System.out.print("Kérek egy betűt: ");
        String bekerBetu = sc.nextLine();
        while ( bekerBetu.length() != 1) {
            System.out.println("Nem egy karaktert adtál meg!");
           System.out.print("Kérek egy karaktert: ");
           bekerBetu = sc.nextLine();
        }
        // veszővel elválasztva legyen
        for (int i = 0; i < veletlenSzam-1; i++) {
             System.out.print(bekerBetu +",");
        }
        System.out.println(bekerBetu );
        
        double [] tomb = new double[5];
        tomb[0]= Math.PI;
        tomb[1]=Math.E;
        tomb[2]=1/3;
        for (int j = 0; j < 1; j++) {
                System.out.println(tomb[0]);
                System.out.println(tomb[1]);
        }
        System.out.println("  ");
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] >0) {
                System.out.println(tomb[i]);
            }  
        }
        
        double minSzam=10.1;
        double maxSzam=19.5;
        for (int i = 0; i <tomb.length; i++) {
            if(tomb[i] ==0){
                double generaltSzam= rnd.nextDouble(maxSzam - minSzam +1)+ minSzam;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
        
    }
    
}
