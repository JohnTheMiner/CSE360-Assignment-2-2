package cse360assign2;

public class Main {
	public static void main(String Args[]){
		//testing the object
		AddingMachine myCalculator = new AddingMachine();
		//the example
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println("Total = "+myCalculator.getTotal());
		//testing duplicate calls
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.toString());
		
		myCalculator.add(5);
		System.out.println("Total = "+myCalculator.getTotal());//making sure it changes with commands
		System.out.println(myCalculator.toString());
		myCalculator.clear(); //testing clear
		System.out.println("Total = "+myCalculator.getTotal());
		System.out.println(myCalculator.toString());
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		//testing negative
		myCalculator.subtract(5);
		myCalculator.subtract(5);
		System.out.println("Total = "+myCalculator.getTotal());
		System.out.println(myCalculator.toString());
	}
}
