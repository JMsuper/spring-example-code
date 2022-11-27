package com.jm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConnectionMaker의 구현체로, DB와 관련한 실제 정보를 담고있는 클래스
 */
public class DConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/spring?useSSL=false",
                "root",
                "1111");
        return c;
    }
}
