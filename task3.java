package HomeWork;
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
// возвращающий новый массив, каждый элемент которого равен разности элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
// оповестить пользователя.


public class task3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 1, 3};
        int[] arr2 = {6, 7, 8, 9, 10};
        // для теста:
        // int[] arr2 = {6, 7, 8, 9, 10, 15};
        int[] arr3 = diffArrays(arr2, arr1);
        printArrayInt(arr3);
    }


    public static int[] diffArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        if(n != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = arr1[i] - arr2[i];
        }
        return arr;
        }

    public static void printArrayInt(int[] arr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    
}
