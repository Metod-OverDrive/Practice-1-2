package Mission.practic.one_2.first;

import java.util.Arrays;

public class Mass2 {
    int[] array1 = new int[6];
    int[] array2 = new int[6];
    int[] array3;          // Массив для перезаписи
    int x;                 // Вспомогательное значение
    int counter = 0;
    double max;            // Для метода Math.max

    // Добавление
    public void plus(int chislo){
        array1[counter] = chislo;
        array2[counter] = chislo;
        for(int i = 0; i < counter;i++){
            array1[i] = array1[i] + chislo;
        }
        counter ++;
        System.out.println(Arrays.toString(array1)+" with add");
        if (counter >= 0.75*array1.length)
            resize();
    }

    private void resize(){
        array3 = array1;
        array1 = new int[array1.length*2];
        for (int q = 0; q < counter;q++)
            array1[q] = array3[q];

        array3 = array2;
        array2 = new int[array2.length*2];
        for (int q = 0; q < counter;q++)
            array2[q] = array3[q];
    }

    // Удаление
    public void minus(int index){
        if (counter > 0) {
            x = array2[index];
            for (int i = index; i < counter; i++) {
                array1[i] = array1[i + 1];
                array2[i] = array2[i + 1];
            }
            counter--;
            for (int i = 0; i < counter; i++) {
                array1[i] = array1[i] - x;
            }
            System.out.println(Arrays.toString(array1) + " with remove");
        }
    }
    // Получение значения по индексу
    public void getValue(int index) {
        if (counter > 0) {
            System.out.println("Value with index = " + index + " is " + array1[index]);
        } else
            System.out.println("Массив пуст");
    }
    // Получение индекса по значению
    public void getIndex(int value){
        if (counter > 0) {
            for (int i = 0; i < counter; i++) {
                if (value == array1[i])
                    System.out.println("Index wit value = " + value + " is " + i);
            }
        } else
            System.out.println("Массив пуст");
    }
    // Минимальное значение
    public void mini(){
        if (counter > 0) {
            x = Integer.MAX_VALUE;
            for (int i = 0; i < counter - 1; i++) {
                if (x > array1[i])
                    x = array1[i];
            }
            System.out.println("Min value is " + x);
        } else System.out.println("Массив пуст");
    }
    // Максимальное значение
    public void maxi() {
        if (counter > 0) {
            max = Double.MIN_VALUE;
            for (int i = 0; i < counter - 1; i++) {
                max = Math.max(array1[i], max);
            }
            System.out.println("Max value is " + Math.round(max));
        } else
            System.out.println("Массив пуст");
    }
    // Среднее арифметическое значение
    public void middleValue(){
        if (counter > 0) {
            x = 0;
            for (int i = 0; i < counter; i++) {
                x += array1[i];
            }
            System.out.println("Middle value is "+(double)x/(double)(counter-1));
        } else
            System.out.println("Массив пуст");
    }
}
