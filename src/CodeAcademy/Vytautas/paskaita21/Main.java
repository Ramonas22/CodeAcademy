package CodeAcademy.Vytautas.paskaita21;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(anagrama("labas", "sabla"));
        System.out.println(anagrama("hello", "bey"));
        System.out.println(anagrama("bey", "hey"));
        System.out.printf("%s", 4);
        */
        /*
        Person person1 = new Person("Johny", "Wis", 1998 , 1.987);
        Person person2 = new Person("Liza", "Cher", 1998 , 1.754);
        Person.showAtributes(person1);
        Person.showAtributes(person2);
        */
        //System.out.printf("|%20s|\n|%20s|\n|%20s|\n|%20s|\n|%-20s|", "As", "tikrai", "ismoksiu", "programuoti", "JAVA");
        System.out.printf("""
                |%20s|
                |%20S|
                |%20s|
                |%20S|
                |%-20s|
                """, "As", "tikrai", "ismoksiu", "programuoti", "JAVA");
    }

    static boolean anagrama(String word1, String word2) {
        StringBuilder wordTemp1 = new StringBuilder(word1);
        StringBuilder wordTemp2 = new StringBuilder(word2);

        if (wordTemp2.length() == wordTemp1.length()) {
            for (int i = 0; i < wordTemp1.length(); i++) {
                for (int j = 0; j < wordTemp1.length(); j++) {
                    if (wordTemp1.charAt(i) == wordTemp2.charAt(j)) {
                        wordTemp1.setCharAt(i, ' ');
                        break;
                    }
                }
            }
            if (wordTemp1.toString().trim().length() == 0) {
                System.out.println("Anagram");
                return true;
            } else {
                System.out.println("Deja ne anagram");
                return false;
            }
        } else {
            System.out.println("Words not even same length");
            return false;
        }
    }



}
