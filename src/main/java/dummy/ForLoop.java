package dummy;

public class ForLoop {
	public static void main(String[] args) {
		ForLoop fl = new ForLoop();
		fl.countApples();
		
		
	}
	public void countApples() {
		//basic
		for( int i = 0; i <= 100; i++)  {
			System.out.print(i);
		}
		//count 10++
		for( int i = 0; i <= 100; i+=10)  {
			System.out.println(i);
		}
		//basic break
		for( int i = 0; i <= 10; i++)  {
			if (i ==5) {break;}
			System.out.print(i);
		}
	}
}
