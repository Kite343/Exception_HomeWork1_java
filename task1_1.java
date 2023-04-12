package HomeWork;
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task1_1 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 1, 3};
        int[] arr2 = {6, 7, 8, 9, 10};
        // для теста:
        // int[] arr2 = {6, 7, 8, 9, 10, 15};
        int[] arr3 = sumArray(arr1, arr2);
        printArrayInt(arr3);
    }


    public static int[] sumArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        if(n != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = arr1[i] + arr2[i];
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
