package com.example.demo.Models.Auth;

import javax.persistence.*;
import java.util.HashSet;

@Entity
@Table( name = "Users",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "username")
        })
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;

        private String password;

//        @ManyToMany(fetch = FetchType.EAGER)
//        @JoinTable(name = "user_roles",
//                joinColumns = @JoinColumn(name = "user_id"),
//                inverseJoinColumns = @JoinColumn(name = "role_id")
//        )
//        private Set<Role> roles = new HashSet<>();

        public User (){
        }

        public User (String username, String password) {
                this.username = username;
                this.password = password;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
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
}
