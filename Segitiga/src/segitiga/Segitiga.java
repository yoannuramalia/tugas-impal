/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author Yoan Nur Amalia
 */
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Masukan Panjang Sisi A : ");
        a = input.nextInt();
        System.out.print("Masukan Panjang Sisi B : ");
        b = input.nextInt();
        System.out.print("Masukan Panjang Sisi C : ");
        c = input.nextInt();

        System.out.println();

        if ((c * c) == (b * b) + (a * a)) {
            if ((a == b) || (a == c)) {
                System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Siku Siku");
            }
        } else if ((b * b) == (c * c) + (a * a)) {
            if ((a == b) || (a == c)) {
                System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Siku Siku");
            }
        } else if ((a * a) == (c * c) + (b * b)) {
            if ((a == b) || (a == c)) {
                System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Siku Siku");
            }
        } else if ((a == b) && (b == c)) {
            System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Sama Sisi");
        } else if ((a == b) || (a == c)) {
            System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Sama Kaki");
        } else {
            System.out.println("Segitiga dengan Panjang Sisi A :" + a + ", Sisi B : " + b + ", Sisi C : " + c + " termasuk Segitiga Sembarang");
        }
    }
}