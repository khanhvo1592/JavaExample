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
public class tinhTheTich {
    public static void main(String[] args) {
       double canh = 0;
       Scanner sCanh = new Scanner(System.in);
       System.out.println("Nhap do dai canh: ");
        try {
            canh = sCanh.nextDouble();
        } catch (Exception e) {
            System.out.print("Vui long nhap so");
        }
        System.out.println("The tich la:   " +  Math.pow(canh, 3));
    }
}
