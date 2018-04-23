package medicine.base.dao.mapper;

import medicine.base.pojo.po.Sysuser;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class SysuserCustomMapperTest extends TestCase {
	private ApplicationContext applicationContext;

	protected void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml",
				"spring/applicationContext-dao.xml" });
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testFindSysuserById() throws Exception {
		SysuserCustomMapper sysuserCustomMapper = (SysuserCustomMapper) applicationContext
				.getBean("sysuserCustomMapper");
		Sysuser sysuser = sysuserCustomMapper.findSysuserById("286");
		System.out.println(sysuser);
	}
}
