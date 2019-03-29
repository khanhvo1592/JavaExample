/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;
import static java.lang.Math.sqrt;
import java.util.Scanner;


/**
 *
 * @author bg2kt
 */
public class bai4PhuongTrinhBac2 {
     public static void main(String[] args) {
        float a = 0,b,c;
        float delta;
        float x1 = 0, x2;
        Scanner sc = new Scanner(System.in);
        
       //nhap du lieu a b c dam bao a =! 0
   do{
       System.out.println("Nhap a = ");  a = sc.nextFloat();
       System.out.println("Nhap b = ");  b = sc.nextFloat();
       System.out.println("Nhap c = ");  c = sc.nextFloat();
   }
   while (a==0);
   delta = b*b - 4*a*c;
   x1=  (float) (-b+sqrt(delta))/(a*2);
   x2= (float) (-b-sqrt(delta))/(a*2);
   if (delta<0){
       System.out.println("Phuong trinh vo nghiem: ");
   } else if (delta ==0){
       System.out.println("Phuong trinh da cho co nghiem kep: x1=x2= " +x1);
   } else {
       System.out.println("Phuong trinh da cho co 2 nghiem x1 = " + x1 + " x2 = " + x2);
   }
   
      
        
        }
  }


