package Demo;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		try {
		System.out.println("Hello world...!");
		
		int i = 1/0;
		System.out.println("Completed");
		}
		catch(Exception exp) {
			
			System.out.println("now there will be no error");
			System.out.println("Message is:" +exp.getMessage());
			System.out.println("cause is :" +exp.getMessage());
			exp.printStackTrace();
		}
		finally {
			System.out.println("final block");
		}
		
	}

}
