package com.example.sep3tier3.Entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "user_accounts")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_accounts_seq", allocationSize = 1)
    private long id;


    @NotBlank(message = "username can not be empty")
    @Size(min = 4,message = "username must be more then 3 characters")
    @Size(max = 12,message = "username can not be more then 12 characters")
    private String username;

    @NotBlank(message = "password can not be empty")
    @Size(min = 5,message = "password must be more then 6 characters")
    @Size(max = 16,message = "password can not be more then 16 characters")
    private String password;

    @NotNull(message = "value can not be empty")
    @Min(value = 1, message = "value can not be less then 1")
    @Max(value = 4, message = "value can not be more then 4")
    private long securitylevel;

    public User() {

    }

    public User(String username, String password, long securitylevel) {
        this.username = username;
        this.password = password;
        this.securitylevel = securitylevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getSecuritylevel() {
        return securitylevel;
    }

    public void setSecuritylevel(long securitylevel) {
        this.securitylevel = securitylevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", securitylevel=" + securitylevel +
                '}';
    }
}
