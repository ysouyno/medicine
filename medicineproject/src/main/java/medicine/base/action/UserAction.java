package medicine.base.action;

import java.util.List;

import medicine.base.pojo.vo.PageQuery;
import medicine.base.pojo.vo.SysuserCustom;
import medicine.base.pojo.vo.SysuserQueryVo;
import medicine.base.process.result.DataGridResultInfo;
import medicine.base.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserService userService;

	@RequestMapping("/queryuser")
	public String queryuser(Model model) throws Exception {
		// 将数据取出传到页面
		return "/base/user/queryuser";
	}

	// DataGridResultInfo通过@ResponseBody将java对象转化成json
	// 第二个参数page和第三个参数rows的名字不可以修改为其它，必须为page和rows
	@RequestMapping("/queryuser_result")
	public @ResponseBody
	DataGridResultInfo queryuser_result(SysuserQueryVo sysuserQueryVo,
			int page, int rows) throws Exception {
		sysuserQueryVo = sysuserQueryVo != null ? sysuserQueryVo
				: new SysuserQueryVo();

		// 查询的总数
		int total = userService.findSysuserCount(sysuserQueryVo);

		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		sysuserQueryVo.setPageQuery(pageQuery);

		// 分页查询，向sysuserQueryVo传入pageQuery
		List<SysuserCustom> list_rows = userService
				.findSysuserList(sysuserQueryVo);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list_rows);

		return dataGridResultInfo;
	}
}
