package kodlamaIoDemo.entities;

public class Category {
	private int categoryId;
	private String categoryName;
	private String categoryDescripton;

	public Category(int categoryId, String categoryName, String descripton) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescripton = descripton;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescripton() {
		return categoryDescripton;
	}

	public void setDescripton(String descripton) {
		this.categoryDescripton = descripton;
	}

}
