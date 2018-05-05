package medicine.base.action;

import java.util.List;

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
	@RequestMapping("/queryuser_result")
	public @ResponseBody
	DataGridResultInfo queryuser_result(SysuserQueryVo sysuserQueryVo)
			throws Exception {
		List<SysuserCustom> rows = userService.findSysuserList(sysuserQueryVo);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(rows.size());
		dataGridResultInfo.setRows(rows);

		return dataGridResultInfo;
	}
}
