package ma.igoudconsulting.taskmanagement.service;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.taskmanagement.model.Role;

public interface RoleService {

	Optional<Role> findOne (Long id);
	List<Role> findAll ();
	void save (Role role);
	void update (Role role);
	Long delete (Long id);
	Long delete (Role role);
}
