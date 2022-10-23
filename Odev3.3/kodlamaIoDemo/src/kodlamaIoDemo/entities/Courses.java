package kodlamaIoDemo.entities;

public class Courses {
	private int courseId;
	private String courseName;
	private String instructor;
	private double price;
	private String courseCategory;
	private String courseDescription;

	public Courses(int courseId, String courseName, String courseDescription, String courseCategory, String instructor, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseCategory = courseCategory;
		this.instructor = instructor;
		this.price = price;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String coursecategory) {
		this.courseCategory = coursecategory;
	}

}
