
import java.util.Scanner;
//7.29
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class harflerin_buyukluklerinin_tersi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Kelime: ");
        String txt=input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i)>=65 && txt.charAt(i)<=90) {
                System.out.print(Character.toUpperCase(txt.charAt(i)+32));    
            }
            else{
                System.out.print(Character.toLowerCase(txt.charAt(i)-32));
            }
            
        }
    }
    
}
