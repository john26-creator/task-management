package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.Role;
import ma.igoudconsulting.taskmanagement.repository.RoleRepository;
import ma.igoudconsulting.taskmanagement.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository repository;

	@Override
	public Optional<Role> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Role role) {
		repository.save(role);

	}

	@Override
	public void update(Role role) {
		repository.save(role);
	}

	@Override
	public Long delete(Long id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public Long delete(Role role) {
		repository.delete(role);
		return role.getId();
	}

}
