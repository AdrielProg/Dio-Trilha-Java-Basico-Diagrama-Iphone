package model.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContactList {
	
	private  Set<Contact> contactList;

	public ContactList() {
	
		this.contactList = new HashSet<>();
	}
	
	
	public Set<Contact> getContactList() {
		return contactList;
	}

	public void addContact(String name, Integer number) {
		 contactList.add(new Contact(name, number));
	}
	
	public Contact updateContact(String name, Integer newNumber) {
		Contact updatedContact = null; 
		if(!contactList.isEmpty()) {
			for (Contact c: contactList) {
				if(c.getName().equalsIgnoreCase(name)) {
					c.setNumber(newNumber);
					updatedContact = c;
					break; 
				}
			}
			return updatedContact; 
		}else {
			throw new RuntimeException("A lista de contato está vazia!"); 
		}
	}
	
	public Set<Contact> showMySortedContacts() {
		Set<Contact> sortedContacts = new TreeSet<>(contactList);
		if(!contactList.isEmpty()) {
			System.out.println("------ Meus Contatos----");
			for(Contact c: sortedContacts) {
				System.out.println(c.getName() + " - " + c.getNumber());
			}
			return sortedContacts; 
		}else {
			throw new RuntimeException("Você não possui contatos");
		}
	}

}
