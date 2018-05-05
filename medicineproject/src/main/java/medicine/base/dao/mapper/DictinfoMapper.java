package medicine.base.dao.mapper;

import java.util.List;
import medicine.base.pojo.po.Dictinfo;
import medicine.base.pojo.po.DictinfoExample;
import org.apache.ibatis.annotations.Param;

public interface DictinfoMapper {
	int countByExample(DictinfoExample example);

	int deleteByExample(DictinfoExample example);

	int deleteByPrimaryKey(String id);

	int insert(Dictinfo record);

	int insertSelective(Dictinfo record);

	List<Dictinfo> selectByExample(DictinfoExample example);

	Dictinfo selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Dictinfo record,
			@Param("example") DictinfoExample example);

	int updateByExample(@Param("record") Dictinfo record,
			@Param("example") DictinfoExample example);

	int updateByPrimaryKeySelective(Dictinfo record);

	int updateByPrimaryKey(Dictinfo record);
}