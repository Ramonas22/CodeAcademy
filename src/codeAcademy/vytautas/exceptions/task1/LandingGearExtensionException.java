package codeAcademy.vytautas.exceptions.task1;

class LandingGearExtensionException extends Exception{
        private String causes;

        public LandingGearExtensionException(String message, String causes) {
                super(message);
                this.causes = causes;
        }

        public String getCauses() {
                return causes;
        }
        public void setCauses(String causes) {
                this.causes = causes;
        }
}
