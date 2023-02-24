//Создайте программу, которая выводит в консоль число даты. Например, на вход 02/11/1995 = 0 +
//        2 + 1 + 1 + 1 + 9 + 9 + 5 = 28 на выход = 28

package Ex_4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> numOfDate = new HashMap<>();
        numOfDate.put('1', 1);
        numOfDate.put('2', 2);
        numOfDate.put('3', 3);
        numOfDate.put('4', 4);
        numOfDate.put('5', 5);
        numOfDate.put('6', 6);
        numOfDate.put('7', 7);
        numOfDate.put('8', 8);
        numOfDate.put('9', 9);
        numOfDate.put('0', 0);

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть дату : ");
        String date = in.nextLine();

        int sum = 0;
        for (int i = 0; i < date.length(); i++) {
            char a = date.charAt(i);
            if (numOfDate.containsKey(a)) {
                sum = numOfDate.get(a) + sum;
            }
        }
        System.out.println("Сума числа дати дорівнює: " + sum);
    }



    }

