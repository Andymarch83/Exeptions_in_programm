package home_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            int d = 0;
            double intArray[] = new double[9];
            intArray[0] = 5;
            intArray[1] = 5;
            intArray[2] = 5;
            intArray[3] = 5;
            intArray[4] = 5;
            intArray[5] = 5;
            intArray[6] = 5;
            intArray[7] = 5;
            intArray[8] = 5;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
//        interFloat();
//    }
//    public static void interFloat () {
//        boolean ask = true;
//        while (ask){
//        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите дробное значение:");
        //double d = sc.nextDouble();


//            System.out.print("Введите дробное число: ");
//            try {
//                float f = sc.nextFloat();
//                System.out.println("Введенное число равно " + f);
//                ask = false;
//
//            } catch (InputMismatchException e) {
//                System.out.println("Неверный ввод. Введите дробное число!!!");
//            }
//
//        }
//    }
//
//}


//        String[] str = new String[7];
//        str[0] = "Poned";
//        str[1] = "Vtor";
//        str[2] = "Sred";
//        str[3] = "Chet";
//        str[4] = "Pyat";
//        str[5] = "Subb";
//        str[6] = "Vosk";
//        for (int i=0; i< str.length; i++){
//            if (Objects.equals(str[i], "Sred")) str[i]=String.valueOf(str[i].length());
//
//
//        }
//        System.out.println(Arrays.toString(str));
//
//        for (String st: str) {
//            if (str[2] == "Sred") str[2] = String.valueOf(str[3].length());
//            System.out.println(st);
//
//        }
//
//    }
//        String str = "123";
//        int res =Integer.parseInt(str);//string to int!
//        System.out.println(res*2);
//        int a = 100;
//        String st = null;
//        try {
//             a = 10/1;
//            System.out.println(st.length());
//        }catch (ArithmeticException e){
//            System.out.println("На ноль делишь!!!");
//        }catch (NullPointerException e){
//            System.out.println("Строка путая!!!");
//        }
//        System.out.println(a);
//    }





