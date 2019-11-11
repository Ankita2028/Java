import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int numberToCheck = scanner.nextInt();
    int temp = numberToCheck; //  this variable stores the original value
    int remainder  = 0; //  remainder is the last digit of the number
    int sum = 0;
    while (numberToCheck > 0) {
      remainder = numberToCheck % 10; // extract last digit
      sum = (sum * 10) + remainder;
      numberToCheck = numberToCheck / 10;
    }
    if (sum == temp) {
      System.out.print(temp + " is a palindrome number.");
    } else {
      System.out.print(temp + " is not a palindrome number.");
    }
    scanner.close();
  }
}
