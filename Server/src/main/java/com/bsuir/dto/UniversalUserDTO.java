package com.bsuir.dto;

import com.bsuir.entity.Client;
import com.bsuir.entity.Role;
import com.bsuir.entity.User;

import java.util.HashSet;

public class UniversalUserDTO {
    private Long idUser;
    private Long idClient;
    private Long idDoctor;
    private String username;
    private String password;
    private String passwordConfirm;
    private String role;
    private String name;
    private String surname;
    private String specialization;
    private String cabinet_number;
    private String begin_of_receipt;
    private String end_of_receipt;
    private String address;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Long idDoctor) {
        this.idDoctor = idDoctor;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getCabinet_number() {
        return cabinet_number;
    }

    public void setCabinet_number(String cabinet_number) {
        this.cabinet_number = cabinet_number;
    }

    public String getBegin_of_receipt() {
        return begin_of_receipt;
    }

    public void setBegin_of_receipt(String begin_of_receipt) {
        this.begin_of_receipt = begin_of_receipt;
    }

    public String getEnd_of_receipt() {
        return end_of_receipt;
    }

    public void setEnd_of_receipt(String end_of_receipt) {
        this.end_of_receipt = end_of_receipt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Client toClient(){
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
        client.setId(this.getIdClient());
        client.setName(this.getName());
        client.setSurname(this.getSurname());
        return client;
    }

    public UniversalUserDTO fromClient(Client client){
        this.setAddress(client.getAddress());
        this.setUsername(client.getUserInfo().getUsername());
        this.setIdClient(client.getId());
        this.setName(client.getName());
        this.setPassword(client.getUserInfo().getPassword());
        this.setSurname(client.getSurname());
        this.setPasswordConfirm(client.getUserInfo().getPasswordConfirm());
        return this;
    }


    public User toUser(){
        User user = new User();
        HashSet<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setName(this.getRole());
        roles.add(role);
        user.setRole(roles);
        user.setUsername(this.getUsername());
        user.setPassword(this.getPassword());
        return user;
    }

    public UniversalUserDTO fromUser(User user){
        this.setIdUser(user.getId());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        this.setPasswordConfirm(user.getPasswordConfirm());
        this.setRole(user.getRole().toArray()[0].toString());
        return this;
    }
}
