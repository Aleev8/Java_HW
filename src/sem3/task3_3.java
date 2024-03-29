package sem3;
//Задан целочисленный список ArrayList. Найти минимальное,
//        максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class task3_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int lngt = rand.nextInt(5, 20);
        ArrayList<Integer> taskList = getArrayList(lngt);
        System.out.println("Дан целочисленный список ArrayList => " + taskList);
        int minList = getMinArrList(taskList);
        System.out.println("MIN = " + minList);
        int maxList = getMaxArrList(taskList);
        System.out.println("MAX = " + maxList);
        int middleArithm = getmiddleArithmArrList(taskList);
        System.out.println("Среднее арифметическое = " + middleArithm);
    }

    private static int getmiddleArithmArrList(ArrayList<Integer> someList) {
        int sum = 0;
        for (Integer el : someList) {
            sum += el;
        }
        int midAr = (Math.round((float)sum / (float)someList.size()));
        return midAr;
    }

    private static int getMinArrList(ArrayList<Integer> someList) {
        int curMin = 101;
        for (Integer el : someList) {
            if (el < curMin) curMin = el;
        }
        return curMin;
    }

    private static int getMaxArrList(ArrayList<Integer> someList) {
        int curMax = 0;
        for (Integer el : someList) {
            if (el > curMax) curMax = el;
        }
        return curMax;
    }

    private static ArrayList<Integer> getArrayList(int number) {
        ArrayList<Integer> someList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            someList.add(rand.nextInt(1, 100));
        }
        return someList;
    }
}
