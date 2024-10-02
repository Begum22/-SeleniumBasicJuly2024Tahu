package dummy;

public class Array {

	public static void main(String[] args) {
		Array array = new Array();
		array.countstudents();
		

	}
 public void countstudents() {
	 //String studentOne="Oyon";
	 //String studentTwo="Tahura";
	 //String studentThree="Salman";
	 
	 //array -> [] only for same data type when there is multiple variables
	 //written instead of writing one by one
	 //one dimensional array
	 String [] students = {"Oyon" , "Tahura" ,  "Salman" , "Shakil"};
	 
	 System.out.println(students);
 
 for( int i = 0; i < students.length; i++)  {
		System.out.println(students[i]);
 }
 for( int i = 0; i < students.length; i++)  {
	 if (students[i].equalsIgnoreCase("Salman")) {
		 break;
	 }
		 System.out.print(students[i]);
	 }
}
}
