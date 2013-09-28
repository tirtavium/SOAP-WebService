package id.or.linux.jak.domain;

import java.util.List;



public class User {

	private String username;
	private List<String> role;
	private String jenkel;
	
	
	
	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

	public String getJenkel() {
		return jenkel;
	}

	public void setJenkel(String jenkel) {
		this.jenkel = jenkel;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
