package medicine.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import medicine.base.dao.mapper.SysuserMapper;
import medicine.base.pojo.po.Sysuser;
import medicine.base.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private SysuserMapper sysuserMapper;

	@Override
	public Sysuser findSysuserById(String id) throws Exception {
		return sysuserMapper.selectByPrimaryKey(id);
	}
}
