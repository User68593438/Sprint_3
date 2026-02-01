package project;

public class MinElementArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        //Предполагаем, первый элемент массива является минимальным
        int min = Integer.MAX_VALUE;
        //Проходим по всем элементам массива
        for (int i = 1; i < array.length; i++) {
            //Если текущий элемент меньше текущего минимального, обновляем минимальный элемент
            if (array[i] < min) {
                min = array[i];
            }
        }
        //Выводим минимальный элемент
        System.out.println("Минимальный элемент в массиве: " +  min);
    }
}
