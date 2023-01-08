
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class taskagıtmakas_oyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int kisi, pc;
        Random sayi = new Random();
        pc = sayi.nextInt(3) + 1;

        System.out.println("1.taş");
        System.out.println("2.kağıt");
        System.out.println("3.makas");
        System.out.print("Lütfen seçiminizi yapınız: ");
        kisi = input.nextInt();

        System.out.println("Bilgisayar: " + pc);
        if (kisi != 1 && kisi != 2 && kisi != 3) {
            System.out.println("Yanlış bir seçim yaptınız!");

        } else {

            if (pc == kisi) {
                System.out.println("Berabere");
            }
            if (pc == 1 && kisi == 2) {
                System.out.println("Siz kazandınız.");
            }
            if (pc == 1 && kisi == 3) {
                System.out.println("Bilgisayar kazandı.");
            }
            if (pc == 2 && kisi == 1) {
                System.out.println("Bilgisayar kazandı.");
            }
            if (pc == 2 && kisi == 3) {
                System.out.println("Siz kazandız.");
            }
            if (pc == 3 && kisi == 1) {
                System.out.println("Siz kazandınız.");
            }
            if (pc == 3 && kisi == 2) {
                System.out.println("Bilgisayar kazandı.");
            }

        }

    }

}
