package pizza;

import java.util.Scanner;

public class PizzaService {
	private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    private static int printMenu() {
        PizzaDao oprs = new PizzaDao();
        System.out.println("1:Insert 2:Delete 3:Update 4:Search 5:ListALl 6:Exit \t Your Choice: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1 : oprs.insertPizza(); break;
            case 2 : oprs.deletePizza(); break;
            case 3 : oprs.updatePizza(); break;
            case 4 : oprs.searchPizza(); break;
            case 5 : oprs.listAllPizza(); break;
            case 6 : System.out.println("End of Program");
            choice = -1; break;
            default: System.out.println("Invalid choice entered");
        }
        return choice;
    }

    private static void startApp() {
        int choice = 0;
        do {
            choice = printMenu();
        }while(choice != -1);
    }

    public static void main(String[] args) {
        startApp();
    }
}
