import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.addFirst(new Zvire("Slon","savec",18));
        list.addFirst(new Zvire("kocka","savec",5));
        list.addFirst(new Zvire("havran","ptak",2));
        list.addFirst(new Zvire("pes","savec",9));
        list.addFirst(new Zvire("Uzovka","had",1));

        boolean power = true;
        while (power) {
            System.out.println("------Menu------");
            System.out.println("1. Odstraneni prvniho zvirete");
            System.out.println("2. Vypis vsech starsich 5 let");
            System.out.println("3. Vypis nejstarsiho");
            System.out.println("4. Vypis vseho");
            System.out.println("5. Pridat zvire");
            System.out.println("0. Ukoncit");
            System.out.println("----------------");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    list.removeFirst();
                    System.out.println("Uspesne odstraneno");
                    break;
                case 2:
                    System.out.println("Zvirata starsi 5 let: ");
                    list.starsiPeti();
                    break;
                case 3:
                    System.out.println("Nejstarsi zver: ");
                    list.nejstarsi();
                    break;
                case 4:
                    list.printAll();
                    break;
                case 5:
                    System.out.println("Jmeno zvirete: ");
                    String jmeno = input.nextLine();
                    System.out.println("Druh zvirete: ");
                    String druh = input.nextLine();
                    System.out.println("Vek zvirete: ");
                    int vek = input.nextInt();
                    input.nextLine();
                    list.addFirst(new Zvire(jmeno,druh,vek));
                    System.out.println("Zvire uspesne pridano");
                    break;
                case 0:
                    power = false;
                    break;
            }
        }
    }
}
