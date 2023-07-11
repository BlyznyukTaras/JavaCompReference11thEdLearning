package src.ExamplePrograms.ClassesCloserLook;

public class Demo {
    public static void main(String[] args) {
        objectsPassing: {
            PassingObjToMethods obj = new PassingObjToMethods(1, 5);
            PassingObjToMethods anotherObj = new PassingObjToMethods(3, 3);
            PassingObjToMethods lastObj = new PassingObjToMethods(obj);
            System.out.println(obj.objSumEquality(anotherObj));
            System.out.println(lastObj.getSubstraction());
        }
        System.out.println();
        referencePassing: {
            PassingReferences obj = new PassingReferences();
            int a = 30, b = 40;
            obj.changeVals(a, b);
            obj.showVals();
            PassingReferences obj2 = new PassingReferences(15, 11);
            obj2.changeVals(obj2);
            obj2.showVals();
        }
        System.out.println();
        recursion: {
            Factorial fact = new Factorial();
            System.out.println(fact.fact(5));
        }
    }
}
