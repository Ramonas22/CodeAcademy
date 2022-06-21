package CodeAcademy.Zilvinas.HashSetAndHashMap.tasksHashMap.Task5;

import java.util.*;

class Synonyms {

    private final HashMap<String, List<String>> synonymsHashMap = new HashMap<>();

    static void run() {
        Synonyms runItself = new Synonyms();
        runItself.fillSynonyms();
        runItself.check();
    }

    private void fillSynonyms() {
        synonymsHashMap.put("ALUS", Arrays.asList("Penktadienis", "Saslykai", "Vakaras"));
    }

    private void check() {
        Scanner scanner = new Scanner(System.in);
        String temp = "null", temp2 = "null";

        while (!temp.equalsIgnoreCase("baikpls")) {
            System.out.println("\nEnter word you want to check, if you want to exit enter baikpls");
            temp = scanner.nextLine();

            if (synonymsHashMap.containsKey(temp.toUpperCase())) {
                System.out.println("Synonyms to word " + temp + " : " + synonymsHashMap.get(temp.toUpperCase()));
            } else if(!temp.equalsIgnoreCase("baikpls")){
                while (!temp2.equalsIgnoreCase("no")) {
                    System.out.println("Do you wanna add word to dictionary ? Yes/No");
                    temp2 = scanner.nextLine();
                    switch (temp2.toLowerCase()) {
                        case "yes" -> {
                            addWordToDictionary(temp);
                            temp2 = "no";
                        }
                        case "no" -> System.out.println("ok....");
                        default -> System.out.println("YES OR NO ?");
                    }
                }
                temp2="null";
            }
        }
    }

    private void addWordToDictionary(String key) {
        Scanner scanner = new Scanner(System.in);
        String temp = "null";
        ArrayList<String> strings = new ArrayList<>();

        while (!temp.equalsIgnoreCase("baikpls")) {
            System.out.println("Enter synonym for word " + key + ", if you desire to end enter baikpls");
            temp = scanner.nextLine();
            if (!temp.equalsIgnoreCase("baikpls") && !temp.isEmpty()) {
                strings.add(temp);
            }
        }
        if (!strings.isEmpty()) {
            synonymsHashMap.put(key.toUpperCase(), strings);
            System.out.println("Good job for expanding synonyms dictionary");
        } else {
            System.out.println("You are disappointment to society");
        }
    }
}
