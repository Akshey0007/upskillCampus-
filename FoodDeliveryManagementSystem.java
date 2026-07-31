
import java.util.*;
public class FoodDeliveryManagementSystem {
    static Scanner sc=new Scanner(System.in);
    static String[] items={"Pizza","Burger","Pasta","Sandwich","Cold Drink"};
    static int[] prices={250,120,180,150,60};
    public static void main(String[] args){
        System.out.println("=== Food Delivery Management System ===");
        System.out.print("Enter Username: ");
        String u=sc.nextLine();
        System.out.print("Enter Password: ");
        String p=sc.nextLine();
        if(!u.equals("admin")||!p.equals("1234")){
            System.out.println("Invalid Login");
            return;
        }
        int grand=0;
        while(true){
            System.out.println("\nMenu");
            for(int i=0;i<items.length;i++) System.out.println((i+1)+". "+items[i]+" Rs."+prices[i]);
            try{
                System.out.print("Choice: ");
                int ch=Integer.parseInt(sc.nextLine());
                System.out.print("Quantity: ");
                int q=Integer.parseInt(sc.nextLine());
                int total=prices[ch-1]*q;
                grand+=total;
                System.out.println("Bill: Rs."+total);
            }catch(Exception e){System.out.println("Invalid input");}
            System.out.print("More orders? (y/n): ");
            if(!sc.nextLine().equalsIgnoreCase("y")) break;
        }
        System.out.println("Grand Total: Rs."+grand);
        System.out.println("Thank You!");
    }
}
