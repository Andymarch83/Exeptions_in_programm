package home_2;
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        float number = interFloat();
    }
    public static float interFloat () {
        boolean ask = true;
        float f = 0;
        while (ask) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Введите дробное число: ");
            try {
                f = sc.nextFloat();
                System.out.println("Введенное число: " + f);
                ask = false;

            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }
        }
        return f;
    }
}

