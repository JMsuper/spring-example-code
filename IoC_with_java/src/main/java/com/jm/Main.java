package com.jm;

import com.jm.dao.DaoFactory;
import com.jm.dao.UserDao;
import com.jm.domain.User;

import java.sql.SQLException;

/**
 * UserDao의 인스턴스를 사용하여 실행 테스트하는 클래스
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("1");
        user.setName("KJM");
        user.setPassword("123");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getId() + "조회 성공");
    }
}
