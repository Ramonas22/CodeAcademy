package CodeAcademy.Zilvinas.arrayListAndLinkedList.task2;

import java.util.ArrayList;
import java.util.Scanner;

class CommandsAndExecution {
    private  ArrayList<String> strings = new ArrayList<>();

    private int commandOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Press 1 to add new word\s
                Press 2 to find word and retrieve index of it
                Press 3 to delete a word from list
                Press 4 to clear list
                Press 5 to show list
                Press 6 to exit
                """);
        return scanner.nextInt();
    }

    private void addWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word ");
        strings.add(scanner.next());
    }

    private void findWord() {
        Scanner scanner = new Scanner(System.in);
        String tempString;
        System.out.println("Enter word to find in list");
        tempString = scanner.next();
        if (strings.contains(tempString)) {
            System.out.println("Index of " + tempString + " is " + strings.indexOf(tempString));
        } else {
            System.out.println("Entered word is not in the list");
        }
    }

    private void deleteWord() {
        Scanner scanner = new Scanner(System.in);
        String tempString;
        System.out.println("Enter word to delete");
        tempString = scanner.next();
        if (strings.contains(tempString)) {
            strings.remove(tempString);
        } else {
            System.out.println("Word is not in the list");
        }
    }

    private void clearList() {
        strings.clear();
    }

    private void showList() {
        System.out.println(strings);
    }

    void executor() {
        int tempInt = 0;

        while (tempInt != 6) {
            tempInt = commandOptions();
            switch (tempInt){
                case 1 -> addWord();
                case 2 -> findWord();
                case 3 -> deleteWord();
                case 4 -> clearList();
                case 5 -> showList();
                case 6 -> System.out.println("Goodbye");
                default -> System.out.println("Wrong command entered, try again");
            }
        }

    }

}
