package medicine.base.dao.mapper;

import java.util.List;
import medicine.base.pojo.po.Dicttype;
import medicine.base.pojo.po.DicttypeExample;
import org.apache.ibatis.annotations.Param;

public interface DicttypeMapper {
	int countByExample(DicttypeExample example);

	int deleteByExample(DicttypeExample example);

	int deleteByPrimaryKey(String typecode);

	int insert(Dicttype record);

	int insertSelective(Dicttype record);

	List<Dicttype> selectByExample(DicttypeExample example);

	Dicttype selectByPrimaryKey(String typecode);

	int updateByExampleSelective(@Param("record") Dicttype record,
			@Param("example") DicttypeExample example);

	int updateByExample(@Param("record") Dicttype record,
			@Param("example") DicttypeExample example);

	int updateByPrimaryKeySelective(Dicttype record);

	int updateByPrimaryKey(Dicttype record);
}