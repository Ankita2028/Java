import java.util.Scanner;

public class FunctionDemo2 {
	public static void main(String[] args) {
		System.out.println("Enter integer");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		FunctionDemo2 obj = new FunctionDemo2();


	// function calling
	//int number = obj.num(int1);
  boolean even =obj.isEven(input1);
		//functionality of this function
		if(even)
    {
      System.out.println("No is even");
    }
    else
    {
      System.out.println(" No is odd");

    }
	}
	//function declare
	boolean isEven(int sum) {
		//functionality of this function
		boolean response= false;
		if (sum % 2 == 0)
    {
			response= true;
		}
		return response;
	}
}
