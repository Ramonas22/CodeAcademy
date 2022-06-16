package CodeAcademy.Zilvinas.Bankomatas3XD;


import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class BankomatoOperacijosVietines {


    private int visoKupiuru(@NotNull Bankomatas bankomatas) {
        return bankomatas.getEur100() + bankomatas.getEur50() + bankomatas.getEur20() + bankomatas.getEur10() + bankomatas.getEur5();
    }

    private int suma(@NotNull Bankomatas bankomatoSaskaita) {
        return bankomatoSaskaita.getEur100() * 100 + bankomatoSaskaita.getEur50() * 50 + bankomatoSaskaita.getEur20() * 20
                + bankomatoSaskaita.getEur10() * 10 + bankomatoSaskaita.getEur5() * 5;
    }

    private void isimtiMax100e(Bankomatas bankomatoSaskaita, @NotNull Vartotojas vartotojas, int pinigai) {
        int laikinas = 0;
        int pinigai2 = pinigai;

        if (vartotojas.getSaskaita() >= pinigai) {
            if (suma(bankomatoSaskaita) >= pinigai) {
                while (bankomatoSaskaita.getEur100() > 0 && pinigai > 99) {
                    pinigai -= 100;
                    bankomatoSaskaita.setEur100(bankomatoSaskaita.getEur100() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 100e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur50() > 0 && pinigai > 49) {
                    pinigai -= 50;
                    bankomatoSaskaita.setEur50(bankomatoSaskaita.getEur50() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 50e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur20() > 0 && pinigai > 19) {
                    pinigai -= 20;
                    bankomatoSaskaita.setEur20(bankomatoSaskaita.getEur20() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 20e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur10() > 0 && pinigai > 9) {
                    pinigai -= 10;
                    bankomatoSaskaita.setEur10(bankomatoSaskaita.getEur10() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 10e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur5() > 0 && pinigai > 4) {
                    pinigai -= 5;
                    bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 5e " + laikinas);

                vartotojas.setSaskaita(vartotojas.getSaskaita() - pinigai2);
            } else {
                System.out.println("Nera tiek pinigu bankomate");
            }
        } else {
            System.out.println("Nepankanka lesu saskaitoje");
        }
    }

    private void isimtiMax50e(Bankomatas bankomatoSaskaita, @NotNull Vartotojas vartotojas, int pinigai) {
        int laikinas = 0;
        int pinigai2 = pinigai;

        if (vartotojas.getSaskaita() >= pinigai) {
            if ((suma(bankomatoSaskaita) - bankomatoSaskaita.getEur100() * 100) >= pinigai) {
                while (bankomatoSaskaita.getEur50() > 0 && pinigai > 49) {
                    pinigai -= 50;
                    bankomatoSaskaita.setEur50(bankomatoSaskaita.getEur50() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 50e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur20() > 0 && pinigai > 19) {
                    pinigai -= 20;
                    bankomatoSaskaita.setEur20(bankomatoSaskaita.getEur20() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 20e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur10() > 0 && pinigai > 9) {
                    pinigai -= 10;
                    bankomatoSaskaita.setEur10(bankomatoSaskaita.getEur10() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 10e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur5() > 0 && pinigai > 4) {
                    pinigai -= 5;
                    bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 5e " + laikinas);
                vartotojas.setSaskaita(vartotojas.getSaskaita() - pinigai2);

            } else {
                System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
            }
        } else {
            System.out.println("Nepakanka lesu saskaitoje");
        }
    }

    private void isimtiMax20e(Bankomatas bankomatoSaskaita, @NotNull Vartotojas vartotojas, int pinigai) {
        int laikinas = 0;
        int pinigai2 = pinigai;

        if (vartotojas.getSaskaita() >= pinigai) {
            if ((suma(bankomatoSaskaita) - bankomatoSaskaita.getEur100() * 100 - bankomatoSaskaita.getEur50() * 50) >= pinigai) {
                while (bankomatoSaskaita.getEur20() > 0 && pinigai > 19) {
                    pinigai -= 20;
                    bankomatoSaskaita.setEur20(bankomatoSaskaita.getEur20() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 20e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur10() > 0 && pinigai > 9) {
                    pinigai -= 10;
                    bankomatoSaskaita.setEur10(bankomatoSaskaita.getEur10() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 10e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur5() > 0 && pinigai > 4) {
                    pinigai -= 5;
                    bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 5e " + laikinas);
                vartotojas.setSaskaita(vartotojas.getSaskaita() - pinigai2);

            } else {
                System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
            }
        } else {
            System.out.println("Nepakanka lesu saskaitoje");
        }
    }

    private void isimtiMax10e(Bankomatas bankomatoSaskaita, @NotNull Vartotojas vartotojas, int pinigai) {
        int laikinas = 0;
        int pinigai2 = pinigai;

        if (vartotojas.getSaskaita() >= pinigai) {
            if ((suma(bankomatoSaskaita) - bankomatoSaskaita.getEur100() * 100
                    - bankomatoSaskaita.getEur50() * 50 - bankomatoSaskaita.getEur20() * 20) >= pinigai) {
                while (bankomatoSaskaita.getEur10() > 0 && pinigai > 9) {
                    pinigai -= 10;
                    bankomatoSaskaita.setEur10(bankomatoSaskaita.getEur10() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 10e " + laikinas);
                laikinas = 0;
                while (bankomatoSaskaita.getEur5() > 0 && pinigai > 4) {
                    pinigai -= 5;
                    bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 5e " + laikinas);

            } else {
                System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
                vartotojas.setSaskaita(vartotojas.getSaskaita() - pinigai2);
            }
        } else {
            System.out.println("Nepakanka lesu saskaitoje.");
        }
    }

    private void isimtiMax5e(Bankomatas bankomatoSaskaita, @NotNull Vartotojas vartotojas, int pinigai) {
        int laikinas = 0;
        int pinigai2 = pinigai;

        if (vartotojas.getSaskaita() >= pinigai) {
            if (bankomatoSaskaita.getEur5() * 5 >= pinigai) {
                while (bankomatoSaskaita.getEur5() > 0 && pinigai > 4) {
                    pinigai -= 5;
                    bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() - 1);
                    laikinas++;
                }
                System.out.println("Isimta kupiuru po 5e " + laikinas);
                vartotojas.setSaskaita(vartotojas.getSaskaita() - pinigai2);

            } else {
                System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
            }
        } else {
            System.out.println("Nepakanka lesu saskaitoje");
        }
    }

    private boolean arBankomatasPilnas(@NotNull Bankomatas bankomatas) {
        return bankomatas.getKupiuruLimitas() > visoKupiuru(bankomatas);
    }

    //Apklausos
    private int apklausaInesimui() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Pasirinkite koki veiksma norite atlikti:\s
                Spauskite 1 noredami inesti 100 euru banknotus
                Spauskite 2 noredami inesti 50 euru banknotus
                Spauskite 3 noredami inesti 20 euru banknotus
                Spauskite 4 noredami inesti 10 euru banknotus
                Spauskite 5 noredami inesti 5 euru banknotus
                Spauskite 6 noredami iseiti""");
        return scanner.nextInt();
    }

    private int apklausaIsemimui() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Pasirinkite koki veiksma norite atlikti:\s
                Spauskite 1 noredami issiimti betokiokis kurpiuromis is bankomato
                Spauskite 2 noredami issiimti diziausia 50 euru kupiura is bankomato
                Spauskite 3 noredami issiimti diziausia 20 euru kupiura is bankomato
                Spauskite 4 noredami issiimti diziausia 10 euru kupiura is bankomato
                Spauskite 5 noredami issiimti diziausia 5 euru kupiura is bankomato
                Spauskite 6 noredami iseiti""");
        return scanner.nextInt();
    }


    // Kvieciamos komandos

    public void saskaitosLikutis(@NotNull Vartotojas vartotojoSaskaita) {
        System.out.println("Saskaitoje yra: " + vartotojoSaskaita.getSaskaita());
    }

    private void nusatytiPIN(@NotNull Vartotojas vartotojas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("iveskite nauja PIN");
        vartotojas.setPin(scanner.nextInt());
    }

    public void pakeistiPIN(Vartotojas vartotojas) {
        Scanner scanner = new Scanner(System.in);
        int PIN;
        System.out.println("Iveskite nauja PIN");
        PIN = scanner.nextInt();
        if (PIN < 999 || PIN > 10000) {
            System.out.println("PIN turi buti keturiu skaitemnu");
        } else {
            System.out.println("Pakartokite PIN: ");
            if (scanner.nextInt() == PIN) {
                vartotojas.setPin(PIN);
            } else {
                System.out.println("Ivestas PIN nesutampta");
            }
        }
    }

    public void piniguInesimas(Bankomatas bankomatas, Vartotojas vartotojas) {
        Scanner scanner = new Scanner(System.in);
        int pasirinkimas = apklausaInesimui(), banknotuSkaicius;
        while (pasirinkimas != 6) {
            switch (pasirinkimas) {
                case 1 -> {
                    System.out.println("Kiek kupiuru 100 euru norite inesti: ");
                    banknotuSkaicius = scanner.nextInt();
                    if (arBankomatasPilnas(bankomatas)) {
                        bankomatas.setEur100(bankomatas.getEur100() + banknotuSkaicius);
                        vartotojas.setSaskaita(vartotojas.getSaskaita() + banknotuSkaicius * 100);
                    } else {
                        System.out.println("Bankomate neuztenka vietos tokiam banknotu kiekiui");
                    }
                    pasirinkimas = apklausaInesimui();

                }
                case 2 -> {
                    System.out.println("Kiek kupiuru 50 euru norite inesti: ");
                    banknotuSkaicius = scanner.nextInt();
                    if (arBankomatasPilnas(bankomatas)) {
                        bankomatas.setEur50(bankomatas.getEur50() + banknotuSkaicius);
                        vartotojas.setSaskaita(vartotojas.getSaskaita() + banknotuSkaicius * 50);
                    } else {
                        System.out.println("Bankomate neuztenka vietos tokiam banknotu kiekiui");
                    }
                    pasirinkimas = apklausaInesimui();
                }
                case 3 -> {
                    System.out.println("Kiek kupiuru 20 euru norite inesti: ");
                    banknotuSkaicius = scanner.nextInt();
                    if (arBankomatasPilnas(bankomatas)) {
                        bankomatas.setEur20(bankomatas.getEur20() + banknotuSkaicius);
                        vartotojas.setSaskaita(vartotojas.getSaskaita() + banknotuSkaicius * 20);
                    } else {
                        System.out.println("Bankomate neuztenka vietos tokiam banknotu kiekiui");
                    }
                    pasirinkimas = apklausaInesimui();
                }
                case 4 -> {
                    System.out.println("Kiek kupiuru 10 euru norite inesti: ");
                    banknotuSkaicius = scanner.nextInt();
                    if (arBankomatasPilnas(bankomatas)) {
                        bankomatas.setEur10(bankomatas.getEur10() + banknotuSkaicius);
                        vartotojas.setSaskaita(vartotojas.getSaskaita() + banknotuSkaicius * 10);
                    } else {
                        System.out.println("Bankomate neuztenka vietos tokiam banknotu kiekiui");
                    }
                    pasirinkimas = apklausaInesimui();
                }
                case 5 -> {
                    System.out.println("Kiek kupiuru 5 euru norite inesti: ");
                    banknotuSkaicius = scanner.nextInt();
                    if (arBankomatasPilnas(bankomatas)) {
                        bankomatas.setEur5(bankomatas.getEur5() + banknotuSkaicius);
                        vartotojas.setSaskaita(vartotojas.getSaskaita() + banknotuSkaicius * 5);
                    } else {
                        System.out.println("Bankomate neuztenka vietos tokiam banknotu kiekiui");
                    }
                    pasirinkimas = apklausaInesimui();
                }
                default -> {
                    System.out.println("Ivedete neteisinga skaiciu");
                    pasirinkimas = apklausaInesimui();
                }
            }
        }
    }

    public void nusatytiKiekBanknotuTilpsBankomate(@NotNull Bankomatas bankomatas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek kupiuru tilps siame bankomate?");
        bankomatas.setKupiuruLimitas(scanner.nextInt());
    }

    public Vartotojas issimimas(Bankomatas bankomatoSaskaita, Vartotojas vartotojas) {
        Scanner scanner = new Scanner(System.in);
        int pasirinkimas = apklausaIsemimui(), pinigaiIsiemimui;
        while (pasirinkimas != 6) {
            switch (pasirinkimas) {
                case 1 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax100e(bankomatoSaskaita, vartotojas, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();

                }
                case 2 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax50e(bankomatoSaskaita, vartotojas, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                case 3 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax20e(bankomatoSaskaita, vartotojas, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                case 4 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax10e(bankomatoSaskaita, vartotojas, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                case 5 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax5e(bankomatoSaskaita, vartotojas, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                default -> {
                    System.out.println("Ivedete neteisinga skaiciu");
                    pasirinkimas = apklausaIsemimui();
                }
            }
        }
        return vartotojas;
    }

    public void pavedimas(Vartotojas vartotojas, Vartotojas[] vartotojuMasyvas) {

        Scanner scanner = new Scanner(System.in);
        int ID, pavedimoSuma;

        System.out.println("Kam iveskite kam norite pervesti pinigus ID");
        ID = scanner.nextInt();
        if (ID >= 0 && ID < vartotojuMasyvas.length) {
            System.out.println("Kiek pinigu noresite pervesti");
            pavedimoSuma = scanner.nextInt();
            if (vartotojas.getSaskaita() > pavedimoSuma) {
                vartotojas.setSaskaita(vartotojas.getSaskaita() - pavedimoSuma);
                vartotojuMasyvas[ID].setSaskaita(vartotojuMasyvas[ID].getSaskaita() + pavedimoSuma);
            } else {
                System.out.println("Saskaitoje nepakanka pinigu");
            }
        } else {
            System.out.println("Neteisingas ID");
        }
    }

    public Vartotojas[] saskaituKurimas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiek sakaitu kursite ?");
        Vartotojas[] saskaitos = new Vartotojas[scanner.nextInt()];


        for (int i = 0; i < saskaitos.length; i++) {
            saskaitos[i] = new Vartotojas();
            System.out.print("saskaitai " + (i + 1) + " ");
            nusatytiPIN(saskaitos[i]);
            saskaitos[i].setId(i);
        }
        return saskaitos;
    }


}
