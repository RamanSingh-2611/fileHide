package dao;

import db.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
    public static boolean isExists(String email) {
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("select email from users");
    }
}
