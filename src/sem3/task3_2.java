package sem3;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class task3_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int lngt = rand.nextInt(5, 20);
        ArrayList<Integer> taskList = getArrayList(lngt);
        System.out.println("Дан список чисел => " + taskList);
        deleteEvenNumbersFromList(taskList);
        System.out.println("Cписок после удаления четных чисел => " + taskList);
    }

    private static void deleteEvenNumbersFromList(ArrayList<Integer> someList) {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) % 2 == 0) someList.remove(i);
        }
    }

    private static ArrayList<Integer> getArrayList(int number) {
        ArrayList<Integer> someList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            someList.add(rand.nextInt(100));
        }
        return someList;
    }

}
