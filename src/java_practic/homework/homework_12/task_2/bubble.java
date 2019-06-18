package java_practic.homework.homework_12.task_2;

// Bubble
public class bubble {
    public static void main(String[] args) {
        int[] array = {4,8,16,9,2};
        boolean isSorted = false;
        int buf;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]){
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;

                    isSorted = false;
                }
            }
        }
    }
}
