package home_2;
/*
try { - НЕ УКАЗАН КЛАСС ИЛИ МЕТОД
   int d = 0; - НЕ ПРЕВЕДЕНЫ К ОДНОМУ ТИПУ
   double catchedRes1 = intArray[8] / d; - ДЕЛЕНИЕ НА 0 ПРИ INT, ВОЗМОЖЕН ВЫХОД ЗА ПРЕДЕЛЫ МАССИВА.
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */

public class task_2 {
    public static void main(String[] args) {
     try {
        double d = 0;//-> infinity || int -> by zero Exception
        double[] intArray = new double[9];// || int
        intArray[0] = 5;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 9;
        intArray[4] = 0;
        intArray[5] = 4;
        intArray[6] = 7;
        intArray[7] = 1;
        intArray[8] = 8;
        double catchedRes1 =  intArray[8] / d;// int
//         System.out.println(d);
//         System.out.println(intArray[8]);
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }


}
}
