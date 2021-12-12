package ru.mirea.task26;

// The interface is implemented by many other
// subclasses that allow for many types of walking
// without effecting Patient, or Walk.

// Classes that implement new Walk interface
// subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface Walk {

    String walk();

}

// Class used if the patient can walk

class ItWalk implements Walk{

    public String walk() {

        return "Walking High";

    }

}

//Class used if the Patient can't walk

class CantWalk implements Walk{

    public String walk() {

        return "I can't walk";

    }

}