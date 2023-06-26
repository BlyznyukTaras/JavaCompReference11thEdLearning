package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");
        var rand = new Random();
        int[] arr = rand.ints(10, 10, 20).toArray();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int[] another = arr;
        for (int i = 0; i < another.length; i++) {
            System.out.println(another[i] + " ");
        }
    }
}