/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author praha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String str = s.replaceAll("[^0-9]", "");
        String str1 = s.replaceAll("[0-9A-Za-z]", "");
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Character> lst1 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            lst1.add(c);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((int) c >= 48 && (int) c <= 57) {
                int a = c - '0';
                lst.add(a);
            }
        }
        int sum = lst.get(0);
        for (int i = 0; i < lst1.size(); i++) {
            if (null != lst1.get(i)) {
                switch (lst1.get(i)) {
                    case '+':
                        sum += lst.get(i + 1);
                        break;
                    case '-':
                        sum -= lst.get(i + 1);
                        break;
                    case '*':
                        sum *= lst.get(i + 1);
                        break;
                    case '/':
                        sum /= lst.get(i + 1);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.print(lst + "\n" + lst1 + "\nSUM : " + sum);
    }

}
