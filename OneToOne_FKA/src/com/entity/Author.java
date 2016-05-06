package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "AUTHOR")
public class Author {
    private long id;
    private String name;
    private String email;
     
    public Author() {
    }
             
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
 
    @Id
    @Column(name = "AUTHOR_ID")
    @GeneratedValue
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name="NAME")
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Column(name="EMAIL")
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }  
}