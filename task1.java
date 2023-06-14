// Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные
// исключения

public class task1 {
    public static void main(String[] args) {
        division(5, 0);
        int[] newArray = new int[] { 6, 29, 443, 4, 9, 3, 5 };
        sortArray(newArray);
        String myStr = null;
        getStringSize(myStr);

    }

    public static int division(int a, int b) {
        return a / b;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }

    public static void sortArray(int[] array) {
        boolean needSort;
        do {
            needSort = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        } while (needSort);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7
        // out of bounds for length 7
    }

    public static int getStringSize(String str) {
        return str.length();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke
        // "String.length()" because "str" is null
    }
}