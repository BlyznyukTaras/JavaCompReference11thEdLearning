package src.ExamplePrograms.ClassesCloserLook;

public class PassingReferences {
    private int fVal;
    private int sVal;
    public PassingReferences() { }
    public PassingReferences(int fVal, int sVal) {
        this.fVal = fVal;
        this.sVal = sVal;
    }
    public void changeVals(int a, int b) {
        a += 5;
        b -= 5;
    }
    public void changeVals(PassingReferences obj) {
        obj.fVal += 20;
        obj.sVal -= 10;
    }
    public void showVals() {
        System.out.println("First value: " + fVal + ", second value: " + sVal);
    }
}
