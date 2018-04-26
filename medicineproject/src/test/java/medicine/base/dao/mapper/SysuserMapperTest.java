package medicine.base.dao.mapper;

import java.util.List;

import medicine.base.pojo.po.Sysuser;
import medicine.base.pojo.po.SysuserExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class SysuserMapperTest extends TestCase {
	private ApplicationContext applicationContext;
	private SysuserMapper sysuserMapper;

	protected void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml",
				"spring/applicationContext-dao.xml" });

		sysuserMapper = (SysuserMapper) applicationContext
				.getBean("sysuserMapper");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDeleteByPrimaryKey() {
	}

	public void testInsert() {
	}

	public void testSelectByExample() {
		SysuserExample sysuserExample = new SysuserExample();
		SysuserExample.Criteria criteria = sysuserExample.createCriteria();
		criteria.andUseridEqualTo("gcxarzc");
		criteria.andGroupidEqualTo("3");
		List<Sysuser> sysuser = sysuserMapper.selectByExample(sysuserExample);
		System.out.println(sysuser);
	}

	public void testSelectByPrimaryKey() {
		Sysuser sysuser = sysuserMapper.selectByPrimaryKey("286");
		System.out.println(sysuser);
	}

	// 传入的PO类的属性不为空才更新
	public void testUpdateByPrimaryKeySelective() {
		// 定义一个新对象
		Sysuser sysuser = new Sysuser();
		// 设置对象id
		sysuser.setId("286");
		// 设置需要更新的值
		sysuser.setUsername("test_username0");
		// 执行更新
		sysuserMapper.updateByPrimaryKeySelective(sysuser);
	}

	// 不管传入的PO类的属性是否为空都更新
	public void testUpdateByPrimaryKey() {
		// 先查询对象
		Sysuser sysuser = sysuserMapper.selectByPrimaryKey("286");
		// 再向对象中设置值
		sysuser.setUsername("test_username1");
		// 最后执行更新
		sysuserMapper.updateByPrimaryKey(sysuser);
	}
}
