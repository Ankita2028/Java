import java.util.Scanner;
public class UserInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputVariable = scanner.nextInt();
    System.out.print(inputVariable);
    scanner.close();
  }
}
