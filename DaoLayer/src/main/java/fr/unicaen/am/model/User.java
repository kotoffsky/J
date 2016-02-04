package fr.unicaen.am.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import domain.person.Person;

public class User extends Person implements Serializable{

	private String password;
	private String adress;
	private String phone;
	private String phoneType;
	private String gender;
	private Date birth;
	private String ville;
	private String pays;
	private Boolean enabled;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	
	
	public User() {
		super("", "", "");
	}
	
	public User(String name, String firstName, String email) {
		super(name, firstName, email);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public String toString() {
		return "adress=" + adress + ", phone=" + phone + ", phoneType=" + phoneType + ", gender=" + gender
				+ ", birth=" + birth + ", ville=" + ville + ", pays=" + pays + ", name=" + name + ", firstName="
				+ firstName + ", email=" + email;
	}

	
	
	
	
}