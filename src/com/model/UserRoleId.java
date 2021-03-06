package com.model;
// Generated Jul 8, 2019 11:49:59 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserRoleId generated by hbm2java
 */
@Embeddable
public class UserRoleId implements java.io.Serializable {

	private String userName;
	private String roleId;

	public UserRoleId() {
	}

	public UserRoleId(String userName, String roleId) {
		this.userName = userName;
		this.roleId = roleId;
	}

	@Column(name = "user_name", nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "role_id", nullable = false, length = 50)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleId))
			return false;
		UserRoleId castOther = (UserRoleId) other;

		return ((this.getUserName() == castOther.getUserName()) || (this.getUserName() != null
				&& castOther.getUserName() != null && this.getUserName().equals(castOther.getUserName())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this.getRoleId() != null
						&& castOther.getRoleId() != null && this.getRoleId().equals(castOther.getRoleId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result + (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		return result;
	}

}
