package com.aws.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="aws_team")
@Entity
public class Team implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	private String location;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	

	public Team(int id, String name, String location) {
		super();
		Id = id;
		Name = name;
		this.location = location;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(Id, Name, location);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return Id == other.Id && Objects.equals(Name, other.Name) && Objects.equals(location, other.location);
	}



	@Override
	public String toString() {
		return "Team [Id=" + Id + ", Name=" + Name + ", location=" + location + "]";
	}
	
	
}
