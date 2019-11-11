import java.util.Scanner;
class FunctionDemo1{
	public static void main(String[] args){
	FunctionDemo1 obj = new FunctionDemo1();
	int input = obj.getInput();
	System.out.println("input = " + input);

	}
    //function defination
    int getInput(){
	Scanner sc = new Scanner(System.in);
    System.out.println("enter roll no");
    int rollno=sc.nextInt();
    return rollno;
	}

  }

