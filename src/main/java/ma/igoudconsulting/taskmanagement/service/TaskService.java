package ma.igoudconsulting.taskmanagement.service;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.taskmanagement.model.Task;

public interface TaskService {
	Optional<Task> findOne (Long id);
	List<Task> findAll ();
	void save (Task Task);
	void update (Task Task);
	Long delete (Long id);
	Long delete (Task Task);
}
