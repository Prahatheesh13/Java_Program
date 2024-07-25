/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computestring;

/**
 *
 * @author praha
 */
import java.util.*;

public class ComputeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = Integer.parseInt(a);
        String res = "";
        res += (a.length() == 6) ? "C" : "W";
        res += (a.equals("0")) ? "Z" : (a.equals("1")) ? "O" : "";
        res += Prime(i) ? "P" : "N";
        res += SumDigit(i);
        res += (i % 2 == 0) ? "" + i / 2 : "" + (i - 1) / 2;
        System.out.println(res);
    }

    public static int SumDigit(int s) {
        while (s / 10 != 0) {
            int n = s;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }
            s = sum;
        }
        return s;
    }

    public static boolean Prime(int k) {
        boolean b[] = new boolean[k + 1];
        for (int i = 0; i < k + 1; i++) {
            b[i] = true;
        }
        int p = 2;
        while (p * p <= k) {
            if (b[p]) {
                for (int i = p * p; i <= k; i += p) {
                    b[p] = false;
                }
            }
            p += 1;
        }
        return b[k];
    }
}
