package com.bsuir.dto;


import com.bsuir.entity.Client;
import com.bsuir.entity.Role;
import com.bsuir.entity.User;

import java.util.HashSet;

public class ClientDTO {
    private Long id;
    private Long idUser;
    private String username;
    private String password;
    private String passwordConfirm;
    private String name;
    private String surname;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ""+getName()+getAddress()+getPassword()+getSurname()+getUsername();
    }

    public Client toEntity(){
        Client client = new Client();
        User user = new User();
        HashSet<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setName("ROLE_CLIENT");
        roles.add(role);
        user.setRole(roles);
        user.setUsername(this.getUsername());
        user.setPassword(this.getPassword());
        client.setUserInfo(user);

        client.setAddress(this.getAddress());
        client.setId(this.getId());
        client.setName(this.getName());
        client.setSurname(this.getSurname());
        return client;
    }

    public ClientDTO fromEntity(Client client) {
        this.setAddress(client.getAddress());
        this.setUsername(client.getUserInfo().getUsername());
        this.setId(client.getId());
        this.setName(client.getName());
        this.setPassword(client.getUserInfo().getPassword());
        this.setSurname(client.getSurname());
        this.setPasswordConfirm(client.getUserInfo().getPasswordConfirm());
        return this;
    }
}
