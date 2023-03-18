package sem4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.LinkedList;
import java.util.Random;
public class task4_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int lngt = rand.nextInt(5, 20);
        LinkedList<Integer> taskList = getLinkedList(lngt);
        System.out.println("Дан список LinkedList: " + taskList);
        System.out.println("Перевёрнутый список:   " + getReversedLinkedList(taskList));
    }

    public static LinkedList<Integer> getReversedLinkedList(LinkedList<Integer> someLl) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer el : someLl) {
            result.addFirst(el);
        }
        return result;
    }

    public static LinkedList<Integer> getLinkedList(int num) {
        LinkedList<Integer> someList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            someList.add(i, rand.nextInt(1, 100));
        }
        return someList;
    }
}
