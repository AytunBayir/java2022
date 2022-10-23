package kodlamaIoDemo.business;

import kodlamaIoDemo.core.logging.Logger;
import kodlamaIoDemo.dataAccess.BaseDao;
import kodlamaIoDemo.entities.BaseUser;

public class UserManager {
	private BaseDao baseDao;

	private Logger[] loggers;

	public UserManager(BaseDao baseDao, Logger[] loggers) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
	}

	public void add(BaseUser user) {
		baseDao.add(user);
		for (Logger logger : loggers) {
			logger.log(user.getUserType());
		}
	}

}
