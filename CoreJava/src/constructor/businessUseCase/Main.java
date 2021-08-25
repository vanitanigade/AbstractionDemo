package constructor.businessUseCase;

public class Main {
	public static void main(String[] args){

		String emailMsg = "EMAIL :This is test email by  javabykiran";
		String smsMsg = "SMS: This is the best book for java learners";
		System.out.println("****** ICICI*******");

		// wants all default data 
		Greeting_Message2 greeting_Message = new Greeting_Message2(); 
		greeting_Message.getEmailTxt(emailMsg);
		greeting_Message.getSmsTxt(smsMsg); 
		System.out.println("****** BOA*******");

		// Different users and messages
		Greeting_Message2 greeting_MessageBOA = new Greeting_Message2 ("Hello", "KiranBOA"); 
		greeting_MessageBOA.getEmailTxt(emailMsg);
		greeting_MessageBOA.getSmsTxt(smsMsg);
		System.out.println("****** HDFC*******");

		Greeting_Message2 greeting_MessageHDFC =new Greeting_Message2 ("Hi","KiranHDFC"); 
		greeting_MessageHDFC.getEmailTxt(emailMsg);
		greeting_MessageHDFC.getSmsTxt(smsMsg);
	}

}
