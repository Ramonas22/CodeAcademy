package CodeAcademy.Zilvinas.Paskaita16.uzduotis5;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Biuzdetas {
    int countPajamas = 0;
    int countIslaidas = 0;

    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[10];

    void ivestiPajamas(){
        Scanner skeneris = new Scanner(System.in);
        PajamuIrasas pajamuIrasas = new PajamuIrasas();

        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy,MM,dd");

        System.out.println("Iveskite pinigu suma: ");
        pajamuIrasas.setSuma(skeneris.nextDouble());

        System.out.println("Iveskite kategorijos indeksa: ");
        pajamuIrasas.setKategorijosIndekasas(skeneris.nextInt());

        System.out.println("Iveskite data (metus, menesi, diena): ");
        pajamuIrasas.setData(LocalDateTime.parse(skeneris.nextLine(), data));

        System.out.println("Iveskite pozymi ar pinigai gauti i banko saskaita");
        pajamuIrasas.setPozymis(skeneris.nextLine());

        System.out.println("Ivesk papildoma info");
        pajamuIrasas.setPapildomaInfo(skeneris.nextLine());

        this.pajamos[this.countPajamas] = pajamuIrasas;
        this.countPajamas++;
    }

    void iveskiteIslaidas(){
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas();
        Scanner skorpio = new Scanner(System.in);

        DateTimeFormatter formateris = DateTimeFormatter.ofPattern("yyyy,MM,dd,HH,mm");

        System.out.println("Iveskite isleista suma");
        islaiduIrasas.setSuma(skorpio.nextDouble());

        System.out.println("Iveskite kategorijos indeksa: ");
        islaiduIrasas.setKategorijosIndeksas(skorpio.nextInt());

        System.out.println("Iveskite data(metus, menesi, diena, valanda, minute");
        islaiduIrasas.setDataLaikas(LocalDateTime.parse(skorpio.nextLine(), formateris));

        System.out.println("Iveskite atsiskaitymo buda: ");
        islaiduIrasas.setAtsiskaitymoBudas(skorpio.nextLine());

        System.out.println("Iveskite kokia banko kortele naudjote: ");
        islaiduIrasas.setKokiaBankoKortele(skorpio.nextLine());

        this.islaidos[this.countIslaidas] = islaiduIrasas;
        this.countIslaidas++;
    }
}
