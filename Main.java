import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet Savu Vardu ");

        String vards = scanner.nextLine();


        System.out.println("Ievadiet Savu Vecumu");

        int vecums = scanner.nextInt();

        System.out.println("Ievadiet Savu augumu metros");

        double augums = scanner.nextDouble();


        System.out.println("Vai jums patik programmet ? (Ja:Ne) ");


        scanner.nextLine();
        String atbilde = scanner.nextLine();
        boolean patikProgrammet = atbilde.equalsIgnoreCase(("Ja") );



        scanner.close();

        int vecumsDeienas = vecums *365;
        double augumsCm = augums *250;

        System.out.println("\nIevadita informacija");
        System.out.println("vards" + vards);
        System.out.println("vecums" + vecums + "gadi");
        System.out.println("augums" + augums + "Cm");
        System.out.println("Patik programmet" + patikProgrammet + "Ja" );
        System.out.println("vecumsDienas" + vecumsDeienas);
        System.out.println("augumsCm" + augums);





















    }
}