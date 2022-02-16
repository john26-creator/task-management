package ma.igoudconsulting.taskmanagement.web;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.igoudconsulting.taskmanagement.model.Task;
import ma.igoudconsulting.taskmanagement.service.StateService;
import ma.igoudconsulting.taskmanagement.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	private TaskService taskService;
	@Autowired
	private StateService stateService;

	@GetMapping("list-tasks")
	public String listTask(Model model) {
		model.addAttribute("tasks", this.taskService.findAll());
		return "views/list-tasks";
	}

	@GetMapping("add-task")
	public String addTask(Model model) {
		model.addAttribute("task", new Task());
		model.addAttribute("states", stateService.findAll());
		return "views/add-task";
	}

	@PostMapping("add-task")
	public String addTaskPost(Model model, Task task) {
		taskService.save(task);
		return "redirect:/list-tasks";
	}

	@GetMapping("delete-task")
	public String deleteTask(@RequestParam("id_task") Long id) {
		taskService.delete(id);
		return "redirect:/list-tasks";
	}

	@GetMapping("detail-task")
	public String delailTask(@RequestParam("id_task") Long id, Model model, Task task) {
		model.addAttribute("task", taskService.findOne(id).get());
		return "views/detail-task";
	}

	@GetMapping("edit-task")
	public String editTask(@RequestParam("id_task") Long id, Model model, Task task) {
		model.addAttribute("task", taskService.findOne(id).get());
		model.addAttribute("states", stateService.findAll());
		return "views/add-task";
	}

}
