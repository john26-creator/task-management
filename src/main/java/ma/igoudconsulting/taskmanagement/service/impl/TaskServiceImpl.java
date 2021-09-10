package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.Task;
import ma.igoudconsulting.taskmanagement.repository.TaskRepository;
import ma.igoudconsulting.taskmanagement.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	TaskRepository repository;

	@Override
	public Optional<Task> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Task> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Task task) {
		repository.save(task);

	}

	@Override
	public void update(Task task) {
		repository.save(task);
	}

	@Override
	public Long delete(Long id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public Long delete(Task task) {
		repository.delete(task);
		return task.getId();
	}

}
