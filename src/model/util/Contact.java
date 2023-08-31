package model.util;

import java.util.Objects;

public class Contact implements Comparable<Contact>{ 
	private String name; 
	private Integer number;
	
	
	
	public Contact(String name, int number) {
	
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(number, other.number);
	}
	@Override
	public int compareTo(Contact c) {
		// TODO Auto-generated method stub
		return this.name.compareTo(c.getName());
	} 
	
	
}
