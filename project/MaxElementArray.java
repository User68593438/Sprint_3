package project;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        //Предполагаем, первый элемент массива является минимальным
        int max = array[0];
        //Проходим по всем элементам массива
        for (int i = 1; i < array.length; i++) {
            //Если текущий элемент меньше текущего минимального, обновляем минимальный элемент
            if (array[i] < max) {
                max = array[i];
            }
        }
        //Выводим минимальный элемент
        System.out.println("Минимальный элемент в массиве: " +  max);
    }
}
