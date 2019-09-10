import java.util.Scanner;

public class loggbok {
    public static void main (String[] args) {
        printMenu();
        Scanner loggbok = new Scanner(System.in);
        int i = loggbok.nextInt();
        if (i == 1) {
            System.out.println("Du valde visa loggbok");

        }
        if (i == 2) {
            System.out.println("Du valde att lägga till i loggbok");
        }
        if (i == 3) {
            System.out.println("Du valde att Redigera");
        }

        if (i == 4) {
            System.out.println("Du valde att Spara");
        }
        if (i == 5) {
            System.out.println("Du valde att läsa in");
        }


    }

    private static void printMenu() {
        System.out.println("1 Visa loggbok \n"
                + "2. Lägg till i loggbok \n"
                + "3 Redigera \n"
                + "4 Spara \n"
                + "5 Läs in \n"

        );

    }
}