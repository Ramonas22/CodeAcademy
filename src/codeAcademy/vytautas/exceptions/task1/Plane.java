package codeAcademy.vytautas.exceptions.task1;

import java.util.Random;

class Plane {
    void extendLandingGear() {
        try {
            int randomNumber = new Random().nextInt(2);
            int i = 5 / randomNumber;
            System.out.println("Landing gear extended successfully");
        } catch (Exception e) {
            try {
                landingGear();
            } catch (LandingGearExtensionException ex) {
                System.out.println(ex.getMessage() + " " + ex.getCauses());
            }
        } finally {
            System.out.println("INFO: plane still flying");
        }
    }

    void landingGear() throws LandingGearExtensionException {
        int randomNumber = new Random().nextInt(5);
        switch (randomNumber) {
            case 0 ->
                    throw new CriticalMistake("Critical Mistake", "Could not extend landing gear, since wheel feel off");
            case 1 ->
                    throw new LandingGearExtensionException("Normal message", "Could not extend landing gear, since it wasn't retracted");
            case 2 ->
                    throw new CriticalMistake("Critical Mistake", "Could not extend landing gear, since it's stuck !!!");
            case 3 ->
                    throw new NonCriticalMistake("Non critical mistake", "Could not extend landing gear, since this model does not have extendable landing gear");
            case 4 -> throw new FatalMistake("Fatal mistake", "Could not extend landing gear, since plane is on fire");
            case 5 ->
                    throw new FatalMistake("Fatal mistake", "Could not extend landing gear, since OMG look who is there...");
        }
    }
}
