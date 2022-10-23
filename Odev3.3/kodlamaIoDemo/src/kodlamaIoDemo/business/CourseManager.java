package kodlamaIoDemo.business;

import java.util.List;

import kodlamaIoDemo.core.logging.Logger;
import kodlamaIoDemo.dataAccess.BaseDao;
import kodlamaIoDemo.entities.Courses;

public class CourseManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	private List<Courses> courses;
	public CourseManager(BaseDao baseDao, Logger[] loggers, List<Courses> courses) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
		this.courses = courses;
	} 
	
	public void add (Courses course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Course's price cannot be less than 0");
		}
		for(Courses courses : courses) {
			if(course.getCourseName().equals(courses.getCourseName())) {
				throw new Exception("Course names can not be same");
			}
		}
		
		baseDao.add(course);
		courses.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseCategory());
		}
	}
}
