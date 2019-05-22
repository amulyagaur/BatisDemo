package com.amulya.batisdemo.mappers;

import com.amulya.batisdemo.Query;
import com.amulya.batisdemo.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//    public void insertUser(User user);
//
//    public User getUserById(Integer userId);

    public List<User> getAllUsers();
    public List<User> getUserInList(Map<String,Object> mp);

//    public void updateUser(User user);
//
//    public void deleteUser(Integer userId);
//
//    public List<User> getUserIn(Map<String , Object> params);
}
