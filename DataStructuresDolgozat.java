import java.util.LinkedList;

public class DataStructuresDolgozat {
    public static void main(String[] args) {
        LinkedList<String> fovarosok = new LinkedList<>();
        fovarosok.add("Wien");
        fovarosok.add("Budapest");
        fovarosok.add("Prag");
        fovarosok.add("Bratislava");

        for(int i = 0; i < fovarosok.size(); i++) {
            System.out.print(fovarosok.get(i) + ", ");
        }

        ujElemHozzaadasa(fovarosok, "Ljubljana");
        ujElemHozzaadasa(fovarosok, "Sarajevo");
        ujElemHozzaadasa(fovarosok, "Zagreb");
        
        System.out.println("\n");
        for(int i = 0; i < fovarosok.size(); i++) {
            System.out.print(fovarosok.get(i) + ", ");
        }

        torolElemet(fovarosok, "Sarajevo");

        System.out.println("\n");
        for(int i = 0; i < fovarosok.size(); i++) {
            System.out.print(fovarosok.get(i) + ", ");
        }

         String[] fovarosOrszagParr = {"Wien", "Österreich", "Budapest", "Magyarország", "Ljubljana", "Slovenija"};
         System.out.println("\n\nFőváros-ország párok: ");
         for (int i = 0; i < fovarosOrszagParr.length; i += 2) {
             System.out.println(fovarosOrszagParr[i] + ", " + fovarosOrszagParr[i + 1]);
         }
        ujFovarosOrszagPar(fovarosok);

         torolAdatPart(fovarosok);

         ujElemHozzaadasa(fovarosok, "Zagreb");
         torolElemet(fovarosok, "Ljubljana");
         
         try {
             torolElemet(fovarosok, "Prag");
         } catch (Exception e) {
             System.out.println("\nError: " + e.getMessage());
         }
    }

    public static void ujElemHozzaadasa(LinkedList<String> fovarosok, String varos) {
        fovarosok.add(varos);
    }

    public static void torolElemet(LinkedList<String> fovarosok, String torlendo) {
        fovarosok.remove(torlendo);
    }

    public static void torolAdatPart(LinkedList<String> fovarosok) {
        fovarosok.remove("Ljubljana");
    }

    public static void ujFovarosOrszagPar(LinkedList<String> fovarosok) {
        fovarosok.add("Zagreb");
        fovarosok.add("Horvátország");
    }

}
