
public class Course {
	
	public Course() {
		System.out.println("Ben çalýþýyorum!");
	}
	
	
	public Course(int id,String name,String teacherName,String detail ) {
		this();
		this.id= id;
		this.name = name;
		this.teacherName = teacherName;
		this.detail = detail;
		
	}

		int id;
		String name;
		String teacherName;
		String detail;
		

	
}

