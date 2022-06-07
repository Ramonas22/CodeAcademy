package CodeAcademy.Zilvinas.Paskaita16.uzduotis5;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Biuzdetas {
    private int countPajamas = 0;
    private int countIslaidas = 0;

    private final PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private final IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    private void ivestiPajamas() {
        Scanner skeneris = new Scanner(System.in);
        PajamuIrasas pajamuIrasas = new PajamuIrasas();

        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy MM dd");

        System.out.println("Iveskite pinigu suma: ");
        pajamuIrasas.setSuma(skeneris.nextDouble());

        System.out.println("Iveskite kategorijos indeksa: ");
        pajamuIrasas.setKategorijosIndekasas(skeneris.nextInt());

        pajamuIrasas.setData(LocalDateTime.now().format(data));

        System.out.println("Iveskite pozymi ar pinigai gauti i banko saskaita");
        pajamuIrasas.setPozymis(skeneris.next());

        System.out.println("Ivesk papildoma info");
        pajamuIrasas.setPapildomaInfo(skeneris.next());

        this.pajamos[this.countPajamas] = pajamuIrasas;
        this.countPajamas++;
    }

    private void iveskiteIslaidas() {
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas();
        Scanner skorpio = new Scanner(System.in);

        DateTimeFormatter formateris = DateTimeFormatter.ofPattern("yyyy,MM,dd,HH,mm");

        System.out.println("Iveskite isleista suma");
        islaiduIrasas.setSuma(skorpio.nextDouble());

        System.out.println("Iveskite kategorijos indeksa: ");
        islaiduIrasas.setKategorijosIndeksas(skorpio.nextInt());

        islaiduIrasas.setDataLaikas(LocalDateTime.now().format(formateris));

        System.out.println("Iveskite atsiskaitymo buda: ");
        islaiduIrasas.setAtsiskaitymoBudas(skorpio.next());

        System.out.println("Iveskite kokia banko kortele naudjote: ");
        islaiduIrasas.setKokiaBankoKortele(skorpio.next());

        this.islaidos[this.countIslaidas] = islaiduIrasas;
        this.countIslaidas++;
    }

    private void spausdinkPajamuInfo() {

        if (countPajamas > 0) {
            for (int i = 0; i < countPajamas; i++) {
                System.out.println(
                        "\nInesta pinigu suma: " + pajamos[i].getSuma()
                                + "\nkategorijos indeksas: " + pajamos[i].getKategorijosIndekasas()
                                + "\ninesimo data: " + pajamos[i].getData()
                                + "\npinigu inesimo pozymis: " + pajamos[i].getPozymis()
                                + "\npapildoma info: " + pajamos[i].getPapildomaInfo());
            }
        } else {
            System.out.println("Pajamu irasu nera");
        }
    }

    private void spausdinkIslaiduInfo() {

        if (countIslaidas > 0) {
            for (int i = 0; i < countIslaidas; i++) {
                System.out.println(
                        "\nIsleista pinigu suma: " + islaidos[i].getSuma()
                                + "\nkategorijos indeksas " + islaidos[i].getKategorijosIndeksas()
                                + "\ndata: " + islaidos[i].getDataLaikas()
                                + "\natsiskaitymo budas: " + islaidos[i].getAtsiskaitymoBudas()
                                + "\nnaudota banko kortele: " + islaidos[i].getKokiaBankoKortele()
                );
            }
        } else {
            System.out.println("Islaidu irasu nera");
        }
    }

    private int apklausa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \s
                Ka norite daryti?
                Spauskite 1 noredami ivesti pajamas
                Spauskite 2 noredami ivesti islaidas
                Spauskite 3 noreadmi perziureti pajamu irasus
                Spauskite 4 noredami perziureti islaidu irasus
                Spauskite 5 noredami baigti"""
        );
        return scanner.nextInt();
    }

    void loopasProgramai() {
        int laikinas = 0;

        while (laikinas != 5) {

            laikinas = apklausa();
            switch (laikinas) {
                case 1 -> ivestiPajamas();
                case 2 -> iveskiteIslaidas();
                case 3 -> spausdinkPajamuInfo();
                case 4 -> spausdinkIslaiduInfo();
                case 5 -> System.out.println("Viso gero");
                default -> System.out.println("Ivesta neteisinga komanda");
            }
        }
    }
}
