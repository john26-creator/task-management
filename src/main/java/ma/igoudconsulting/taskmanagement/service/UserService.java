package ma.igoudconsulting.taskmanagement.service;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.taskmanagement.model.User;

public interface UserService {
	Optional<User> findOne (Long id);
	List<User> findAll ();
	void save (User User);
	void update (User User);
	Long delete (Long id);
	Long delete (User User);
}
