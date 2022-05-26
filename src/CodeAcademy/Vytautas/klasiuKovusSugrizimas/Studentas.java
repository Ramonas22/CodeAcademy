package CodeAcademy.Vytautas.klasiuKovusSugrizimas;

import lombok.Data;

import java.util.Scanner;

@Data
public class Studentas {

    private int iq;
    private long asmensKodas;
    private String vardas;
    private String pavarde;
    private int[] pazymiai;
    private double vidrukis;

    public Studentas() {
    }

    public Studentas(int iq, long asmensKodas, String vardas, String pavarde, int[] pazymiai) {
        setIq(iq);
        setAsmensKodas(asmensKodas);
        setVardas(vardas);
        setPavarde(pavarde);
        setPazymiai(pazymiai);
        vidrukis = vidurkis();
    }

    public void suveskStudentoInfo() {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[5];
        long laikinas1;

        System.out.println("Ivesk studento iq");
        setIq(scanner.nextInt());

        while (true) {
            System.out.println("Ivesk studento asmens koda");
            laikinas1 = scanner.nextLong();
            if (laikinas1 > 9999999999L && laikinas1 < 100000000000L) {
                setAsmensKodas(laikinas1);
                break;
            } else {
                System.out.println("Asmens kode turi buti 9 skaitmenu");
            }
        }
        System.out.println("Ivesk studento varda");
        setVardas(scanner.next());

        System.out.println("Ivesk studento pavarde");
        setPavarde(scanner.next());

        for (int i = 0, laikinas; i < 5; i++) {
            System.out.println("Ivesk studento " + (i + 1) + " pazymi");
            laikinas = scanner.nextInt();
            if (laikinas > 0 & laikinas <= 10) {
                mas[i] = laikinas;
            } else {
                System.out.println("Mokomes desinmtbaleje sistemoje bandyk dar karta :D");
                i--;
            }

        }
        setPazymiai(mas);
        setVidrukis(vidurkis());
    }

    public void spausdinti() {
        System.out.println("Studento vardas: " + getVardas() +
                "\nStudento pavarde: " + getPavarde() +
                "\nStudento iq: " + getIq() +
                "\nStudento asmens kodas" + getAsmensKodas());
        System.out.print("Pazymiai: ");
        for (int i = 0; i < getPazymiai().length; i++) {
            System.out.print(getPazymiai()[i] + " ");
        }
        System.out.println("Studento pazymiu vidurkis " + getVidrukis());
    }

    private double vidurkis() {
        double suma = 0;
        for (int i = 0; i < getPazymiai().length; i++) {
            suma += getPazymiai()[i];
        }
        suma = suma / getPazymiai().length;
        return suma;
    }
}
