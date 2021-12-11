package ru.mirea.task22;
//super class
public abstract class Patient {
    public abstract String getID();
    public abstract String getName();
    public abstract String getBirthday();
    public abstract String getGender();
    public abstract String getBirthplace();
    public abstract int getAGE();

    @Override
    public String toString() {
        return "Patient {" +
                "ID='" + this.getID() + '\'' +
                ", Name='" + this.getName() + '\'' +
                ", Birthday='" + this.getBirthday() + '\'' +
                ", Gender='" + this.getGender() + '\'' +
                ", Birthplace='" + this.getBirthplace() + '\'' +
                ", AGE=" + this.getAGE() +
                '}';
    }
}
