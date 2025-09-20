// Alternative Interview Question for Lab 2
import java.util.Scanner; // Scanner is in the java.util package

public class AltLab2 {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);
    
    //Section A name (println)
    System.out.println("Name?");
    String name = input.nextLine();
    System.out.println(name);

    // Section B number (print)
    System.out.print("Integer? ");
    int number = input.nextInt();
    System.out.println(number);

    // Section C pi (printf);
    final double PI = 3.141529;
    System.out.print("Pi? ");
    int decimals = input.nextInt();
    System.out.print("Pi: %." + decimals + "f\n", PI);
  }
}
