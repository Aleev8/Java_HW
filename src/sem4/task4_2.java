package sem4;

import java.util.Random;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class task4_2 {
    public static void main(String[] args) {

        MyQueue que = new MyQueue();
        System.out.println("Дана очередь => " + que.createQueue());
        Random rand = new Random();
        int a = rand.nextInt(1, 100);
        que.enqueue(a);
        System.out.println("Помещаем некий элемент a = " + a + " в конец очереди => ");
        que.printQueue();
        que.dequeue();
        System.out.print("Наша очередь сейчас => ");
        que.printQueue();
    }
}
