package medicine.base.service;

import java.util.List;

import medicine.base.pojo.po.Sysuser;
import medicine.base.pojo.vo.SysuserCustom;
import medicine.base.pojo.vo.SysuserQueryVo;

public interface UserService {
	public Sysuser findSysuserById(String id) throws Exception;

	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo)
			throws Exception;

	public int findSysuserCount(SysuserQueryVo sysuserQueryVo) throws Exception;
}
