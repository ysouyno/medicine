package medicine.base.dao.mapper;

import java.util.List;
import medicine.base.pojo.po.Userjd;
import medicine.base.pojo.po.UserjdExample;
import org.apache.ibatis.annotations.Param;

public interface UserjdMapper {
	int countByExample(UserjdExample example);

	int deleteByExample(UserjdExample example);

	int deleteByPrimaryKey(String id);

	int insert(Userjd record);

	int insertSelective(Userjd record);

	List<Userjd> selectByExample(UserjdExample example);

	Userjd selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Userjd record,
			@Param("example") UserjdExample example);

	int updateByExample(@Param("record") Userjd record,
			@Param("example") UserjdExample example);

	int updateByPrimaryKeySelective(Userjd record);

	int updateByPrimaryKey(Userjd record);
}