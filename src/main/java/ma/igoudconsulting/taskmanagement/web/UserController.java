package ma.igoudconsulting.taskmanagement.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.igoudconsulting.taskmanagement.model.User;
import ma.igoudconsulting.taskmanagement.service.RoleService;
import ma.igoudconsulting.taskmanagement.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("list-users")
	public String listTask(Model model) {
		model.addAttribute("users", this.userService.findAll());
		return "views/user/list-users";
	}

	@GetMapping("add-user")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("roles", roleService.findAll());
		return "views/user/add-user";
	}

	@PostMapping("add-user")
	public String addUserPost(Model model, User user) {
		String password = bCryptPasswordEncoder.encode(user.getPassword()); 
		user.setPassword(password);
		userService.save(user);
		return "redirect:/list-users";
	}
	
	@GetMapping("edit-user")
	public String editUser(@RequestParam("id_user") Long id, Model model) {
		User user = userService.findOne(id).get();
		model.addAttribute("user", user);
		model.addAttribute("roles", roleService.findAll());
		return "views/user/add-user";
	}
	
	@GetMapping("detail-user")
	public String detailUser(@RequestParam("id_user") Long id, Model model) {
		User user = userService.findOne(id).get();
		model.addAttribute("user", user);
		return "views/user/detail-user";
	}
	
	@GetMapping("delete-user")
	public String deleteUser(@RequestParam("id_user") Long id) {
		userService.delete(id);
		return "redirect:/list-users";
	}


}
