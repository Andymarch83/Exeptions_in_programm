package sem_1;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума,
метод возвращает -1 в качестве кода ошибки, иначе - длину массива.

 */
public class task_0 {
    public static void main(String[] args) {
    int[] array = new int[]{1,2,3,4};
    int min_val = 6;
        System.out.println(checkArray(array,min_val));
    }
    public static Integer checkArray(int[] array, int min_val){
        if (array.length<min_val){
            return -1;
        }
        return array.length;
    }
   }
