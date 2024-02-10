/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mükemmel_sayı;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Mükemmel_Sayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayı,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayı = input.nextInt();
        for(int i=1;i<sayı;i++){
            if(sayı%i==0){
                toplam+= i;
            }
        }if(toplam==sayı){
            System.out.println("Girilen sayı mükemmeldir");
        }else{
            System.out.println("Girilen sayı mükemmel değildir");
        }
    }
    
}
