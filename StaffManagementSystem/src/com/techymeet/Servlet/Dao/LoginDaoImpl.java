package com.techymeet.Servlet.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.techymeet.Servlet.Bo.Login;
import com.techymeet.Servlet.utils.DataBaseConnection;

public class LoginDaoImpl implements LoginDao {

    @Override
    public Login LoginsDao(String userName, String passWord) {
        Login loginVo = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Get database connection
            con = DataBaseConnection.getConnection();

            // Check if the connection is not null
            if (con == null) {
                throw new NullPointerException("Database connection is null.");
            }

            String sql = "SELECT * FROM login WHERE userName = ? AND passWord = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, userName);
            pst.setString(2, passWord);
            rs = pst.executeQuery();

            if (rs.next()) {
                loginVo = new Login();
                loginVo.setLoginId(rs.getInt("loginId")); // Assuming 'loginId' is the column name
                loginVo.setUserName(rs.getString("userName"));
                loginVo.setPassWord(rs.getString("passWord"));
                loginVo.setUserType(rs.getString("userType"));
            }
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Ensure resources are closed to prevent memory leaks
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return loginVo;
    }
}
