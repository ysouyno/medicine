package medicine.base.service;

import medicine.base.pojo.po.Sysuser;

public interface UserService {
	public Sysuser findSysuserById(String id) throws Exception;
}
