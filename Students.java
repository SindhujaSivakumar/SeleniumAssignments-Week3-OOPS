package week3.day2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id: "+id+"		Student Name: "+name);
	}	
	public void getStudentInfo(String email, long phno) {
		System.out.println("Student Email: "+email+"	Student PhoneNumber: "+phno);
	}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(1001);
		stud.getStudentInfo(1001, "Sindhu");
		stud.getStudentInfo("aaa@cc.com", 1234567812);
	}
}
