package com.example.sharingapp;

public class ContactController {
    private Contact contact;

    public ContactController(Contact contact){
        this.contact = contact;
    }

    public void setId() {
        contact.setId();
    }

    public void updateId(String id) {
        contact.updateId(id);
    }

    public String getId() { return contact.getId(); }

    public void setUsername(String username) { contact.setUsername(); }

    public String getUsername() {
        return contact.getUsername();
    }

    public void setEmail() { contact.setEmail(); }

    public String getEmail() {
        return contact.getEmail();
    }
}
