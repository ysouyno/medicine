package medicine.base.pojo.vo;

// 包装类，用于页面向action传递参数，将数据传递到mybatis
public class SysuserQueryVo {
	// 用户查询条件
	private SysuserCustom sysuserCustom;

	// 分页参数
	private PageQuery pageQuery;

	public SysuserCustom getSysuserCustom() {
		return sysuserCustom;
	}

	public void setSysuserCustom(SysuserCustom sysuserCustom) {
		this.sysuserCustom = sysuserCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
}
