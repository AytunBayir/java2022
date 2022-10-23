package kodlamaIoDemo.dataAccess;

import kodlamaIoDemo.entities.BaseUser;
import kodlamaIoDemo.entities.Category;
import kodlamaIoDemo.entities.Courses;

public interface BaseDao {
	void add(BaseUser user);
	void add(Category category);
	void add(Courses course);
}
