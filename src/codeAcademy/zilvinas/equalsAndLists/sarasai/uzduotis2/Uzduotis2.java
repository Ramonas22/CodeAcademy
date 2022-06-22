package codeAcademy.zilvinas.equalsAndLists.sarasai.uzduotis2;

import java.util.ArrayList;

class Uzduotis2 {
    public static void main(String[] args) {
        String tempString =" ";
        ArrayList<String> stingList = new ArrayList<>();
        stingList.add("Labas");
        stingList.add("vakaras");
        stingList.add("Lietuva");

        System.out.println(stingList);

        for (int i = 1; i < stingList.size(); i++){
            if (stingList.get(i).length() > tempString.length() ){
                tempString = stingList.get(i);
            }
        }

        System.out.println("List is " + stingList);
        System.out.println("Longest word in a list is: " + tempString);
    }
}
