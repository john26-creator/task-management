package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.UserTask;
import ma.igoudconsulting.taskmanagement.repository.UserTaskRepository;
import ma.igoudconsulting.taskmanagement.service.UserTaskService;

@Service
public class UserTaksServiceImpl implements UserTaskService {
	@Autowired
	UserTaskRepository repository;

	@Override
	public Optional<UserTask> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<UserTask> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(UserTask user) {
		repository.save(user);

	}

	@Override
	public void update(UserTask user) {
		repository.save(user);
	}

	@Override
	public Long delete(Long id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public Long delete(UserTask user) {
		repository.delete(user);
		return user.getId();
	}

}
