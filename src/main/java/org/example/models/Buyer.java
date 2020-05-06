package org.example.models;

public class Buyer {

    private Long id;
    private String name;
    private String membership;

    public Buyer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public Buyer() {
    } 

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Buyer(Long id, String name, String membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

 
}