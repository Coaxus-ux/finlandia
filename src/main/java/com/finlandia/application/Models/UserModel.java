package com.finlandia.application.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users_login")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id_user")
    private UUID idUser;
    @Column (name = "user_name", nullable = false)
    private String userName;
    @Column (name = "user_last_name", nullable = false)
    private String userLastName;
    @Column (name = "user_email", nullable = false)
    private String email;
    @Column (name = "user_phone", nullable = false)
    private String phone;
    @Column (name = "user_password", nullable = false)
    private String password;

    @Column (name = "user_status", nullable = false)
    private int userStatus;
}
