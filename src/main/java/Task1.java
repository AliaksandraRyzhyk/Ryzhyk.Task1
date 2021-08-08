import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        System.out.println(printArray(new int[]{5, 3, 9, 5}));
        System.out.println(Arrays.toString(printModifiedArray(new int[]{5, 3, 9, 5}, 5)));
//        System.out.println(printStringArray("x", "O", 6));
    }

    //1. Написать метод, который принимает массив целых чисел и возвращает true,
    // если в массиве последовательно расположены 2 одинаковых числа.
    public static boolean printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }


    //2. Написать метод, который принимает массив целых чисел и случайное целое число,
    // а возвращает массив из которого удалены все вхождения этого числа
    public static int[] printModifiedArray(int[] array, int number) {
//        int[] arr = Arrays.stream(array).filter((n) -> n != number).toArray();
//        return arr;

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }

        int[] newArray = new int[array.length - counter];

        int newArrayCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[newArrayCounter] = array[i];
                newArrayCounter++;
            }
        }
        return newArray;
    }


        //3. Написать метод, который принимает на вход строку a, строку b и число c.
        // Метод должен возвращать строку, содержащую a в количестве c, разделённых b
        //Например :
        //someMethod("x", "О", 3) → "xОxОx"
        public static String printStringArray (String a, String b,int c){
            return a.concat(b).repeat(c - 1).concat(a);
        }

    }
