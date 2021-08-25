package constructor.businessUseCase;

public class Greeting_Message2 {

	String greeting_msg = "Hello"; 
	String user_Name ="Guest";
	
	Greeting_Message2() {
		// this constructor is just for default clients
	}
	Greeting_Message2(String gMsg, String uName) {
		greeting_msg = gMsg; 
		user_Name = uName;
	}
	String getEmailTxt(String emailMsg) { 
		String completeMsg = greeting_msg +" " + user_Name + " " + emailMsg; 
		System.out.println(completeMsg); 
		return completeMsg;
	} 
	String getSmsTxt(String smsMsg) {
		String completeMsg = greeting_msg + " " + user_Name + " "  +smsMsg;
		return completeMsg;
	}

}
