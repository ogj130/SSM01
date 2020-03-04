package com.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.Connection;

public class TestCombo {
    public ComboPooledDataSource dataSource;
    @Test
    public void eee() throws Exception{
        ComboPooledDataSource DataSource = new ComboPooledDataSource("otherc3p0");
        System.out.println("连接："+DataSource.getConnection());
        Connection connection = DataSource.getConnection();
        System.out.println("连接："+connection);
        connection.close();
        System.out.println("连接："+DataSource.getConnection());
    }


}
