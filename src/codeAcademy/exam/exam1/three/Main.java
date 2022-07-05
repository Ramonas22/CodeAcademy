package codeAcademy.exam.exam1.three;

class Main {

    public static void main(String[] args) throws AddressNullException{
        Address address = new Address("Kedainiai", "Basanaviciaus 132");
        System.out.println(getCityName(address));

        Address address1 = new Address();
        System.out.println(getCityName(address1));
    }
    static String getCityName(Address object){
        try {
            if(object.getCity().getName() != null){
                return object.getCity().getName();
            }else {
                throw new AddressNullException("Object is null");
            }
        } catch (AddressNullException e) {
            return e.getMessage();
        }
    }
}
