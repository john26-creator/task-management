package ma.igoudconsulting.taskmanagement.service;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.taskmanagement.model.State;

public interface StateService {
	Optional<State> findOne (Long id);
	List<State> findAll ();
	void save (State StateService);
	void update (State StateService);
	Long delete (Long id);
	Long delete (State StateService);
}
