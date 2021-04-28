
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demirog", "C# + Angular");
		
		
		Course course2 = new Course();
		course2.id = 2	;
		course2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course2.teacherName = "Engin Demirog";
		course2.detail= "Java + React ";
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giriþ için Temel Kurs";
		course3.teacherName = "Engin Demirog";
		course3.detail= "Temel Kurs ";
		
		Course courses[] = {course1, course2,course3};
		for (Course course : courses) {
			System.out.println(course.name);
			}
		System.out.println("-----------------");
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Kurslarým";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Tüm Kurslar";
		
		Category category3 = new Category();
		category3.id = 3;
		category3.name = "Kampa Hazýrlýk";
		
		Category category4 = new Category();
		category4.id = 4;
		category4.name = "Sýk Sorulan Sorular";
		
		Category categories[] = {category1, category2,category3,category4};
		for (Category category : categories) {
			System.out.println(category.name);
			}
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		
		courseManager.subtractToCourse(course3);
	}

}
