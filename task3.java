
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;



public class task3 {
    public static void main(String[] args) throws IOException {
        
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//  (в языке уже есть что-то готовое для этого)
int[] array = {1, 2, 3, 4, 5, 22, 51, 14};
        printArray("Данн массив:", array);
 
        array = deleteEvenElement(array);
        printArray("Результат:", array);
 
    }
 
    public static void printArray(String text, int[] array) {
        System.out.print(text + " [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
 
    public static int[] deleteEvenElement(int[] array) {
        int[] result = new int[array.length / 2];
        int i, j;
        for (i = 0, j = 1; j < array.length; i++, j += 2) {
            result[i] = array[j];
        }
        return result;
    }
}
 



/*2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
и среднее арифметическое из этого списка.
    int[] array = new int[10];
    Random rnd = new Random();

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < array.length; i++) {
        array[i] = rnd.nextInt(11);
        System.out.print(array[i] + " ");

    }


//min
     int min = array[0];
     for(int i = 0; i < array.length; i++ ) {
        if (min > array[i]) {
            min = array[i];
        }

     }
     System.out.println();
     System.out.println("Min is: " + min);


    //  max
    int max = array[0];
     for(int i = 0; i < array.length; i++ ) {
        if (max < array[i]) {
            max = array[i];
        }

    }
     
     System.out.println("Max is: " + max);


// average
    double average = 0;
    for(int i = 0; i < array.length; i++ ) {
        average += array[i]/array.length;

    }
    System.out.println("Average is: " + average);
   


        }
    }
  */
