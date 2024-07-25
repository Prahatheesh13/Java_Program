/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

/**
 *
 * @author praha
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (Prime(a[i])) {
                arr.add(a[i]);
                if (min > a[i]) {
                    min = a[i];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        sum -= 2 * min;
        System.out.println(sum);
    }

    public static boolean Prime(int n) {
        boolean b[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            b[i] = true;
        }
        int p = 2;
        while (p * p <= n) {
            if (b[p]) {
                for (int i = p * p; i <= n; i += p) {
                    b[i] = false;
                }
            }
        }
        return b[n];
    }
}
