package ma.igoudconsulting.taskmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Task {
	
	@Id
	@GenericGenerator(name = "announcement", strategy = "increment")
	@GeneratedValue(generator = "announcement")
	private Long id;
	private String name;
	private String description;
	private Date dateCreation;
	@ManyToOne
	private State state;
	
	@PrePersist
	void saveDate () {
		this.dateCreation = new Date ();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
}
