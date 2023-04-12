package HomeWork;

public class task1_3 {
    public static void main(String[] args) {
        String[] sArray = {"first str", null, "third str"};
        // int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        // printValueByIndex(array,12);
        printStringArray(sArray);
    }

    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new RuntimeException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    public static void printStringArray(String[] sArray){
        for (int i = 0; i < sArray.length; i++){
            if(sArray[i] == null) throw new RuntimeException("Элемента с индексом " + i + " не существует\n");
            System.out.println(sArray[i]);
        }
    }
}
