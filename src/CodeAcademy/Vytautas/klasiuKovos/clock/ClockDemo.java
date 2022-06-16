package CodeAcademy.Vytautas.klasiuKovos.clock;

import java.util.Scanner;

class ClockDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Clock firstClock = new Clock(59);

        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock.toString());

        }

        System.out.println("Enter hours, then minutes and then second of your new clock");
        Clock secondClock = new Clock(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        for (int i = 0; i < 10; i++) {
            secondClock.tickDown();
            System.out.println(secondClock.toString());
        }

        secondClock.addClock(firstClock);
        System.out.println(secondClock.toString());

        Clock thirdClock = firstClock.subractClock(secondClock);
        System.out.println(thirdClock.toString());

    }
}
