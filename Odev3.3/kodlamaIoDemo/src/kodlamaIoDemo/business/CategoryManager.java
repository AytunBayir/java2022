package kodlamaIoDemo.business;

import java.util.List;

import kodlamaIoDemo.core.logging.Logger;
import kodlamaIoDemo.dataAccess.BaseDao;
import kodlamaIoDemo.entities.Category;

public class CategoryManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	public List<Category> categories;

	public CategoryManager(BaseDao baseDao, Logger[] loggers, List<Category> categories) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {

		for (Category categories : categories) {
			if (category.getCategoryName().equals(categories.getCategoryName())) {
				throw new Exception("Category names can not be same");

			}
		}

		baseDao.add(category);
		categories.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
