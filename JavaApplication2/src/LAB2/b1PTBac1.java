/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;
import java.util.Scanner;
/**
 *
 * @author bg2kt
 */

import java.util.Scanner;
public class b1PTBac1 {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a=sc.nextFloat();
        System.out.println("Nhap he so b: ");
        b = sc.nextFloat();
        if (a==0) {
            if (b==0) {
                System.out.println("PT vo so nghiem");
            }
            else{
                System.out.println("PT vo nghiem");
            }
        }
        else{
            float result = -b/a;
            System.out.println("Phuong trinh co nghiem la: " + result);
        }
    }
}
