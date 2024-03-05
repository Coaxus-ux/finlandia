package com.finlandia.application.DataAccess.User;

import com.finlandia.application.Models.UserModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.finlandia.application.BCrypt.BCrypt;
public class User implements IUser{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public UserModel getUser(String email, String password) {
        password = BCrypt.hashpw(password, BCrypt.gensalt(12));
        return entityManager.createQuery("SELECT a FROM UserModel a WHERE a.email = :email AND a.password = :password", UserModel.class)
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();
    }

    @Override
    public void createUser(UserModel user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
        entityManager.persist(user);
    }
    @Override
    public void changePassword(UserModel user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
        entityManager.merge(user);
    }
    @Override
    public void deleteUser(UserModel user) {
        user.setUserStatus(0);
        entityManager.merge(user);
    }

}
