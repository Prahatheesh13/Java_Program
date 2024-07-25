/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4;

/**
 *
 * @author praha
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        char ch = 'a';
        char res[] = new char[n];
        int ind = 0;
        for (int j = 0; j < a.length; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (!arr.contains(a[i]) && min > a[i]) {
                    min = a[i];
                    ind = i;
                }
            }
            res[ind] = ch++;
            arr.add(a[ind]);
            System.out.println(Arrays.toString(res));
        }

    }

}
