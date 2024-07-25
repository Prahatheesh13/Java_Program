/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;

/**
 *
 * @author praha
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        String str2 = sc.next();
        computeString(str, str1, str2);
    }

    static void computeString(String a, String b, String c) {
        System.out.println(Split(a)[0] + Split(b)[1] + Split(c)[2]);
        System.out.println(Split(a)[1] + Split(b)[2] + Split(c)[0]);
        System.out.println(toggleCase((Split(a)[2] + Split(b)[0] + Split(c)[1])));
    }

    static String toggleCase(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                r += (char) (int) ((s.charAt(i)) - 32);
            } else {
                r += (char) (int) ((s.charAt(i)) + 32);
            }
        }
        return r;
    }

    static String[] Split(String s) {
        String out[] = new String[3];
        int n = s.length() / 3;
        if (s.length() % 3 == 0) {
            out[0] = s.substring(0, n);
            out[1] = s.substring(n, 2 * n);
            out[2] = s.substring(2 * n);
        } else {
            if (s.length() % 3 == 2) {
                out[0] = s.substring(0, n + 1);
                out[1] = s.substring(n + 1, s.length() - (n + 1));
                out[2] = s.substring(s.length() - (n + 1));
            } else {
                out[0] = s.substring(0, n);
                out[1] = s.substring(n, s.length() - n);
                out[2] = s.substring(s.length() - n);
            }
        }
        return out;
    }

}
