package CodeAcademy;

class test {

    public static void main(String[] args) {
        String[] strings = {"Labas", "vakaras"};
        strings[0] = strings[0].substring(0, strings[0].length()-1);
        System.out.println(strings[0]);
    }
}
