package ma.igoudconsulting.taskmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fulName;
	private String email;
	private String password;
	private boolean active;
	@ManyToOne
	private Role role;

	
	public Long getId() {
		return id;
	}
}
