package codeAcademy.zilvinas.stringBuilder.uzduotis1;

class Uzduotis1 {

    public static void main(String[] args) {
        StringBuilder liepa = new StringBuilder("Liepa");
        StringBuilder antradienis = new StringBuilder("Antradienis");

        System.out.print(
                //LiepaAntradienis
                liepa.append(antradienis) + " "
                //sineidartnAapeiL
                +liepa.reverse() + " "
                //dartai
                +liepa.substring(5,9).concat(antradienis.substring(0,1)).concat(antradienis.substring(6,7)) + " "
                //dar2018
                +liepa.substring(5,8).concat(String.valueOf(antradienis.substring(0,2).length())).concat(String.valueOf(antradienis.substring(0,0).length())
                .concat(String.valueOf(antradienis.substring(0,1).length())).concat(String.valueOf(antradienis.substring(0,8).length()))) + " ");
        //+om
        liepa.insert(liepa.length() , "om");
        System.out.println(
                //darom2018
                liepa.substring(5,8).concat(String.valueOf(liepa.substring(liepa.length()-2 , liepa.length()))).concat(String.valueOf(antradienis.substring(0,2).length())).concat(String.valueOf(antradienis.substring(0,0).length())
                        .concat(String.valueOf(antradienis.substring(0,1).length())).concat(String.valueOf(antradienis.substring(0,8).length()))) + " "
                // 10
                +liepa.substring(0,10).length()
        );
    }
}
