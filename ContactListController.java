package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {
    private ContactList contact_list;

    public ContactListController(ContactList contact_list) {
        this.contact_list = contact_list;
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        this.contact_list.setContacts(contact_list);
    }

    public ArrayList<Contact> getContacts() { return contact_list.getContacts(); }

    public ArrayList<String> getAllUsernames() {
        return contact_list.getAllUsernames();
    }

    public boolean addContact(Contact contact, Context context) {
        AddContactCommand add_contact_command = new AddContactCommand(this.contact_list, contact, context);
        add_contact_command.execute();

        return add_contact_command.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context) {
        DeleteContactCommand delete_contact_command = new DeleteContactCommand(this.contact_list, contact, context);
        delete_contact_command.execute();

        return delete_contact_command.isExecuted();
    }

    public boolean editContact(Contact new_contact, Contact old_contact, Context context) {
        EditContactCommand edit_contact_command = new EditContactCommand(this.contact_list, new_contact, old_contact, context);
        edit_contact_command.execute();

        return edit_contact_command.isExecuted();
    }

    public Contact getContact(int index) { return contact_list.getContact(index); }

    public int getSize() { return contact_list.getSize();}

    public int getIndex(Contact contact) {
        return contact_list.getIndex(contact);
    }

    public boolean hasContact(Contact contact) {
        return contact_list.hasContact(contact);
    }

    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public void loadContacts(Context context) {
        contact_list.loadContacts(context);
    }

    public boolean saveContacts(Context context) {
        return contact_list.saveContacts(context);
    }

    public boolean isUsernameAvailable(String username) {
        return contact_list.isUsernameAvailable(username);
    }
    public void addObserver(Observer observer) {
        contact_list.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact_list.removeObserver(observer);
    }
}
