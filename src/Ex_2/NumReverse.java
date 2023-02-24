//Напишите метод, который принимает число, которое не содержит нулей и возвращает цифры в
//        обратном порядке.
//        Например, на вход: 789 на выход: 987

package Ex_2;

import java.util.Scanner;

public class NumReverse {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціле число : ");
        String strNumber = in.nextLine();

        int num = Integer.parseInt(strNumber);

        if (strNumber.contains("0")) {
            System.out.println("Число содержит нули");
        } else {
            System.out.println("Число не содержит нулей");
            System.out.println("Число в обратном порядке будет выглядеть так: " + numReverse(num));
        }



//        Чтобы развернуть число в обратном порядке, можно использовать алгоритм, основанный на остатке от деления и делении нацело.
//        Можно использовать цикл, который будет извлекать
//        последнюю цифру числа, добавлять ее к результату и удалять ее из числа путем деления нацело на 10.
//        Затем цикл повторяется, пока число не станет равным 0.
    }
    public static int numReverse(int num) {
        int reversed = 0;
       while (num != 0) {
           int digit = num % 10;
           reversed = reversed * 10 + digit;
           num /= 10;
       }
       return reversed;
    }
}
