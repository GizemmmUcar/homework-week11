
import java.util.Scanner;
//7.35
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class seslisessizharf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int txt;
        String k, txt1 = "", txt2 = "";
        char sesli[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Küçük harflerle bir kelime giriniz:");
        k = input.nextLine();
        for (int i = 0; i < k.length(); i++) {
            txt = 0;

            for (int j = 0; j < 5; j++) {
                if (k.charAt(i) == sesli[j]) {
                    txt = 1;
                    break;

                }
                if (txt == 1) {
                    txt1 += k.charAt(i);

                } else {
                    txt2 += k.charAt(i);
                }

            }

        }

        System.out.println("Sesli harflerden oluşan kelime:" + txt1);
        System.out.println("Sessiz harflerden oluşan kelime:" + txt2);

    }

}
