package ru.mirea.task28;

public class Patient {
    // fields
    static String staticField = "--------------------------------------------"; // static, class level... one staticField variable shared amongst
    // all instances of OuterClass
    int instanceID; // non-static, instance level.... each instance of OuterClass gets its own instanceID
    String instanceName;
    int instanceAGE;

    private int ID;
    private String Name;
    private int AGE;


    // constructor
    public Patient(int id, String name, int AGE) {
        instanceID = id;
        instanceName = name;
        instanceAGE = AGE;
        System.out.println("information ID-name-AGE: " + id + " - " + name + " - " + AGE);
    }

    // 1. static nested class
    public static class StaticNestedClass {

        // constructor
        public StaticNestedClass(int id, String name, int AGE) {
            System.out.println(staticField);
            System.out.println("information ID-name-AGE: " + id + " - " + name + " - " + AGE);
        }
    }

    // 2. inner class
    public class InnerClass {
        // inner classes ARE ASSOCIATED WITH AN INSTANCE OF THE ENCLOSING CLASS
        // inner classes can access static and non-static members of the enclosing class

        // instance level field
        int instanceID;

        // constructor
        public InnerClass(int id, String name, int AGE) {
            instanceID = id;
            System.out.println(staticField);
            System.out.println("information ID-name-AGE: " + this.instanceID + " - " + name + " - " + AGE);
            // this refers to this instance of InnerClass
            // OuterClass.this refers to this instance of OuterClass that this instance
            // of InnerClass belongs to
            //System.out.println("OuterClass' instanceID: " + Patient.this.instanceID);
        }
    }

    // 3. and 4. local classes need a method
    public void instanceMethod() {
        final String localVar = "++++++++++++++++++++++++++++++++++";

        // 3. local class
        class LocalClass {
            // constructor
            public LocalClass() {
                System.out.println("localVar: " + localVar);
                System.out.println("information ID-name-AGE: " + instanceID + " - " + instanceName + " - " + instanceAGE);
            }
        }
        // instantiate a LocalClass object
        LocalClass localClass = new LocalClass();

        // local classes can access the local variables of the enclosing method
        // only if the local variables are final or "effectively final"

        // 4. anonymous class
        // we need the name of an interface to implement or a class to extend in order
        // to create an anonymous class
        // lets extend object
        Object myAnonymousClassObject = new Object() {
            // override methods

            @Override
            public String toString() {
                return "END";
            }
        };

        System.out.println(myAnonymousClassObject);
    }
}