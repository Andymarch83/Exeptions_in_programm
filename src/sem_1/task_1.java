package sem_1;

public class task_1 {

    public static void main(String[] args){
        int[] array = new int[]{1,2,6,4,5,6,7,8,0};
        int value = 6;
        System.out.println(printErrors(checkArray(array,value)));
    }
    public static Integer checkArray(int[] array, int value){

        if (array == null) return -3;

        if (array.length<5){
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -2;
    }
    public static String printErrors(int error){
        if (error == -1) return "Длинна массива меньше некоторого заданного минимума";
        if (error == -2) return "Искомый элемент не найден";
        if (error == -3) return "Вместо массива пришёл null";
        return "Индекс искомого элемента " + error;
    }
}
