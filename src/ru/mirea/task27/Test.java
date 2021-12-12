package ru.mirea.task27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Anton");
        map.put("Petrov", "Sasha");
        map.put("Sidorov", "Ivan");
        map.put("Soskaridze", "Antony");
        map.put("Sukeev", "Ivan");
        map.put("1", "Ira");
        map.put("2", "Anton");
        map.put("3", "Ira");
        map.put("4", "Sasha");
        map.put("5", "Gnom");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> it = map.entrySet().iterator();
        String [] name = new String[10];
        int i = 0;
        while(it.hasNext()) {
            HashMap.Entry<String, String> pair = it.next();
            String value = pair.getValue();
            name[i] = value;
            i++;
        }
        for (int j = 0; j < name.length; j++) {
            String name1 = name[j];
            for (int k = j+1; k < name.length; k++) {
                if (name1.equals(name[k])) removeItemFromMapByValue(map,name[k]);
            }
            //System.out.println(name[j]);

        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
