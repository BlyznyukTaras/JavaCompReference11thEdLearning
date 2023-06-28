package src.ExamplePrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkWith1DArray {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner readLine = new Scanner(System.in);
        int[] somearr = rand.ints(10,-20,20).
                toArray(); // Initialization of an array and filling it with 10 random numbers from 1 to 20
        int maxVal = 0, numInArr, prod = 1, elemCount = 0; double sum = 0, evenSum = 0;
        String isPresent = "This number is not present in the array";
        System.out.print("Our array: ");
        for (int i = 0; i < somearr.length; i++) {
            System.out.print(somearr[i] + " "); // Output of all elements of array
            if (somearr[i] > maxVal) maxVal = somearr[i]; // Finding the largest element in the array
            sum += somearr[i]; // Calculating the sum of all elements in the array
            prod *= somearr[i]; // Calculating the product of all elements in the array
            if (somearr[i] % 2 == 0)
                evenSum += somearr[i]; // Adding the value of the element to evenSum if elements' value is even
        }
        System.out.println("\n\nThe biggest element in array: " + maxVal);
        System.out.println("Sum of elements in array: " + (int)sum);
        System.out.println("Average value of elements in the array: " + sum / somearr.length);
        System.out.print("\nCheck the number for availability in the array: ");
        numInArr = readLine.nextInt();
        for (int i = 0; i < somearr.length; i++) {
            if (numInArr == somearr[i]) { // If searched number is equal to the number in the array
                isPresent = "This number is present in the array";
                break; // Stopping the search
            }
        }
        for (int i = 0; i < somearr.length; i++) {
            if (numInArr == somearr[i]) elemCount++;
        }
        System.out.println(isPresent + ", count of this element in the array: " + elemCount);
        int[] sortedarr = Arrays.stream(somearr).sorted().
                toArray(); // Initializing the second, sorted instance of main array
        System.out.print("\nSorted array: ");
        for (int i = 0; i < somearr.length; i++) {
            System.out.print(sortedarr[i] + " ");
        }
        System.out.println("\nSum of the even elements of an array: " + (int)evenSum);
        System.out.print("\nEnter the number for multiplying the elements of the array: ");
        int multNum = readLine.nextInt();
        // And then I discovered that I could've used prebuilt funcs for the work with arrays... OK
        System.out.print("\nArray with multiplied elements: ");
        for (int i = 0; i < somearr.length; i++) {
            System.out.print(somearr[i] * multNum + " ");
        }
        System.out.println("\nProduct of all elements in the array: " + prod);
        System.out.print("Array with zeroes instead of negative elements: ");
        for (int i = 0; i < somearr.length; i++) {
            if (somearr[i] < 0) somearr[i] = 0; // Replacing negative element in the array with zero
            System.out.print(somearr[i] + " ");
        }
    }
}
