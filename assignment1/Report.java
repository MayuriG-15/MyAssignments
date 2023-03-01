package week1.assignment1;

public class Report {

	public static void main(String[] args) {
		Student sobj=new Student();
		String sName = sobj.stuName;
		int rNo = sobj.rollNo;
		String cName = sobj.collegeName;
		int mark=sobj.markScored;
		float scgpa=sobj.cgpa;
		System.out.println("***Student Report Card***");
		System.out.println("Student Name: "+sName);
		System.out.println("Roll No: "+rNo);
		System.out.println("College Name: "+cName);
		System.out.println("Mark Scored: "+mark);
		System.out.println("Percentage (CGPA): "+scgpa);
	}

}
