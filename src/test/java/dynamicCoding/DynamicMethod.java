package dynamicCoding;

public class DynamicMethod {

	public static void main(String[] args) {
		
		DynamicMethod dm = new DynamicMethod();
		//static coding
		dm.fullName();
		/*
		 * dynamic coding with void method
		 * in the void method
		 * whatever logics/argument you made is final
		 * 60% like this used in Selenium
		 */
		dm.dynamicFullName("Lima", "Begum");
		dm.dynamicFullName("Salman", "Shahriar");
		
		//dynamic coding with return method
		 /*in the return type method
		  * whatever logics/argument you made 
		  * you can take them to another method or bloc
		  * and modify them like add, subtract etc.
		  * 20% used like this
		  */
	
		String upperCaseName=dm.returnTypefullName("faruq", "molla").toUpperCase();
		System.out.println(upperCaseName);
		String lowerCase= dm.returnTypefullName("Tahdul", "Alom").toLowerCase();
		System.out.println(lowerCase);
		
		
		//you use many times -- dynamic coding. its not static coding which is like name, never change.
	}
public void fullName() {
	String firstName = "Tahura";
	String lastName = "Begum";
	String fullName = firstName + " "+ lastName;
	System.out.println(fullName);
	
	
	
}
	public void dynamicFullName(String firstName, String lastName) {
		String fullName=firstName + " " + lastName;
		System.out.println(fullName);
	}
	
	public String returnTypefullName(String firstName, String lastName) {
		String fullName=firstName + " " + lastName;
		System.out.println(fullName);
		return fullName;
		
		
		
		
		
	}
	
}
