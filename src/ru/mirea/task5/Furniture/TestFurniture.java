package ru.mirea.task5.Furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Furniture fr = FurnitureShop.getFurniture(FurnitureType.Chair);
        fr.create();

        Furniture f2 = FurnitureShop.getFurniture(FurnitureType.Table);
        f2.create();
    }
}
