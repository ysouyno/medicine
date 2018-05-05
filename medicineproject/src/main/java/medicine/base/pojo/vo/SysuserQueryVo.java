package medicine.base.pojo.vo;

// 包装类，用于页面向action传递参数，将数据传递到mybatis
public class SysuserQueryVo {
	private SysuserCustom sysuserCustom;

	public SysuserCustom getSysuserCustom() {
		return sysuserCustom;
	}

	public void setSysuserCustom(SysuserCustom sysuserCustom) {
		this.sysuserCustom = sysuserCustom;
	}
}
