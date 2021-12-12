package ru.mirea.task28;


public class ClassTester {
    public static void main(String[] args) {
        // 4 types of nested classes
        // 1. static nested class
        // 2. non-static nested class (AKA inner class)
        // 3. local inner class (non-static nested class defined inside a method)
        // 4. anonymous class (local inner class without a name)

        // static field
        System.out.println(Patient.staticField);

        // non-static field (instance-level)
        Patient outerClass = new Patient(100001, "manh", 21);
        // instance field
        //System.out.println(outerClass.instanceID);

        Patient.StaticNestedClass staticNestedClass = new Patient.StaticNestedClass(100002, "ivan", 23);

        Patient.InnerClass innerClass = outerClass.new InnerClass(100003, "anna", 18);

        outerClass.instanceMethod();

    }
}
