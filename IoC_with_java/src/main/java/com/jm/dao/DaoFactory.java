package com.jm.dao;

/**
 * ConnectionMaker의 구현체를 생성하여 이를 DAO에 주입하여 객체 생성 후 DAO를 제공하는 클래스
 */
public class DaoFactory {
    public UserDao userDao(){
        UserDao userDao = new UserDao(connectionMaker());
        return userDao;
    }

    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
