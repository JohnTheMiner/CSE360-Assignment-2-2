package cse360assign2;
/*+----------------------------------------------------------------------
||
||  Class AddingMachine 
||
||         Author:  John Lambert
||			ID:		1214853159
||        Purpose:  have an interger that can have values added to subtracted from 
					it as well as have it cleared, displayed or show a history
					of the processes that took place 
||
||  Inherits From:  NA
||
||     Interfaces:  NA
||
|+-----------------------------------------------------------------------
||
||      Constants:  NA
||
|+-----------------------------------------------------------------------
||
||   Constructors:  None
||
||  Class Methods:  getTotal returns the value of total
					add adds a value to the total and adds the transaction to the string
					subtract subtracts a value from the total and adds the transaction to the string
					toString returns the list of transactions
					clear clears the string and the total
||
||
++-----------------------------------------------------------------------*/
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
