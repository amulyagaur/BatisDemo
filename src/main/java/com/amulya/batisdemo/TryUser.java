package com.amulya.batisdemo;

import com.amulya.batisdemo.domain.User;
import com.amulya.batisdemo.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TryUser {

    public static void main(String[] args) {
        UserService u =new UserService();
//        final List<Integer> ids =new ArrayList<Integer>();
//        ids.add(2);
//        ids.add(3);
//        ids.add(4);
//        final List<String> nms = new ArrayList<String>();
//        nms.add("garg");
//        Map<String , Object> params = new HashMap<String, Object>();
//        params.put("idsx",ids);
//        params.put("fname",nms);
        List<User> x= u.getAllUsers();
        for(User d : x){
            System.out.println(d);
        }

        System.out.println("New Code");


    }
}
