package codeAcademy.zilvinas.inheritance2.task3;

class Program {

    public static void main(String[] args) {
        Vault database = new Database();
        Vault remoteDisk = new RemoteDrive();


        save(database, new Info(1,"Labas vakaras Krabas") );
        findByID(database, 1);
        findByText(database, "Krabas");

        save(remoteDisk, new Info(2, "Viso gero Krabai"));
        findByID(remoteDisk, 1);
        findByText(remoteDisk, "Krabais");
    }

    static void save(Vault vault, Info info){
        vault.saveInfo(info);
    }
    static void findByID(Vault vault, Integer ID){
        System.out.println(vault.findInfo(ID));
    }
    static  void findByText(Vault vault, String text){
        System.out.println(vault.findInfo(text));
    }
}
