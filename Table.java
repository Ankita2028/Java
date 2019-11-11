import java.util.Scanner;
public class Table {

  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt ();

   for(int i=1;i<=10;i++)
   {
      int c=n*i;
      System.out.println(""+c);
   }
   scan.close();
  }
}
