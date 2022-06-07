package CodeAcademy.Zilvinas.Paskaita18.sarasai.uzduotis3;

import java.util.ArrayList;
import java.util.Scanner;

class Uzduotis3 {
    public static void main(String[] args) {
        uzduotele();
    }

    static void uzduotele(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();


        System.out.println("Add few words to list");
        for (int i = 0 ; i < 4 ; i++){
            strings.add(scanner.next());
        }
        System.out.println("Unchanged list " + strings);

        for (int i = 0; i < strings.size(); i++){
            for (int j = 1+i; j < strings.size(); j++) {
                if(strings.get(i).equals(strings.get(j))){
                    strings.remove(j);
                }
            }
        }

        System.out.println("List without dublicates " + strings);
    }
}
