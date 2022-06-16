package CodeAcademy.Zilvinas.Papildomai.Bankomatas;

import java.util.Scanner;

class Bankomatas2 {


    public static void main(String[] args) {
        BankomatoSaskaita manoBankomatoSaskaita = new BankomatoSaskaita();
        parodyk(manoBankomatoSaskaita);
        inesti(manoBankomatoSaskaita);
        parodyk(manoBankomatoSaskaita);
        issimimas(manoBankomatoSaskaita);
        parodyk(manoBankomatoSaskaita);
    }

    private static class BankomatoSaskaita {
        int eur100, eur50, eur20, eur10, eur5;

        public int getEur100() {
            return eur100;
        }

        public void setEur100(int eur100) {
            this.eur100 = eur100;
        }

        public int getEur50() {
            return eur50;
        }

        public void setEur50(int eur50) {
            this.eur50 = eur50;
        }

        public int getEur20() {
            return eur20;
        }

        public void setEur20(int eur20) {
            this.eur20 = eur20;
        }

        public int getEur10() {
            return eur10;
        }

        public void setEur10(int eur10) {
            this.eur10 = eur10;
        }

        public int getEur5() {
            return eur5;
        }

        public void setEur5(int eur5) {
            this.eur5 = eur5;
        }

        BankomatoSaskaita() {
            eur100 = 0;
            eur50 = 0;
            eur20 = 0;
            eur10 = 0;
            eur5 = 0;
        }
    }

    private static void parodyk(BankomatoSaskaita bankomatoSaskaita) {
        System.out.println("100 euru banknotu yra: " + bankomatoSaskaita.getEur100() + "\n50 euru banknotu yra: " + bankomatoSaskaita.getEur50()
                + "\n20 euru banknotu yra: " + bankomatoSaskaita.getEur20() + "\n10 euru banknotu yra: " + bankomatoSaskaita.getEur10()
                + "\n5 euru banknotu yra: " + bankomatoSaskaita.getEur5()
                + "\nVisu banknotu suma = " + suma(bankomatoSaskaita));
    }

    private static int suma(BankomatoSaskaita bankomatoSaskaita) {
        return bankomatoSaskaita.getEur100() * 100 + bankomatoSaskaita.getEur50() * 50 + bankomatoSaskaita.getEur20() * 20
                + bankomatoSaskaita.getEur10() * 10 + bankomatoSaskaita.getEur5() * 5;
    }

    private static int apklausaInesimui() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Pasirinkite koki veiksma norite atlikti:\s
                Spauskite 1 noredami inesti 100 euru banknota
                Spauskite 2 noredami inesti 50 euru banknota
                Spauskite 3 noredami inesti 20 euru banknota
                Spauskite 4 noredami inesti 10 euru banknota
                Spauskite 5 noredami inesti 5 euru banknota
                Spauskite 6 noredami iseiti""");
        return scanner.nextInt();
    }

    private static int apklausaIsemimui() {
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

    private static void inesti(BankomatoSaskaita bankomatoSaskaita) {
        Scanner scanner = new Scanner(System.in);
        int pasirinkimas = apklausaInesimui();
        while (pasirinkimas != 6) {
            switch (pasirinkimas) {
                case 1 -> {
                    System.out.println("Kiek kupiuru 100 euru norite inesti: ");
                    bankomatoSaskaita.setEur100(bankomatoSaskaita.getEur100() + scanner.nextInt());
                    pasirinkimas = apklausaInesimui();
                }
                case 2 -> {
                    System.out.println("Kiek kupiuru 50 euru norite inesti: ");
                    bankomatoSaskaita.setEur50(bankomatoSaskaita.getEur50() + scanner.nextInt());
                    pasirinkimas = apklausaInesimui();
                }
                case 3 -> {
                    System.out.println("Kiek kupiuru 20 euru norite inesti: ");
                    bankomatoSaskaita.setEur20(bankomatoSaskaita.getEur20() + scanner.nextInt());
                    pasirinkimas = apklausaInesimui();
                }
                case 4 -> {
                    System.out.println("Kiek kupiuru 10 euru norite inesti: ");
                    bankomatoSaskaita.setEur10(bankomatoSaskaita.getEur10() + scanner.nextInt());
                    pasirinkimas = apklausaInesimui();
                }
                case 5 -> {
                    System.out.println("Kiek kupiuru 5 euru norite inesti: ");
                    bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() + scanner.nextInt());
                    pasirinkimas = apklausaInesimui();
                }
                default -> {
                    System.out.println("Ivedete neteisinga skaiciu");
                    pasirinkimas = apklausaInesimui();
                }
            }
        }
    }

    private static void issimimas(BankomatoSaskaita bankomatoSaskaita) {
        Scanner scanner = new Scanner(System.in);
        int pasirinkimas = apklausaIsemimui(), pinigaiIsiemimui;
        while (pasirinkimas != 6) {
            switch (pasirinkimas) {
                case 1 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax100e(bankomatoSaskaita, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();

                }
                case 2 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax50e(bankomatoSaskaita, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                case 3 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax20e(bankomatoSaskaita, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                case 4 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax10e(bankomatoSaskaita, pinigaiIsiemimui);
                    } else {
                        System.out.println("Ivesta neteisinga pinigu suma, ji turetu dalintis bent is 5");
                    }
                    pasirinkimas = apklausaIsemimui();
                }
                case 5 -> {
                    System.out.println("Kiek kupiuru pinigu noresite issiimti: ");
                    pinigaiIsiemimui = scanner.nextInt();
                    if (pinigaiIsiemimui % 5 == 0) {
                        isimtiMax5e(bankomatoSaskaita, pinigaiIsiemimui);
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
    }

    private static void isimtiMax100e(BankomatoSaskaita bankomatoSaskaita, int pinigai) {
        int laikinas = 0;

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

        } else {
            System.out.println("Nera tiek pinigu bankomate");
        }
    }

    private static void isimtiMax50e(BankomatoSaskaita bankomatoSaskaita, int pinigai) {
        int laikinas = 0;

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

        } else {
            System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
        }
    }

    private static void isimtiMax20e(BankomatoSaskaita bankomatoSaskaita, int pinigai) {
        int laikinas = 0;

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

        } else {
            System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
        }
    }

    private static void isimtiMax10e(BankomatoSaskaita bankomatoSaskaita, int pinigai) {
        int laikinas = 0;

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
        }
    }

    private static void isimtiMax5e(BankomatoSaskaita bankomatoSaskaita, int pinigai) {
        int laikinas = 0;

        if (bankomatoSaskaita.getEur5() * 5 >= pinigai) {
            while (bankomatoSaskaita.getEur5() > 0 && pinigai > 4) {
                pinigai -= 5;
                bankomatoSaskaita.setEur5(bankomatoSaskaita.getEur5() - 1);
                laikinas++;
            }
            System.out.println("Isimta kupiuru po 5e " + laikinas);

        } else {
            System.out.println("Nera tiek pinigu bankomate, pasirinktai operacijai");
        }
    }
}
