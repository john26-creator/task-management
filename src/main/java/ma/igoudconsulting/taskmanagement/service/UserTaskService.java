package ma.igoudconsulting.taskmanagement.service;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.taskmanagement.model.UserTask;

public interface UserTaskService {
	Optional<UserTask> findOne (Long id);
	List<UserTask> findAll ();
	void save (UserTask UserTask);
	void update (UserTask UserTask);
	Long delete (Long id);
	Long delete (UserTask UserTask);
}
