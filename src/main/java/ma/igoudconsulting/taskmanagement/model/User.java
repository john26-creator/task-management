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


	public String getFulName() {
		return fulName;
	}


	public void setFulName(String fulName) {
		this.fulName = fulName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
}
