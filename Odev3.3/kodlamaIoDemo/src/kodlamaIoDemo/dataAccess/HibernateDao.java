package kodlamaIoDemo.dataAccess;

import kodlamaIoDemo.entities.BaseUser;
import kodlamaIoDemo.entities.Category;
import kodlamaIoDemo.entities.Courses;

public class HibernateDao implements BaseDao {

	@Override
	public void add(BaseUser user) {
		System.out.println("User added to the database with Hibernate:  " + " " +user.getUserType()+"  " + user.getFirstName() + "  "+ user.getLastName());

	}

	@Override
	public void add(Category category) {
		System.out.println("Category added to the database with Hibernate:  " + category.getCategoryName());

	}

	@Override
	public void add(Courses course) {
		System.out.println("Course added to the database with Hibernate:  " + course.getCourseName());

	}

}
