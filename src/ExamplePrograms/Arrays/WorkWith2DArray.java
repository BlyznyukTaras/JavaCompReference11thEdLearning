package src.ExamplePrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkWith2DArray {
    public static void main(String[] args) {
        var rand = new Random();
        var read = new Scanner(System.in);
        int[][] matrix = new int[8][8]; // Initializing the matrix
        int max = 0, sum = 0, mainSum = 0, minVal = 50;
        long prod = 1;
        int[] evenArr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(1,10); // Filling the matrix with random values from 1 to 10
            }
        }
        System.out.println("Basic matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  "); // Outputting the matrix
                if (max < matrix[i][j]) max = matrix[i][j]; // Finding the maximum value of the matrix
                sum += matrix[i][j]; // Calculating the sum of the elements in the matrix
                prod *= matrix[i][j]; // And the product of the elements in the matrix
                if (i == j) mainSum += matrix[i][j]; // And also the sum of elements in the main diagonal
            }
            System.out.println();
        }
        System.out.println("\nMax value of the matrix: " + max);
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Sum of the elements of the matrix's main diagonal: " + mainSum);
        System.out.println("Average value of the elements: " + (float)sum / 25);
        System.out.println("Product of the elements: " + prod + "\n");
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j]; // Calculating the sum of the elements in each row
            }
            System.out.println("Sum of the elements from the row №" + (i + 1) + ": " + sum);
            evenArr[i] = sum; // Adding the sum of each row to another 1-D array
            sum = 0; // Refreshing the value
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int[] ints : matrix) {
                sum += ints[i]; // Same about the columns
            }
            System.out.println("Sum of the elements from the column №" + (i + 1) + ": " + sum);
            sum = 0;
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int[] ints : matrix) {
                if (minVal > ints[i]) minVal = ints[i]; // Finding the minimal value in each column
            }
            System.out.println("Element of the column №" + (i + 1) +": " + minVal);
            minVal = 50; // And refreshing the value
        }
        System.out.print("\nSum of elements in each even row of matrix: ");
        for (int i = 0; i < evenArr.length; i++) {
            if (i % 2 != 0)
                System.out.print(evenArr[i] + " "); // Outputting sums of the rows with even index
        }
        System.out.println("\nAmount of rows in the matrix with even sum of elements: " + evenArr.length + "\n");
        System.out.println("Matrix with swapped order of elements in rows:");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix1
                        [matrix.length - j - 1] + "  "); // Outputting the matrix with reversed rows
            }
            System.out.println();
        }
        System.out.println();
        for (int[] element : matrix) {
            Arrays.sort(element); // Sorting the rows of the matrix
        }
        System.out.println("Matrix with sorted rows: ");
        for (int[] item : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(item[j] + "  ");
            }
            System.out.println();
        }
        int[] sortArr = new int[matrix.length *
                matrix.length]; // New 1-D array that will contain all elements from the matrix
        var k = 0; // Iterator variable
        for (int[] value : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                sortArr[k] = value[j]; // Adding values to the array
                k++; // Incrementing the iterator
            }
        }
        k = 0; // Resetting the iterator
        sortArr = Arrays.stream(sortArr).sorted().toArray(); // Sorting the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sortArr[k]; // Again, but in other way
                k++; // And again incrementing
            }
        }
        System.out.println("\nSorted matrix: ");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
        System.out.print("\nEnter the limiter for the width: ");
        var width = read.nextInt();
        System.out.print("Enter the limiter for the height: ");
        var height = read.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
