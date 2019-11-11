import java.util.Scanner;
public class MyMain{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    MyMain mobj =new MyMain();

    int option = 0;
    do{
      // menu display
      option= mobj.displayMenu(sc);
      //on the basis of option perform operation
      //display result of operation
    }
    while(option !=0);
  }
  int displayMenu(Scanner obj){
  }
  int getInput(Scanner obj){
  }
}
