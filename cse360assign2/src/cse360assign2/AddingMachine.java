package cse360assign2;

public class AddingMachine {

	private int total;
	private String string;
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		string ="0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		string = string +" + " + Integer.toString(value);
		total = total+value;
	}
	
	public void subtract (int value) {
		string = string +" - " + Integer.toString(value);
		total = total-value;
	}
		
	public String toString () {
		return string;//the example does not show the final result
	}

	public void clear() {
	total = 0;
	string = "0";
	}
}
