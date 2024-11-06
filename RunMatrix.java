import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int userInput;

    Scanner input = new Scanner(System.in);

    System.out.print("\tPlease enter the size of your matrix: ");
    userInput = input.nextInt();
    input.close();

    System.out.println(" ");
    System.out.println("\tYour matrix is " + userInput + " x " + userInput);
    System.out.println(" ");
    System.out.println("\tPrinting matrix with default values:");

    int[][] table = new int[userInput][userInput];
  }
}
