import java.util.Scanner;

public class FoodDeliveryManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String username = "admin";
    static String password = "1234";

    static String[] items = {"Pizza", "Burger", "Pasta", "Cold Drink"};
    static int[] prices = {250, 120, 180, 60};

    public static boolean login() {

        System.out.print("Username: ");
        String u = sc.nextLine();

        System.out.print("Password: ");
        String p = sc.nextLine();

        return username.equals(u) && password.equals(p);
    }

    public static void showMenu() {

        System.out.println("\n----- MENU -----");

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
        }

        System.out.print("Choose Item: ");
        int choice = sc.nextInt();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        generateBill(choice, qty);
    }

    public static void generateBill(int choice, int qty) {

        int total = prices[choice - 1] * qty;

        System.out.println("\n========== BILL ==========");
        System.out.println("Item: " + items[choice - 1]);
        System.out.println("Price: Rs." + prices[choice - 1]);
        System.out.println("Quantity: " + qty);
        System.out.println("--------------------------");
        System.out.println("Total: Rs." + total);
        System.out.println("==========================");
        System.out.println("Thank You!");
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" FOOD DELIVERY MANAGEMENT SYSTEM");
        System.out.println("====================================");

        if (login()) {
            showMenu();
        } else {
            System.out.println("Invalid Login!");
        }
    }
}
