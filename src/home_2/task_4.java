package home_2;
/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит
пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Objects;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = sc.nextLine();
        if (Objects.equals(line, ""))
            throw new RuntimeException("Пустые строки вводить нельзя");

    }
}
