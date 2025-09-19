// Part 3 of Lab Project
public class J102_2 {
  public static void main(String[] args) {
    // Deifne Variables
    String myName = "Imani Hollie"
    String firstName = "Imani";
    String lastName = "Hollie";
    char myMiddle = 'C';
    int myAge = 22;
    final double PI = 3.141592; // pi is a constant
    
    //Section A print
    System.out.print("My name is " + firstName + myMiddle + ". " + lastName ".\n");
    System.out.print("I am " + myAge + " years old.\n");
    System.out.print("Pi is " + PI + "\n");
    
    //Section B println
    System.out.println("Name   : " + myName);
    System.out.println("Initial: " + myMiddle);
    System.out.println("Age    : " + myAge);
    System.out.println("Pi     : " + PI);
    
    //Section C printf
    System.out.println("My name is %s %c. %s amd %d years old.\n", firstName, myMiddle, lastName, myAge);
    System.out.printf("Pi     : %.6f\n", PI);
    System.out.printf("Pi     : %.5f\n", PI);
    System.out.printf("Pi     : %.4f\n", PI);
    System.out.printf("Pi     : %.3f\n", PI);
    System.out.printf("Pi     : %.2f\n", PI);
  }
}
