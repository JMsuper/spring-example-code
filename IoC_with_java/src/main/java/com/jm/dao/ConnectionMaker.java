package com.jm.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * DB 연결을 처리하는 클래스를 만드는 인터페이스
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
