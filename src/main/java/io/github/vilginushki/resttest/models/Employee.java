package io.github.vilginushki.resttest.models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, surname, email, smoke, status, price;


    public Employee(String name, String surname, String email, String smoke, String status, String price) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.smoke = smoke;
        this.status = status;
        this.price = price;
    }

    public Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.surname = e.surname;
        this.email = e.email;
        this.smoke = e.smoke;
        this.status = e.status;
        this.price = e.price;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
