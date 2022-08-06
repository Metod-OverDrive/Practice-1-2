package Mission.practic.one_2.third;

public class NewArray {
    int[] array;
    int chislo;
    int counter;       // Счётчик
    boolean retain;    // Не даёт перепроверять одни и теже значения
    boolean itog;      // Если ничего не выведится, то сработает итоговый вердикт

    public NewArray(int[] array) {
        this.array = array;
    }

    public void clones(){
        for (int i = 0; i < array.length; i++){
            //Проверка на повтор
            counter = 0;
            chislo = array[i];
            retain = false;
            for (int g = 0; g < i; g++){
                if (array[g] == array[i])
                    retain = true;
            }
            //Поиск дубликатов
            if (!retain)
                for (int q = i; q < array.length; q++){
                    if (chislo == array[q])
                        counter++;
            }

            if (counter > 1) {
                System.out.println("Число " + chislo + " повторяется " + counter + "раз.");
                itog = true;
            }
        }
    if (!itog)
        System.out.println("Дубликатов нет.");
    }

}
