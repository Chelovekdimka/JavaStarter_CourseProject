//Напишите метод, который принимает число и возвращает сумму цифр данного числа

package Ex_1;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціле число : ");
        int num = in.nextInt();

        System.out.println("Сума цифр даного числа: " + sumDigits(num));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
