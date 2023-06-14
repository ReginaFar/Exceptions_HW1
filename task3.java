public class task3 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива, и возвращающий новый массив, каждый элемент которого равен частному
    // элементов двух входящих массивов в той же ячейке. Если длины массивов не
    // равны, необходимо как-то оповестить пользователя. Важно: При выполнении
    // метода единственное исключение, которое пользователь может увидеть -
    // RuntimeException, т.е. ваше

    public static void main(String[] args) {
        int[] myArray1 = new int[] { 4, 8, 12, 11, 49 };
        int[] myArray2 = new int[] { 2, 8, 1, 11, 7 };
        int[] result = divideArrays(myArray1, myArray2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] divideArrays(int[] firstArray, int[] secondArray) throws RuntimeException {
        if (firstArray.length != secondArray.length) {
            throw new RuntimeException("The arrays' lengths are not equal!");
        }
        int[] newArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i] / secondArray[i];
        }
        return newArray;
    }
}
