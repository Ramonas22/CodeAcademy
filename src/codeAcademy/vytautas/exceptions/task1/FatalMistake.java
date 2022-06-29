package codeAcademy.vytautas.exceptions.task1;

class FatalMistake extends LandingGearExtensionException{
    public FatalMistake(String message, String causes) {
        super(message, causes);
    }
}
