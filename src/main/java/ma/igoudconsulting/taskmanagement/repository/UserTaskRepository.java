package ma.igoudconsulting.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.igoudconsulting.taskmanagement.model.UserTask;

public interface UserTaskRepository extends JpaRepository <UserTask, Long> {

}
