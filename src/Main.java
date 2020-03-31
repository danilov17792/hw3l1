import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
    }
    public static void task1() {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);
    }

    public static void task2() {
        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        arrayToArrayList(iArray);
        System.out.println("Результат 2 задания: " + Arrays.toString(iArray));
    }
    public static void task3() {
        MyBox<Orange> or = new MyBox<>();
        MyBox<Orange> or1 = new MyBox<>();
        MyBox<Apple> ap = new MyBox<>();
        MyBox<Apple> ap1 = new MyBox<>();
        System.out.println("Ответ по третьему заданию:");
        System.out.println("Коробки и их вес: ");
        or.addFruit(new Orange(),20);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),30);
        ap1.addFruit(new Apple(),4);
        System.out.println("Коробка с апельсинами 1: "+or.getWeight());
        System.out.println("Коробка с апельсинами 2: "+or1.getWeight());
        System.out.println("Коробка с яблоками 3: "+ap.getWeight());
        System.out.println("Коробка с яблоками 4: "+ap1.getWeight());
        System.out.println("Сравниваем коробки: ");
        System.out.println("Коробка с апельсинами 1 и Коробка с яблоками 3: "+or.compare(ap));
        System.out.println("Коробка с апельсинами 2 и Коробка с яблоками 4: "+or1.compare(ap1));
        System.out.println("Мы пересыпали коробки ");
        or.intersperse(or1);
        ap.intersperse(ap1);
        System.out.println("Коробки и их вес: ");
        System.out.println("Коробка с апельсинами 1: "+or.getWeight());
        System.out.println("Коробка с апельсинами 2: "+or1.getWeight());
        System.out.println("Коробка с яблоками 3: "+ap.getWeight());
        System.out.println("Коробка с яблоками 4: "+ap1.getWeight());
    }


    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены: "+Arrays.toString(arr)+"\n");
    }
    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
