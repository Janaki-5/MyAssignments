package week1.day2;


public class Report {
    public static void main(String[] args) {
        Student studentObj = new Student();

        System.out.println("Student Name: " + studentObj.studentName);
        System.out.println("Roll No: " + studentObj.rollNo);
        System.out.println("College Name: " + studentObj.collegeName);
        System.out.println("Mark Scored: " + studentObj.markScored);
        System.out.println("CGPA: " + studentObj.cgpa);
    }
}