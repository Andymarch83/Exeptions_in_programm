package sem_1;

public class task_3 {
    public static void main(String[] args) {
    Integer[] array = new Integer[]{1,null,3,null};

    checkArray(array);
}
    public static void checkArray(Integer[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) stringBuilder.append(i).append(" ");
        }
        if (stringBuilder.length() > 0) {
            throw new RuntimeException("В массиве находятся null на индексах: " + stringBuilder);
        }
    }
 
}
