package codeAcademy.zilvinas.nullExcercies.task1;

class Task1 {

    public static void main(String[] args) {

        Address address = new Address("Kedainiai");
        System.out.println(getTownName(address));

        Address address1 = new Address(null);
        System.out.println(getTownName(address1));
    }
    static String getTownName(Address address) {
        if (address.town.getTitle() != null) {
            return address.town.getTitle();
        }
        return "Town does not have name";
    }
}
