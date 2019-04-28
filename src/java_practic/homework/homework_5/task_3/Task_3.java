package java_practic.homework.homework_5.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int number = 0;

        // как-то не очень отформатировано, используй меню code(вверху)->reformat code
recursion(number);
    }

    // int замени на void, зачем нам что-то возвращать в данном задании?
    static int recursion (int number){

        // массив надо передавать аргументом
        int[] array = {1,25,465,32,100};

        if (number < array.length){
            // 1, 25, 465, 32, 100, 
            // это твой вывод, где-то есть лишняя запятая. Надо убрать
            System.out.print(array[number] + ", ");
            return recursion(number +1);
        }
        else {
            return 0;
        }
    }
// пустую строку надо убрать
}
