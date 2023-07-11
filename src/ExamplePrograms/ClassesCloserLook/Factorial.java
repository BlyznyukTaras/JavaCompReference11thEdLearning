package src.ExamplePrograms.ClassesCloserLook;

public class Factorial {
    public int fact(int num) {
        int res;
        if (num == 1) return 1;
        res = fact(num - 1) * num;
        return res;
    }
}
