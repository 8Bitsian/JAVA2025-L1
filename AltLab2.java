// Alternative Interview Question for Lab 2
public class AltLab2 {
  public static void main(String[] args) {
    // Define Variables
    String name;
    int number;
    double pi;
    
    //Section A name (println)
    System.out.println("Name?");
    
    System.out.print("My name is " + firstName + myMiddle + ". " + lastName ".\n");
    System.out.print("I am " + myAge + " years old.\n");
    System.out.print("Pi is " + PI + "\n");
    
    //Section B number (print)
    System.out.println("Name   : " + myName);
    System.out.println("Initial: " + myMiddle);
    System.out.println("Age    : " + myAge);
    System.out.println("Pi     : " + PI);
    
    //Section C pi (printf)
    System.out.println("My name is %s %c. %s amd %d years old.\n", firstName, myMiddle, lastName, myAge);
    System.out.printf("Pi     : %.6f\n", PI);
    System.out.printf("Pi     : %.5f\n", PI);
    System.out.printf("Pi     : %.4f\n", PI);
    System.out.printf("Pi     : %.3f\n", PI);
    System.out.printf("Pi     : %.2f\n", PI);
  }
}
