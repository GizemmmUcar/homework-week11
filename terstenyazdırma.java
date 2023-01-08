
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
public class terstenyazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String txt=input.nextLine();
        int n = txt.length();
        
        for (int i = n/2; i <= 1; i--) {
            System.out.println(txt.charAt(i));  
        }
        for (int i = n; i <= n/2+1 ; i--) {
            System.out.println(txt.charAt(i));
        }
        
        
                
        
    }
    
}
