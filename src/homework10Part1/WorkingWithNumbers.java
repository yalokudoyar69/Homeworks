package homework10Part1;

import java.util.Random;

public class WorkingWithNumbers {

    static int[] creatingArray(int arraySize) {
        int[] arr = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(200);
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arr[i] + "\t");
        }
        return arr;
    }

    static void increaseSorting(int[] arr) {
        int temp;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[i] + "\t");
        }

    }

//    static void decreasingSorting(int[] arr) {
//        int temp;
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//            System.out.print(arr[i] + "\t");
//        }
//
//    }
}


//    public static void main (String[] args)
//    {
//        int[] array = {4,2,1,3,5,9,6,8,7};
//
//        for(int i = 0 ; i < array.length;i++)
//        {
//            for(int j = i+1 ; j< array.length;j++)
//            {
//                if(array[i] > array[j])
//                {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//}


//    int length = 10;
//        int[] arr = new int[length];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//
//    }
//}
