package com.epam.com;

public class Main {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        System.out.println(list.toString());
        list.add(-2);
        list.add(1000000);
        list.add(0);
        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        list.toArray();
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println("--------------------");

        UserDao userDao = new UserDao();
        userDao.save("Liza", "soglaeva@gmail.com");
        userDao.save("Ivan", "ivanov@mail.ru");
        userDao.save("Sergey", "Sergeev@mail.ru");
        System.out.println(userDao.contains(new User("Liza", "soglaeva@gmail.com")));
        userDao.remove(1);
        userDao.clear();

    }

}
