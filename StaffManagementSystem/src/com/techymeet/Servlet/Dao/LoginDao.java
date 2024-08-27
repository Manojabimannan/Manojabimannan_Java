package com.techymeet.Servlet.Dao;

import com.techymeet.Servlet.Bo.Login;

public interface LoginDao {

	Login LoginsDao(String userName, String passWord);

}
