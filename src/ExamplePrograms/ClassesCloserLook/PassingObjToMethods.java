package src.ExamplePrograms.ClassesCloserLook;

public class PassingObjToMethods {
    private int value1;
    private int value2;
    public PassingObjToMethods(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public PassingObjToMethods(PassingObjToMethods obj) {
        value1 = obj.value1;
        value2 = obj.value2;
    }
    public boolean objSumEquality(PassingObjToMethods o) { return o.value1 + o.value2 == value1 + value2; }
    public int getSubstraction() { return value2 - value1; }
}
