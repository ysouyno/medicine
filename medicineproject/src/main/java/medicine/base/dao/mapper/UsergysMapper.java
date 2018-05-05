package medicine.base.dao.mapper;

import java.util.List;
import medicine.base.pojo.po.Usergys;
import medicine.base.pojo.po.UsergysExample;
import org.apache.ibatis.annotations.Param;

public interface UsergysMapper {
	int countByExample(UsergysExample example);

	int deleteByExample(UsergysExample example);

	int deleteByPrimaryKey(String id);

	int insert(Usergys record);

	int insertSelective(Usergys record);

	List<Usergys> selectByExampleWithBLOBs(UsergysExample example);

	List<Usergys> selectByExample(UsergysExample example);

	Usergys selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Usergys record,
			@Param("example") UsergysExample example);

	int updateByExampleWithBLOBs(@Param("record") Usergys record,
			@Param("example") UsergysExample example);

	int updateByExample(@Param("record") Usergys record,
			@Param("example") UsergysExample example);

	int updateByPrimaryKeySelective(Usergys record);

	int updateByPrimaryKeyWithBLOBs(Usergys record);

	int updateByPrimaryKey(Usergys record);
}