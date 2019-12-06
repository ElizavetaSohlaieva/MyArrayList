package com.epam.com;

    public class UserDao {

        public void save(String name, String email) {
            User user = new User(name, email);
            DataBase.userMap.put(DataBase.lastId, user);
            DataBase.lastId++;
            System.out.println(user.toString());

        }
        public boolean contains(User user) {
            return DataBase.userMap.containsValue(user);
        }
        public void remove(int key) {
            DataBase.userMap.remove(key);
            System.out.println(DataBase.userMap.toString());
        }
        public void clear(){
            DataBase.userMap.clear();
            System.out.println(DataBase.userMap.toString());
        }

    }

