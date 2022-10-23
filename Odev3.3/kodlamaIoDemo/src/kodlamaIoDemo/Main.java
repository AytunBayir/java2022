package kodlamaIoDemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoDemo.business.CategoryManager;
import kodlamaIoDemo.business.CourseManager;
import kodlamaIoDemo.business.UserManager;
import kodlamaIoDemo.core.logging.DatabaseLogger;
import kodlamaIoDemo.core.logging.FileLogger;
import kodlamaIoDemo.core.logging.Logger;
import kodlamaIoDemo.core.logging.MailLogger;
import kodlamaIoDemo.dataAccess.HibernateDao;
import kodlamaIoDemo.dataAccess.JdbcDao;
import kodlamaIoDemo.entities.BaseUser;
import kodlamaIoDemo.entities.Category;
import kodlamaIoDemo.entities.Courses;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		BaseUser user = new BaseUser(1, "Ankara", "aytunbr@gmail.com", "Etimesgut/Eryaman", "Turkey", "Aytun", "BAYIR",
				"Student");

		UserManager userManager = new UserManager(new JdbcDao(), loggers);
		userManager.add(user);

		Courses course = new Courses(1, "Yazýlým Geliþtirici Yetiþtirme Kampý - JAVA", "Java ile Back-End Geliþtirime",
				"Java", "Engin Demiroð", 0);
		Courses course1 = new Courses(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)",
				"C# ve Angular ile Geliþtirime", "C#", "Engin Demiroð", 0);
		Courses course2 = new Courses(3, "Senior Geliþtirici Yetiþtirme Kampý(.NET)", ".NET ile Geliþtirime", ".NET",
				"Engin Demiroð", 0);
		Courses course3 = new Courses(4, "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)",
				"Java ve React ile Geliþtirime", "C#", "Engin Demiroð", 0);
		Courses course4 = new Courses(5, "Yazýlým Geliþtirici Yetiþtirme Kampý(JavaScript)",
				"JavaScript ile Geliþtirime", "C#", "Engin Demiroð", 0);
		Courses course5 = new Courses(6, "Programlamaya Giriþ Ýçin Temel Kurs", "Temel programlama bilgileri", "Python",
				"Engin Demiroð", 0);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		List<Courses> courses = new ArrayList<>();

		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, courses);
		courseManager.add(course);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		courseManager.add(course1);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		courseManager.add(course2);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		courseManager.add(course3);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		courseManager.add(course4);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		courseManager.add(course5);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		Category category = new Category(0, "Java", "Java language");
		Category category1 = new Category(1, "C#", "C# language");

		List<Category> categories = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers, categories);
		categoryManager.add(category);
		System.out.println(
				"------------------------------------------------------------------------------------------------------");
		categoryManager.add(category1);
	}

}
