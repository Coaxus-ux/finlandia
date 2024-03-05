package com.finlandia.application.DataAccess.User;

import com.finlandia.application.Models.UserModel;

public interface IUser {
    UserModel getUser(String email, String password);

    void createUser(UserModel user);

    void changePassword(UserModel user);

    void deleteUser(UserModel user);
}
