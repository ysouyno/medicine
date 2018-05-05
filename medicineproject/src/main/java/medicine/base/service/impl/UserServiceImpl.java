package medicine.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import medicine.base.dao.mapper.SysuserMapper;
import medicine.base.dao.mapper.SysuserMapperCustom;
import medicine.base.pojo.po.Sysuser;
import medicine.base.pojo.vo.SysuserCustom;
import medicine.base.pojo.vo.SysuserQueryVo;
import medicine.base.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private SysuserMapper sysuserMapper;

	@Override
	public Sysuser findSysuserById(String id) throws Exception {
		return sysuserMapper.selectByPrimaryKey(id);
	}

	@Autowired
	private SysuserMapperCustom sysuserMapperCustom;

	@Override
	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo)
			throws Exception {
		return sysuserMapperCustom.findSysuserList(sysuserQueryVo);
	}
}
