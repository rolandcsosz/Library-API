package com.csrlnd.LibraryAPI.Model;

import java.util.Collection;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.csrlnd.LibraryAPI.Domain.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**K�nyvt�ri dolgoz� reprezent�l�s�ra haszn�lt oszt�ly.
 * @author Roland
 *
 */
@Document(collection = "staff")
public class Staff extends LibraryMember implements UserDetails{
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String userName;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	@JsonIgnore
	private Set<UserRole> userRoles;
	
	public Staff(String name, String emailAddress, String libraryId, String userName, String password,
			Set<UserRole> userRoles) {
		super(name, emailAddress, libraryId);
		this.userName = userName;
		this.password = password;
		this.userRoles = userRoles;
	}


	public Set<UserRole> getUserRoles() {
		return userRoles;
	}





	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}





	public String getUserName() {
		return userName;
	}
	public void setUserName(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Set<UserRole> getAuthorities() {
		return this.userRoles;
	}
	
	public void setAuthorities(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	
	

}
