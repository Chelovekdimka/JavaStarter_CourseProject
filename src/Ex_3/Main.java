//Создайте программу, которая выводит в консоль число имени, например, на вход Roman = R(18) +
//        О(15) + M(13) + A(1) + N(14) = 61 на выход 61.

package Ex_3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> serialNumInAlphabet = new HashMap<>();
        serialNumInAlphabet.put('A', 1);
        serialNumInAlphabet.put('B', 2);
        serialNumInAlphabet.put('C', 3);
        serialNumInAlphabet.put('D', 4);
        serialNumInAlphabet.put('E', 5);
        serialNumInAlphabet.put('F', 6);
        serialNumInAlphabet.put('G', 7);
        serialNumInAlphabet.put('H', 8);
        serialNumInAlphabet.put('I', 9);
        serialNumInAlphabet.put('J', 10);
        serialNumInAlphabet.put('K', 11);
        serialNumInAlphabet.put('L', 12);
        serialNumInAlphabet.put('M', 13);
        serialNumInAlphabet.put('N', 14);
        serialNumInAlphabet.put('O', 15);
        serialNumInAlphabet.put('P', 16);
        serialNumInAlphabet.put('Q', 17);
        serialNumInAlphabet.put('R', 18);
        serialNumInAlphabet.put('S', 19);
        serialNumInAlphabet.put('T', 20);
        serialNumInAlphabet.put('U', 21);
        serialNumInAlphabet.put('V', 22);
        serialNumInAlphabet.put('W', 23);
        serialNumInAlphabet.put('X', 24);
        serialNumInAlphabet.put('Y', 25);
        serialNumInAlphabet.put('Z', 26);

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть великими літерами ім'я на англ мові : ");
        String name = in.nextLine();

        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            if (serialNumInAlphabet.containsKey(a)) {
                sum = serialNumInAlphabet.get(a) + sum;
            }
        }
        System.out.println("Число им'я дорівнює: " + sum);
    }
}
