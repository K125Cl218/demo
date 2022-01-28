package fr.formation.inti.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "t_users")
public class User {
	private Integer idUser;
	private String login;
	private String password;
	private String connectionNumber;
	private Employee employee;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_user", unique = true, nullable = false)
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	@Column(name = "login")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "connectionNumber")
	public String getConnectionNumber() {
		return connectionNumber;
	}
	public void setConnectionNumber(String connectionNumber) {
		this.connectionNumber = connectionNumber;
	}
	
	@OneToOne()
	@JoinColumn(name = "emp_id")
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
