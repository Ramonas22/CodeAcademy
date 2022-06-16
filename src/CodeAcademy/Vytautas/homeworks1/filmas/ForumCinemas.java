package CodeAcademy.Vytautas.homeworks1.filmas;

class ForumCinemas {

    public static void main(String[] args){
        Filmas filmas1 = new Filmas("Gruozio 13" , "Siaubo" , 5.4);
        Filmas filmas2 = new Filmas("Spali be lapu" , "Dokumentinis" , 4.2);
        Filmas filmas3 = new Filmas("Orsa" , "Istorinis" , 8.4);
        Filmas filmas4 = new Filmas("Sterallis: Attack on autobots" , "Siaubo" , 10);

        OperacijosFilmai operacijosFilmai = new OperacijosFilmai();

        Filmas[] filmaiSeskmadieni = {filmas1, filmas2, filmas3, filmas4};

        System.out.println();
        filmas3.spausdinkInfo();
        System.out.println();
        System.out.println("Geriausias sekmadeinio filmas: ");
        operacijosFilmai.geriausiasFilmas(filmaiSeskmadieni).spausdinkInfo();

        System.out.println();
        System.out.println("Blogiausias sekmadeinio filmas: ");
        operacijosFilmai.blogiausiasFilmas(filmaiSeskmadieni).spausdinkInfo();

        System.out.println();
        System.out.println("Siaubo filmai sekmadeini: ");
        Filmas[] siauboFilmai = operacijosFilmai.siauboFilmai(filmaiSeskmadieni);

        for (Filmas filmas: siauboFilmai
             ) {
            filmas.spausdinkInfo();
        }

    }
}
