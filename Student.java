package week1.day2;

public class Student {

	public static void main(String[] args) {
			Student obj= new Student();
			obj.StudentDetails();

		}
		String studentName = "janaki";
	    int rollNo = 153;
	    String collegeName = "ABC College";
	    int markScored = 486;
	    float cgpa = 8.7f;
	    public void StudentDetails() {
			System.out.println(studentName);
			System.out.println(rollNo);
			System.out.println(collegeName);
			System.out.println(markScored);
			System.out.println(cgpa);	
	}
}