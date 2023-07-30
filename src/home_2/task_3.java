package home_2;
/*
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9; - ВЫХОД ЗА ПРЕДЕЛЫ МАССИВА
   } catch (Throwable ex) { - НАРУШЕНА ИЕРАРХИЯ ОШИБОК, НУЖНО УКАЗЫВАТЬ В ПОСЛЕДНЮЮ ОЧЕРЕДЬ
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}

public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}  - ОТСУТСТВУЕТ FileReader И try/catch ДЛЯ FileNotFoundException, ТАК ЖЕ НЕТ throw new RuntimeException(e)

 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class task_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
        {
            try {
                FileReader fr = new FileReader("file");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
