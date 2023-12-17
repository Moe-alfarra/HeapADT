import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random myRan = new Random();

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = myRan.nextInt(50);
        }

        System.out.println("Array A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int[] sortedArray = new int[10];
        heapsort(a, sortedArray);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();

    }

    public static void heapsort ( int[] arr, int[] sortedArray){
        Heap heap = new Heap();
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = heap.min();
            heap.removeMin();
        }
    }
}
