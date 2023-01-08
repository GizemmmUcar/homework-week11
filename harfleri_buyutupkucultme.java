
import java.util.Scanner;
//7.30
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class harfleri_buyutupkucultme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen küçük harflere bir kelime giriniz:");
        String txt=input.nextLine();
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            double r=sayac%4;
            if (r<2) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            else{
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
        sayac++;
         System.out.print(txt.charAt(i));
        }
       
    }
    
}
