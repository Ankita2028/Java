import java.util.Scanner;

public class FunctionDemo {
	public static void main(String[] args) {
		System.out.println("Enter two integer");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		FunctionDemo obj = new FunctionDemo();
		//function calling
		int sum = obj.add(input1, input2);
		boolean even = obj.isEven(sum);
		if (even) {
			System.out.println("Sum is even");
		} else {
			System.out.println("Sum is odd");
		}
	}

	// function declare
	int add(int no1, int no2) {
		//functionality of this function
		int response = 0;
		response = no1 + no2;
		return response;
	}

	//function declaration
	boolean isEven(int sum) {
		//functionality of this function
		boolean response = false;
		if (sum % 2 == 0) {
			response = true;
		}
		return response;
	}
}
