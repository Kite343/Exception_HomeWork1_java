package HomeWork;
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// public static int sum2d(String[][] arr) {
//   int sum = 0;
//   for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < 5; j++) {
//       int val = Integer.parseInt(arr[i][j]);
//       sum += val;
//     }
//   }
// return sum;
// }

public class task2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {{"4", "2", "2", "4", "3"}, {"3", "4", "6", "2", "1"}};
        // String[][] arr = new String[][] {{null, "4", "f", "2", "4"}, {"3", null, "6", "2", "9"}};
        // String[][] arr = new String[][] {{"4", "f", "2", "4", "9"}, {"3", null, "6", "2", "9"}};
        // String[][] arr = new String[][] {{"4", "2", "2", "4"}, {"3", "4", "6", "2"}};
        // String[][] arr = new String[][] {{"4", "2", "2", "4", "9", "0"}, {"3", "4", "6", "2"}};
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i].length;
            if(arr[i] == null) {throw new RuntimeException("подмассив " + i + " пустой");}
            if(n < 5){throw new RuntimeException("Длинa подмассива " + i + " меньше 5");}
            if(n > 5){throw new RuntimeException("Длинa подмассива " + i + " больше 5");}
            for (int j = 0; j < 5; j++) {
                if(arr[i][j] == null) {throw new RuntimeException("элемент на позиции " + i + "_" + j + " пустой");}
                
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    System.out.println("элемент на позиции " + i + "_" + j + " не является числом");
                }
            }
        }
        return sum;
    }
}
