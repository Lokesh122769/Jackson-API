package com.SpringRest.JacksonApiRest2.Model;

public class Domain
{
   private String role;
   
   private String language;

public Domain() {
	super();
}

public Domain(String role, String language) {
	super();
	this.role = role;
	this.language = language;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

@Override
public String toString() {
	return "Domain [role=" + role + ", language=" + language + "]";
}
   
   
}
