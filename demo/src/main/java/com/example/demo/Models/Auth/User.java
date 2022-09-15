package com.example.demo.Models.Auth;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table( name = "Users",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "username")
        })
public class User {


}
