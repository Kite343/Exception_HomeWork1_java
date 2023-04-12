package HomeWork;
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
// возвращающий новый массив, каждый элемент которого равен частному элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
// как-то оповестить пользователя. 

// Важно: При выполнении метода единственное исключение, которое пользователь может 
// увидеть - RuntimeException, т.е. ваше.


public class task4 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 1, 3};
        int[] arr2 = {6, 7, 8, 9, 10};
        // для теста:
        // int[] arr2 = {6, 7, 8, 9, 10, 15};
        // int[] arr1 = {5, 0, 4, 1, 3};
        double[] arr3 = divArrays(arr2, arr1);
        printArrayDoubl(arr3);
    }


    public static double[] divArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        if(n != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        double[] arr = new double[n];
        for (int i = 0; i < n; i++){
            if (arr2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя! элемент " + i + " массива делителя равен нулю");
            }
            arr[i] = (double)arr1[i] / arr2[i];
        }
        return arr;
        }

    public static void printArrayDoubl(double[] arr) {
            for (double i : arr) {
                System.out.printf("%.2f ", i);
            }
            System.out.println();
        }
    
}
