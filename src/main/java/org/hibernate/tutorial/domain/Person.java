package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {

	public Person() {
		System.out.println("Person Object...");
	}

	private Long id;
	private int age;
	private String firstname;
	private String lastname;
	private Set<Event> eventList = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Set<Event> getEventList() {
		return eventList;
	}
	public void setEventList(Set<Event> eventList) {
		this.eventList = eventList;
	}
	
	
}
