package com.example.demo.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> userList = new ArrayList<>();
    private static int count;

    static {
        userList.add(new User(++count, "chamil", new Date()));
        userList.add(new User(++count, "madawa", new Date()));
        userList.add(new User(++count, "elleee", new Date()));
    }

    public List<User> findAll() {
        return userList;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++count);
        }
        userList.add(user);
        return user;
    }

    public User findOne(int id) {
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() == id) {
                return next;
            }
        }
        return null;
    }


}
