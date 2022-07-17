package algoritmi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DICT_HASH_MAP_MUSIC {
    public static void main(String[] hash_map) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Have you ever seen the rain?", "Creedence Clearwater Revival");
        hashMap.put("Fortunate Son", "Creedence Clearwater Revival");
        hashMap.put("Paint it,Black", "The Rolling Stones");
        hashMap.put("Oh,Pretty Woman", "Roy Orbison");
        hashMap.put("Sweet Caroline", "Roy Orbison");
        hashMap.put("Snowman", "Foreigner");
        hashMap.put("I Want To Know", "Foreigner");
        hashMap.put("The Wall", "Pink Floyd");
        hashMap.put("Shine On You Crazy Diamond", "Pink Floyd");
        hashMap.put("Wish You Were Here", "Pink Floyd");
        hashMap.put("Time", "Pink Floyd");


        hashMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        System.out.println("");
        System.out.println("Choose searching options!By Song or by Arist/Group");
        String option = scanner.nextLine();

        if (option.equals("Group") || option.equals("Artist")) {
            System.out.println("Whats the name of the Group/Artist");
                String group = scanner.nextLine();
                if (hashMap.containsValue(group))
                    hashMap.forEach((key, value) -> {
                        if (value.equals(group))
                            System.out.println(key);
                         });

                else System.out.println("This song is not on the list");



        } else if (option.equals("Song")) {
            System.out.println("Whats the name of the Song");
            String song = scanner.nextLine();
            if (hashMap.containsKey(song))
                System.out.println(song + " was made by " + hashMap.get(song));
            else System.out.println("This song is not on the list");

        } else {
            System.out.println("Wrong Input (rerun)");
        }
    }
}
