package ru.mirea.task17;
import java.util.Arrays;


public class LevelTest{
    enum LEVEL {
        RED("Emergency"),
        YELLOW("Severe"),
        GREEN("DelayEmergency"),
        BLUE("HealthMonitoring"),
        WHITE("NoEmergency");

        private String abb;
        private LEVEL(String abb){
            this.abb = abb;
        }
         public String getAbb(){
            return abb;
         }
    }

    public static void main(String[] args) {
        LEVEL level = LEVEL.RED;
        String color = "red";
        if (color == "red"){
            level = LEVEL.RED;
        }
        if (color == "yellow"){
            level = LEVEL.YELLOW;
        }
        if (color == "green"){
            level = LEVEL.GREEN;
        }
        if (color == "blue"){
            level = LEVEL.BLUE;
        }
        if (color == "white"){
            level = LEVEL.WHITE;
        }
        LEVEL[] levels = LEVEL.values();
        System.out.println("patient levels: " + Arrays.toString(levels));
        System.out.println("patient's condition: " + level.getAbb());
    }
}
