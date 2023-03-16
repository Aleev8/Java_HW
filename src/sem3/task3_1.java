package sem3;
//(Дополнительное) Реализовать алгоритм сортировки слиянием
import java.util.Arrays;
import java.util.Random;
public class task3_1 {
    public static void main(String[] args) {
        int[] array1 = giveArray();
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] giveArray() {
        Random rand = new Random();
        int arr[] = new int[rand.nextInt(5, 20)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] mergesort(int[] array1) {
        int[] temp1 = Arrays.copyOf(array1, array1.length);
        int[] temp2 = new int[array1.length];
        int[] result = mergesortInner(temp1, temp2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] temp1, int[] temp2,
                                       int startInd, int endInd) {
        if (startInd >= endInd - 1) {
            return temp1;
        }

        int middle = startInd + (endInd - startInd) / 2;
        int[] sort1 = mergesortInner(temp1, temp2, startInd, middle);
        int[] sort2 = mergesortInner(temp1, temp2, middle, endInd);

        int index1 = startInd;
        int index2 = middle;
        int destIndex = startInd;
        int[] result = sort1 == temp1 ? temp2 : temp1;
        while (index1 < middle && index2 < endInd) {
            result[destIndex++] = sort1[index1] < sort2[index2]
                    ? sort1[index1++]
                    : sort2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sort1[index1++];
        }
        while (index2 < endInd) {
            result[destIndex++] = sort2[index2++];
        }
        return result;
    }

}
