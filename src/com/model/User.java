package com.model;
// Generated Jul 8, 2019 11:49:59 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "StudentPointManager")
public class User implements java.io.Serializable {

	private String userName;
	private String password;
	private String fristName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String phone;
	private String adress;
	private String email;
	private String dateOfJoin;
	private boolean enabled;
	private Set<ExamResult> examResults = new HashSet<ExamResult>(0);
	private Set<UserClass> userClasses = new HashSet<UserClass>(0);
	private Set<UserRole> userRoles = new HashSet<UserRole>(0);

	public User() {
	}

	public User(String userName, String password, String fristName, String lastName, String phone, String adress,
			String email, boolean enabled) {
		this.userName = userName;
		this.password = password;
		this.fristName = fristName;
		this.lastName = lastName;
		this.phone = phone;
		this.adress = adress;
		this.email = email;
		this.enabled = enabled;
	}

	public User(String userName, String password, String fristName, String lastName, String gender, String dateOfBirth,
			String phone, String adress, String email, String dateOfJoin, boolean enabled, Set<ExamResult> examResults,
			Set<UserClass> userClasses, Set<UserRole> userRoles) {
		this.userName = userName;
		this.password = password;
		this.fristName = fristName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.adress = adress;
		this.email = email;
		this.dateOfJoin = dateOfJoin;
		this.enabled = enabled;
		this.examResults = examResults;
		this.userClasses = userClasses;
		this.userRoles = userRoles;
	}

	@Id

	@Column(name = "user_name", unique = true, nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "frist_name", nullable = false, length = 50)
	public String getFristName() {
		return this.fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	@Column(name = "last_name", nullable = false, length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "gender", length = 50)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "date_of_birth", length = 10)
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "phone", nullable = false, length = 50)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "adress", nullable = false)
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Column(name = "email", nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "date_of_join", length = 10)
	public String getDateOfJoin() {
		return this.dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<ExamResult> getExamResults() {
		return this.examResults;
	}

	public void setExamResults(Set<ExamResult> examResults) {
		this.examResults = examResults;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserClass> getUserClasses() {
		return this.userClasses;
	}

	public void setUserClasses(Set<UserClass> userClasses) {
		this.userClasses = userClasses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

}
