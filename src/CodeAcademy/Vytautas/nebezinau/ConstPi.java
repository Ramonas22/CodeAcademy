package CodeAcademy.Vytautas.nebezinau;

import java.util.Scanner;

public class ConstPi {
    public static final double PI = 3.141592653589793;

    public static void main(String[] args) {

    }

    public static double[] grazink3Skaicius() {
        Scanner scanner = new Scanner(System.in);
        double[] mas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu");
            mas[i] = scanner.nextDouble();
            maxSkaicius(mas);
            arTaiTrikampis(mas);
        }
        return mas;
    }

    public static void skritulioIlgis(double spindulys) {
        System.out.println("Skritulio ilgis : " + 2 * PI * spindulys);
    }

    public static void skritulioPlotas(double spindulys) {
        System.out.println("Skritulio plotas: " + PI * Math.pow(spindulys, 2));
    }

    public static void arVardoRaidziuSkaiciusLyginis(String tekstas) {
        if (tekstas.length() % 2 == 0) {
            System.out.println("Jusu vardo raidziu skaicius yra lyginis");
        } else {
            System.out.println("Jusu vardo raudziu skasicius yra nelyginis");
        }
    }

    public static void maxSkaicius(double[] mas) {
        if (mas[0] > mas[1] && mas[0] > mas[2]) {
            System.out.println("Didziausias skaicius: " + mas[0]);
        } else if (mas[1] > mas[2]) {
            System.out.println("Didziausias skaicius: " + mas[1]);
        } else {
            System.out.println("Didziausias skaicius: " + mas[2]);
        }
    }

    public static void arTaiTrikampis(double[] mas) {
        if (mas[0] >= mas[1] + mas[2] || mas[1] >= mas[0] + mas[2] || mas[2] > mas[0] + mas[1]) {
            System.out.println("Imanoma nubrezti trikampi");
        } else {
            System.out.println("Trikampio nubrezti nepavayks");
        }
    }

    public static void indeksas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesk savo zodi");
        String zodis = scanner.next();
        System.out.println("Ivesk zodzio raides indeksa");
        int indeksas = scanner.nextInt();
        if (indeksas == 0) {
            System.out.println("Indeksas nulis");
        } else if (zodis.length() > indeksas) {
            System.out.println("Indeksas didesnis nei zodzio ilgis");
        } else if (indeksas < 0) {
            System.out.println("Indeksas neigamias");
        } else {
            System.out.println("Zodzio: " + zodis + " " + indeksas + " raide yra: " + zodis.charAt(indeksas - 1));
        }

    }

    public static void dalybaIs345() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesk skaiciu ");
        double skaicius = scanner.nextDouble();

        if (skaicius % 3 == 0 && skaicius % 4 == 0 && skaicius % 5 == 0) {
            System.out.println("skaicius dalijasi ir is 3 ir 4 ir 5");
        } else if (skaicius % 3 == 0 && skaicius % 4 == 0) {
            System.out.println("skaicius dalijasi is 3 ir 4");
        } else if (skaicius % 3 == 0 && skaicius % 5 == 0) {
            System.out.println("skaicius dalijasi is 3 ir 5");
        } else if (skaicius % 4 == 0 && skaicius % 5 == 0) {
            System.out.println("skaicius dalijasi is 4 ir 5");
        } else if (skaicius % 3 == 0) {
            System.out.println("Skaicius daliijasi is 3");
        } else if (skaicius % 4 == 0) {
            System.out.println("skaicius dalijasi is 4");
        } else if (skaicius % 5 == 0) {
            System.out.println("skaicius dalijasi is 5");
        } else {
            System.out.println("skaicius nesidalija is 3, 4 ar 5");
        }

    }

    public static void savaite() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite dienos skaiciu: ");
        int diena = scanner.nextInt();

        if (diena > 7) {
            System.out.println("Savaiteje tiek dienu nera");
        } else if (diena == 7) {
            System.out.println("sekmadienis");
        } else if (diena == 6) {
            System.out.println("sestadienis");
        } else if (diena == 5) {
            System.out.println("pentadienis");
        } else if (diena == 4) {
            System.out.println("ketvirtadienis");
        } else if (diena == 3) {
            System.out.println("treciadienis");
        } else if (diena == 2) {
            System.out.println("antradienis");
        } else if (diena == 1) {
            System.out.println("pirmadienis");
        } else {
            System.out.println("tokios dienos nera");
        }
    }

    public static void savaiteSuSwitch() {
        Scanner skeneris = new Scanner(System.in);

        System.out.println("Ivesk dienos skaiciu");
        int skaicius = skeneris.nextInt();

        switch (skaicius) {
            case 1: {
                System.out.println("Pirmadienis");
                break;
            }
            case 2: {
                System.out.println("Antradienis");
                break;
            }
            case 3: {
                System.out.println("Treciadienis");
                break;
            }
            case 4: {
                System.out.println("Ketvirtadienis");
                break;
            }
            case 5: {
                System.out.println("Pentadienis");
                break;
            }
            case 6: {
                System.out.println("Sestadienis");
                break;
            }
            case 7: {
                System.out.println("Sekmadienis");
                break;
            }
            default: {
                System.out.println("blogai ivesta diena");
                break;
            }
        }
    }

    public static double cilindroTuris(double r, double H){
        if(r > 0 && H > 0){
            return PI * Math.pow(r,2) * H;
        } else{
            System.out.println("Spindulis ir aukstis negali buti neigami skaiciai");
            return 0;
        }

    }

    public static void zodzioPalyginimas(String Zodis, int skaicius){
        if (skaicius < 0 && Zodis.length()< 0){
            System.out.println("Skaicius negali buti neigiamas arba zodis neturi simboliu");
        }
        else if(Zodis.length() > skaicius){
            System.out.println("Zodis turiu daugiau simboliu nei duotas skaicius");
        }else if(Zodis.length() == skaicius){
            System.out.println("Zodzio turimas simboliu skaicius lygus ivestam skaiciui");
        }else {
            System.out.println("Zodis turi maziau simboliu nei ivestas skaicius");
        }
    }

    public static Boolean arTaiKvadratas(int plotas, int krastinesIlgis){
        if(plotas <  0 || krastinesIlgis < 0){
            System.out.println("Krastine ar pltoas negali buti neigiami skaiciai");
            return false;
        }
        else if(plotas == Math.pow(krastinesIlgis, 2)){
            System.out.println("Staciakampis yra kvadratas");
            return true;
        }else {
            System.out.println("Staciakampis nera kvadratas");
            return false;
        }
    }

    public static String moteriskasVyriskasVardas(String vardas){
        if(vardas.charAt(vardas.length()-1) == 's'){
            System.out.println("Vardas yra vyriskas");
            return "Vyriskas";
        }else {
            System.out.println("Vardas yra moteriskas");
            return "Moteriskas";
        }
    }

    public static int maziausiasSkaicius(int[] mas){
        return Math.min(Math.min(mas[0],mas[1]),mas[2]);
    }

    public static int menesiai(String menesis){
        switch (menesis.toLowerCase()) {
            case "sausis" -> { return 1;
            }
            case "vasaris" -> {return 2;
            }
            case "kovas" -> {return 3;
            }
            case "balandis" -> {return 4;
            }
            case "geguze" -> {return 5;
            }
            case "birzelis" -> {return 6;
            }
            case "liepa" -> {return 7;
            }
            case "rugpjutis" -> {return 8;
            }
            case "rugsejis" -> {return 9;
            }
            case "spalis" -> {return 10;
            }
            case "lapkritis" -> {return 11;
            }
            case "gruodis" -> {return 12;
            }
            default -> {System.out.println("Ivestas neteisignas menesis"); return 0;
            }
        }
    }
}
