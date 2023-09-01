package model.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContactSet {

	private Set<Contact> contactList;

	public ContactSet() {
	
		this.contactList = new HashSet<>();
		addContactListOnSystem(); 
	}

	public Set<Contact> getContactList() {
		return contactList;
	}

	public void addContact(String name, Integer number) {
		contactList.add(new Contact(name, number));
	}

	public Contact updateContact(String name, Integer newNumber) {
		Contact updatedContact = null;
		if (!contactList.isEmpty()) {
			for (Contact c : contactList) {
				if (c.getName().equalsIgnoreCase(name)) {
					c.setNumber(newNumber);
					updatedContact = c;
					break;
				}
			}
			return updatedContact;
		} else {
			throw new RuntimeException("A lista de contato está vazia!");
		}
	}

	public Set<Contact> showMySortedContacts() {
		Set<Contact> sortedContacts = new TreeSet<>(contactList);
		if (!contactList.isEmpty()) {
			System.out.println("------ Meus Contatos----");
			for (Contact c : sortedContacts) {
				System.out.println(c.getName() + " - " + c.getNumber());
			}
			return sortedContacts;
		} else {
			throw new RuntimeException("Você não possui contatos");
		}
	}

	public void addContactListOnSystem() {

		// Adicionar 10 contatos com nomes e números brasileiros
		addContact("Alice", 976538973);
		addContact("Bob", 972653456);
		addContact("Carlos", 96543234);
		addContact("Daniela", 97365298);
		addContact("Eduardo", 937649876);
		addContact("Fernanda", 912239098);
		addContact("Gabriel", 928470099);
		addContact("Helena", 92848644);
		addContact("Isabela", 932159876);
		addContact("João", 933248765);
	}

}
