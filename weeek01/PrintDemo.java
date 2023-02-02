//print is used to print the string on console.
//println is used to print the string and also add new line after that.
//printf is used to print the string with format of %s,%d,%f etc..


public class PrintDemo {

	public static void main(String[] args) {
        
		System.out.println("Hello World"); //this will be printed on console with a new line character at end of it. 
		System.out.print("This is a test"); // this will be printed on console without any new line character at end of it. 
		System.out.printf("%.2f", 10/3); // here we are printing the output in decimal formate with 2 places after decimal point . 

	}
}