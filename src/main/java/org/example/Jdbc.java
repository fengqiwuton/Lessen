package org.example;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Jdbc {
    public static void main(String[] args) throws java.sql.SQLException {
        //新建一个目录加入对应的驱动文件如mysql.jar
        //1.注册驱动

        Driver driver = new Driver();


        //2.建立连接
            String url = "jdbc:mysql://localhost:3306/db01";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connect = driver.connect(url, properties);


        //3.执行sql and

        String sql = "insert into users values(1, 'huang', 'home')";
        //创建statement对象
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);
        //影响的行数
        System.out.println(i > 0 ? "success" : "fail");

        //4.释放连接资源
        statement.close();
        connect.close();
    }
}
