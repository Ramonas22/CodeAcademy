package codeAcademy.zilvinas.nullExcercies.task1;

class Address {
    Town town = new Town(null);

     Address(String title) {
        this.town.setTitle(title);
    }

}
