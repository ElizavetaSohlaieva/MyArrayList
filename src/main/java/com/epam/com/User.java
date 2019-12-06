package com.epam.com;

import java.util.Objects;

public class User {
        private String name;
        private String email;

        public User() {
        }

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 29 * hash + Objects.hashCode(this.name);
            hash = 29 * hash + Objects.hashCode(this.email);
            return hash;
        }
        @Override
        public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + '}';
    }



    }
