package thread.objectofstudentinto2threads;

public class JobB implements Runnable{
	
	Student student;
	
	JobB(Student student){
		this.student = student;
	}

	@Override
	public void run() {
		student.name = "Priya";
	}
	
	

}
