package com.techymeet.Servlet.Service;

import com.techymeet.Servlet.Bo.Login;
import com.techymeet.Servlet.Dao.LoginDao;
import com.techymeet.Servlet.Dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {

	LoginDao loginDao=new LoginDaoImpl();
	@Override
	public Login loginValidate(String userName, String passWord) {
		
		Login loginBo=new Login();
		Login loginVo=loginDao.LoginsDao(userName,passWord);
		
		if(null!=loginVo) {
			loginBo.setLoginId(loginVo.getLoginId());
			loginBo.setUserName(loginVo.getUserName());
			loginBo.setPassWord(loginVo.getPassWord());
			loginBo.setUserType(loginVo.getUserType());
		}
		return loginBo;
	}

}
