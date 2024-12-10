
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product productA = new Product();

        System.out.println("Enter product data");
        System.out.print("Name: ");
        productA.name = sc.nextLine();

        System.out.print("Price: ");
        productA.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        productA.quantity = sc.nextInt();

        System.out.println(productA.name + "," + productA.price + "," + productA.quantity);


        sc.close();
    }
}