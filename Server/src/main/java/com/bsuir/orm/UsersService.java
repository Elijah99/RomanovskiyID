package com.bsuir.orm;

import com.bsuir.entity.Client;
import com.bsuir.entity.User;
import com.bsuir.repository.ClientRepository;
import com.bsuir.repository.UserRepository;
import com.bsuir.dto.UniversalUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created for JavaStudy.ru on 28.02.2016.
 */
@Repository
@Transactional //need to update\delete queries. Don't forget <tx:annotation-driven/>
public class UsersService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UsersService(){}

    public List<User> queryFindAllUsersJPA() {
        System.out.println("ORMService queryfindAllUsersJPA is called");
        return userRepository.findAll();
    }

    public User queryFindUserById (Long id) {
        System.out.println("ORMService queryFindUserById is called");
        return userRepository.findById(id).orElse(null);
    }

    public boolean updateUser(int id, boolean enabled) {
        System.out.println("ORMService updateUser is called");

        String query= "update user set enabled = ? where iduser = ?";
        /*Query nativeQuery = entityManager.createNativeQuery(query);
        nativeQuery.setParameter(1, enabled);
        nativeQuery.setParameter(2, id);
        int result = nativeQuery.executeUpdate();*/
        return  false; // result show how many rows was updated.
    }

    public boolean insertUser(UniversalUserDTO userDTO) {
        System.out.println("ORMExample insertUser is called");
        if(userDTO.getRole().equals("ROLE_ADMIN" ) || userDTO.getRole().equals("ROLE_USER"))
            userRepository.save(userDTO.toUser());
        if(userDTO.getRole().equals("ROLE_CLIENT")) clientRepository.save(userDTO.toClient());

        return true;
    }
    public void insertUser(User user)
    {
        userRepository.save(user);
    }

    public boolean deleteUser(Long idUser) {
        System.out.println("ORMExample deleteUser is called");
        userRepository.deleteById(idUser);
    /*    String qlString = "delete from user where iduser=?";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, idUser);
        int result = query.executeUpdate();
*/
        return false;
    }

    public Client getCurrentClient(){
        User userInfo = getCurrentUser();
        Client client = clientRepository.findByUserInfo(userInfo);
        return client;
    }

    public User getCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        System.err.println(currentUserName +"\n" + SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return userRepository.findUserByUsername(currentUserName);
    }

    public Client findClientById(Long id){
        return clientRepository.findById(id).get();
    }
}
