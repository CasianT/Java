import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
 /* *      Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        in.close();
        System.out.println(isSumBetween10And20(a, b));
        System.out.println(isPositive( 0));
    } 
    
    public static boolean isSumBetween10And20 (int a, int b) {
//  /**
//  * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
//  * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//  
       int sum = a + b;
        if (sum <= 20 && sum >= 10) { 
            return true;
        }else {
            return false;
        }
    }



private static boolean isPositive(int x) {
//     // проверить, что х положительное
    if (x > 0)

    return true;
    return false;

}



// 2.Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
System.out.println(Arrays.toString(chenging01(array01)));

    }

    public static int[] chenging01(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    

   


 // * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]пройти по нему циклом,и 
//  числа меньшие 6 умножить на 2;

int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
modifierForArrayes(arrayNumbers);
System.out.println(Arrays.toString(arrayNumbers));
    }

private static void modifierForArrayes(int[] arrayNumbers) {
        for(int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i] < 6){
                arrayNumbers[i] *= 2;
    }
    }
}
    




// * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
// * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

createSquareArray(5);
    }

public static void createSquareArray(int size){
    int[][] sqrArray = new int[size][size];
    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
            System.out.printf("%4d", sqrArray[i][j]);
        }
        System.out.println();
    }
}
/* */



// * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

int[] minMaxArray = {5, 7, 55, 89, 33, 3, 8, 77};
        System.out.println(minInArray(minMaxArray));
        System.out.println(maxInArray(minMaxArray));
}
public static int minInArray(int[] array){
    int min = array[0];
    for(int i = 0; i < array.length; i++){
        if (min > array[i])
            min = array[i];
    }
    return min;
}
public static int maxInArray(int[] array){
    int max = array[0];
    for(int i = 0; i < array.length; i++){
        if (max < array[i])
            max = array[i];
    }
    return max;
}
}


