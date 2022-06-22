package codeAcademy.zilvinas.stringBuilder.uzduotis4;

class Uzduotis4 {
    public static void main(String[] args) {
        uzduotele();
    }
    private static void uzduotele(){
        String formateris = String.format("|%20s|\n|%20s|\n|%20s|\n|%20s|\n|%-20s|" , "As" , "tikrai", "ismoksiu", "programuoti" , "JAVA");
        System.out.println(formateris);
    }
}
