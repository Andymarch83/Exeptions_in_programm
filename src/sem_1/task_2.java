package sem_1;

public class task_2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{0,1}, {0,1}};
        int value = 6;
        System.out.println(checkArray(array,value));
    }
    public static Integer checkArray(int[][] array, int value){
        int sum = 0;

        if (array.length!=array[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("В ячейках на индексах " + i + " " + j + " нет 0 и 1");
                }
                sum += array[i][j];
        }
    return sum;
    }


}
