package com.techymeet.Servlet.Dao;

import java.util.ArrayList;

import com.techymeet.Servlet.Bo.Staff;
import com.techymeet.Servlet.Vo.StaffVo;

public interface StaffDao {

	int CreateStaff(Staff vo);

	ArrayList<StaffVo> ListStaff();

	StaffVo ViewStaff(int StaffId);

	int EditStaff(Staff vo);

	Boolean DeleteStaff(int StaffId);


}
