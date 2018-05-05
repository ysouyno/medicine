package medicine.base.dao.mapper;

import java.util.List;

import medicine.base.pojo.vo.SysuserCustom;
import medicine.base.pojo.vo.SysuserQueryVo;

public interface SysuserMapperCustom {
	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo)
			throws Exception;

	public int findSysuserCount(SysuserQueryVo sysuserQueryVo) throws Exception;
}
