package MycafeController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycafe {

	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		String myName="anusha";
		model.addAttribute("myname", myName);
		model.addAttribute("myWebsiteName", "MOM'S CAFE");

		return "welcome-page";
	}
	@RequestMapping("/placeOrder")
	public String orderProcessing(HttpServletRequest request, Model model) {
		String userEnteredValue =request.getParameter("foodType");
		model.addAttribute("itemName",userEnteredValue);
		return "order";
	}

}
