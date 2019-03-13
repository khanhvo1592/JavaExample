
package helloworld;
import java.util.Scanner;
public class demoCanbac2 {
    public static void main(String[] args) {
        int a;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        a = Sc.nextInt();
        if (a>0){
            System.out.println("Can bac 2 la: " + Math.sqrt(a)); 
        } 
        else{
            System.out.println("Ban nhap so am!");
        }
    }
}
