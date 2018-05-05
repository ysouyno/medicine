package medicine.base.pojo.vo;

import medicine.base.pojo.po.Sysuser;

// 扩展类，用于提交信息，查询条件
public class SysuserCustom extends Sysuser {
	private String sysmc;

	public String getSysmc() {
		return sysmc;
	}

	public void setSysmc(String sysmc) {
		this.sysmc = sysmc;
	}
}
