package constructor.businessUseCase;

public class Greeting_Message {

	String greeting_msg = "Hello"; 
	String user_Name ="Guest";

	String getEmailTxt(String emailMsg) { 
		String completeMsg = greeting_msg +" " + user_Name + " " + emailMsg; 
		System.out.println(completeMsg); 
		return completeMsg;
	}
	String getSmsTxt(String smsMsg) {
		String completeMsg = greeting_msg + " " + user_Name + " "  +smsMsg;
		return completeMsg;
	}
	
	public static void main(String[] args) {
		
		Greeting_Message gm = new Greeting_Message();
		gm.getEmailTxt("email message");
		gm.getSmsTxt("sms");
		
	}
}
