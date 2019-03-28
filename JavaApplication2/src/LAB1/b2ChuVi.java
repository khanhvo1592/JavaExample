/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author bg2kt
 */
public class b2ChuVi {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: "); float a = scanner.nextFloat();
        System.out.print("Nhap chieu dai: "); float b = scanner.nextFloat();
        float cv = (a+b)*2;
        float dt = a*b;
        System.out.println("Chu vi hinh chu nhat: " + cv);
        System.out.println("Dien tich la: "+ dt);
        System.out.println("Canh nho nhat la: " + Math.min(a, b));
        
    }

}
