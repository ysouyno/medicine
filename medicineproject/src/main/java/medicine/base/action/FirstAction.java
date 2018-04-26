package medicine.base.action;

import medicine.base.pojo.po.Sysuser;
import medicine.base.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstAction {
	@Autowired
	private UserService userService;

	// 首页
	@RequestMapping("/first")
	public String first(Model model) throws Exception {
		Sysuser sysuser = userService.findSysuserById("286");

		// 将sysuser传入页面
		model.addAttribute("sysuser", sysuser);

		return "/base/first";
	}

	// 欢迎页面
	@RequestMapping("/welcome")
	public String welcome() {
		return "/base/welcome";
	}
}
