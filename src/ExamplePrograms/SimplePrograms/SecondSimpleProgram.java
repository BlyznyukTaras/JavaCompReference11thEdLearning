package src.ExamplePrograms.SimplePrograms;


public class SecondSimpleProgram {
    public static void main(String[] args) {
        int number = 50;
        System.out.println("The value of the first variable is " + number);
        int anotherNumber = number * number;
        System.out.println("The value of the second (number * number) variable is " + anotherNumber);
        if (anotherNumber > number) System.out.println("Second variable's value is bigger than first's one");
        for (int i = 0; i < 5; i++) {
            System.out.println("The iterable value here (number * i) is " + number * i);
        }
        while (number != 0) {
            System.out.println(number);
            number -= 10;
        }

    }
}
