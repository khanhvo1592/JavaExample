/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author bg2kt
 */
public class b2PTB2 {
    public static float giaiPTBac1(float a, float b){
        float result = -b/a;
        return result;
    }
        public static void main(String[] args) {
            float a,b,c;
            Scanner sc = new  Scanner(System.in);
            //Nhap du lieu
            System.out.println("Nhap a: ");
            a = sc.nextFloat();
            
            System.out.println("Nhap b: ");
            b = sc.nextFloat();
            
            System.out.println("Nhap c: ");
            c = sc.nextFloat();
            
            if (a==0) {
               float result;
                result = giaiPTBac1(b,c);
                System.out.println("Phuong trinh co nghiem la x = " + result);
            }
            else{
                float delta;
                delta = b*b - 4*a*c;
                if(delta<0){
                    System.out.println("Phuong trinh da cho vo nghiem! ");
                }
                else if (delta == 0){
                    float x;
                    x = -b/(2*a);
                    System.out.println("Phuong trinh co nghiem kep: x = " + x);
                }
                else{
                   float x1,x2 ;
                   x1 =  (float) (-b+sqrt(delta))/(a*2);
                      x2= (float) (-b-sqrt(delta))/(a*2);
                    System.out.println("Phuong trinh co 2 nghiem: ");
                    System.out.println("x1 = " + x1 );
                    System.out.println("x2 = " + x2);
                }
            }
}
}
