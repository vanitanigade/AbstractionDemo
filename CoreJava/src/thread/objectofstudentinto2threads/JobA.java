package thread.objectofstudentinto2threads;

public class JobA implements Runnable{
	
	Student student;
	
	JobA(Student student){
		this.student = student;
	}

	@Override
	public void run() {
		student.name = "Rohan";
	}
	
	
	

}
