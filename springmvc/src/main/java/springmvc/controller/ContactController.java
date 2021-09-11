package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.service.UserService;
import springmvc.model.User;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "LearnCodeWithMe");
		model.addAttribute("Desc", "Home for Programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) 
	 * public String handleForm(@RequestParam(name = "email", required = true) String userEmail,
	 * 		@RequestParam("password") String userPassword,
	 * 		@RequestParam("userName") String userName, Model model) {
	 * 
	 * User user = new User(); 
	 * user.setEmail(userEmail); 
	 * user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user); // process // model.addAttribute("name", userName);
	 * // model.addAttribute("email", userEmail); // model.addAttribute("password",
	 * userPassword);
	 * 
	 * model.addAttribute("user", user); return "success"; 
	 * }
	 */
}
