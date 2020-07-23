

enum Gender {Male,Female};
enum Course {Db,Java,Erp};
enum Semester {Spring,Summer,Winter};

public class RegisterForm {

	String SName;
	Gender StudentGenger ;
	Course StudentCourse ;
	Semester StudentSemester;
	
	RegisterForm  (){
		
		SName="Raslan";
	    StudentGenger =Gender.Male;
	    StudentCourse =Course.Java;
	    StudentSemester =Semester.Spring;
	    
	}
	
	
	public static void main(String [] Args) {
		
		Gender g =Gender.Male;
		Gender gg =Gender.Male;
		
		System.out.println(g.compareTo(gg));
	}
	}
