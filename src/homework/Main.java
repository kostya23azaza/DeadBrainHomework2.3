package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        firstExersice();
        secondExersice();
    }

    private static void firstExersice() {
        String[] words = {"Human", "Cat", "Dog", "Bird", "Animal", "Apple", "Banana", "Orange", "Watermelon", "Cat", "Animal", "Fox", "Book", "DeadBrain", "Cat"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else map.put(words[i], 1);
        }
        System.out.println(map);
    }

    private static void secondExersice() {
        SecondExersice secondExersice = new SecondExersice();
        secondExersice.add("ivanov", "8323242332");
        secondExersice.add("petrov", "8323242332");
        secondExersice.add("ivanov", "8123456789");
        secondExersice.add("petrov", "9876543210");
        secondExersice.add("ivanov", "8323242332");
        secondExersice.add("sidorov", "89031242332");
        System.out.println(secondExersice.get("ivanov"));
        System.out.println(secondExersice.get("petrov"));
        System.out.println(secondExersice.get("sidorov"));

    }

    static class SecondExersice {
        Map<String, List<String>> map = new HashMap<>();
        List<String> phone_number_list;

        public void add(String list_surname, String phone_number) {
            if (map.containsKey(list_surname)) {
                phone_number_list = map.get(list_surname);
                phone_number_list.add(phone_number);
                map.put(list_surname, phone_number_list);
            } else {
                phone_number_list = new ArrayList<>();
                phone_number_list.add(phone_number);
                map.put(list_surname, phone_number_list);
            }
        }

        public List<String> get(String surname) {
            return map.get(surname);
        }
    }
}//very difficult homework
