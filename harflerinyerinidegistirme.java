
import java.util.Scanner;
//7.40
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class harflerinyerinidegistirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String txt = input.nextLine();
        int n = txt.length() / 2;
        for (int i = 0; i < n; i++) {

            System.out.println(txt.charAt(n + i));
            System.out.println(txt.charAt(n + 1 - i));
        }
    }

}
