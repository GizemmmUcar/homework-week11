
import java.util.Random;
import java.util.Scanner;
//7.28
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class harfleri_rastgelebuyutme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String txt = input.nextLine();
        Random rastgele = new Random();

        for (int i = 0; i < txt.length(); i++) {
            int randomsayi =  rastgele.nextInt(txt.length());
           
            if (randomsayi % 2 == 1) {
             
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
        }
    }

}

