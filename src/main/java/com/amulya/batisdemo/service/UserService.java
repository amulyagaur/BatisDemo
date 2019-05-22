package com.amulya.batisdemo.service;

import com.amulya.batisdemo.Query;
import com.amulya.batisdemo.domain.User;
import com.amulya.batisdemo.mappers.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
//    public void insertUser(User user) {
//        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//        try{
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            userMapper.insertUser(user);
//            sqlSession.commit();
//        }finally{
//            sqlSession.close();
//        }
//    }
//
//    public User getUserById(Integer userId) {
//        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//        try{
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            return userMapper.getUserById(userId);
//        }finally{
//            sqlSession.close();
//        }
//    }

    public List<User> getAllUsers() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.getAllUsers();
        }finally{
            sqlSession.close();
        }
    }

    public List<User> getUserInList(Query q) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Object> mp = new HashMap<String,Object>();
            mp.put("ids",q.getL());
            System.out.println(mp);
            return userMapper.getUserInList(mp);
        }finally{
            sqlSession.close();
        }
    }
//
//    public List<User> getUserIn(Map<String , Object> params) {
//        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//        try{
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            return userMapper.getUserIn(params);
//        }finally{
//            sqlSession.close();
//        }
//    }
//
//    public void updateUser(User user) {
//        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//        try{
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            userMapper.updateUser(user);
//            sqlSession.commit();
//        }finally{
//            sqlSession.close();
//        }
//
//    }
//
//    public void deleteUser(Integer userId) {
//        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//        try{
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            userMapper.deleteUser(userId);
//            sqlSession.commit();
//        }finally{
//            sqlSession.close();
//        }
//
//    }
}
