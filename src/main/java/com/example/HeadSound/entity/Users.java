package com.example.HeadSound.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    @Column(name = "e_mail")
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;



    public Users(){}

    public Users(String email, String login, String password){
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
