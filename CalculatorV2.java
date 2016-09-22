public class CalculatorV2{

	public static void main(String[] args) {
		
		System.out.print("Enter first number: ");
		double n1; //a variable of type  double being declared
		n1 = IO.readDouble(); //assigning value to n1
		System.out.print("Enter second number: ");
		double n2 = IO.readDouble(); //declaring and assigning n2
		System.out.print("Enter operation: [1]Addition, [2]Subtraction, [3]Multiplication, [4]Division");
		int operation = IO.readInt();
		
		if (operation == 1){
			double result = n1 + n2;
			System.out.println("Result: "+n1+ " + " +n2+ " = " + result);
			return;}
		else if (operation == 2){
			double result = n1 - n2;
			System.out.println("Result: "+n1+ " - " +n2+ " = " + result);
			return;}
		else if (operation == 3){
			double result = n1 * n2;
			System.out.println("Result: "+n1+ " x " +n2+ " = " + result);
			return;}
		if (operation == 4){
			if (n2 != 0){
			double result = n1 / n2;
			System.out.println("Result: "+n1+ " / " +n2+ " = " + result);
			return;
		}	else{
				System.out.println("Division by zero");
		}
			return;
		}
		
		else if (operation < 1 || operation > 4){
			System.out.println("Invalid Operation");
		}
		else {
			System.out.println("Invalid Operation > 4");
		}
	}

	


}
