import java.util.Scanner;
public class Main{
  public static void main(String[]arg){
    Scanner scanner=new Scanner (System.in);
    int x= scanner.nextInt();
    int y= scanner.nextInt();
    int result= x+y;
    System.out.println(result);
    scanner.close();
  }
}
