package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.State;
import ma.igoudconsulting.taskmanagement.repository.StateRepository;
import ma.igoudconsulting.taskmanagement.service.StateService;

@Service
public class StateServiceImpl implements StateService {
	@Autowired
	StateRepository repository;

	@Override
	public Optional<State> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<State> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(State role) {
		repository.save(role);

	}

	@Override
	public void update(State state) {
		repository.save(state);
	}

	@Override
	public Long delete(Long id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public Long delete(State state) {
		repository.delete(state);
		return state.getId();
	}

}
