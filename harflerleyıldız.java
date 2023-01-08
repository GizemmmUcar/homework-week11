
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class harflerleyıldız {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.print("Lütfen büyük harflere bir kelime giriniz:");
        String txt=input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i)+"->");
            for (int j = 0; j < txt.charAt(i)-64; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
