package sem4;
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;

public class MyQueue {
    private LinkedList<Integer> someQueue = new LinkedList<Integer>();
    Random rand = new Random();
    private int sizeQue = rand.nextInt(5, 20);


    LinkedList<Integer> createQueue() {
        Random rand = new Random();
        for (int i = 0; i < sizeQue; i++) {
            someQueue.add(rand.nextInt(1, 100));
        }
        return someQueue;
    }

    void dequeue() {
        if (emptyQue()) System.out.println("Очередь пуста!");
        else {
            System.out.println("Первый элемент в очереди => " + first());
            System.out.println("Удаляем его!");
            someQueue.removeFirst();
        }
    }

    Integer first() {
        if (emptyQue()) return null;
        else return someQueue.getFirst();
    }

    boolean emptyQue() {
        return sizeQue == 0;
    }

    void printQueue(){
        System.out.println(someQueue);
    }

    void enqueue(int elem) {
        someQueue.addLast(elem);
    }
}