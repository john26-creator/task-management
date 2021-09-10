package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.User;
import ma.igoudconsulting.taskmanagement.repository.UserRepository;
import ma.igoudconsulting.taskmanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;

	@Override
	public Optional<User> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(User user) {
		repository.save(user);

	}

	@Override
	public void update(User user) {
		repository.save(user);
	}

	@Override
	public Long delete(Long id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public Long delete(User user) {
		repository.delete(user);
		return user.getId();
	}

}
