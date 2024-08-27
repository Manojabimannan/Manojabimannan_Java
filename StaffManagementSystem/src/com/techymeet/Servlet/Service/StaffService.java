package com.techymeet.Servlet.Service;

import com.techymeet.Servlet.Bo.Staff;
import java.util.*;

public interface StaffService {

	int CreateStaff(Staff Bo);

	ArrayList<Staff> StaffList();

	Staff ViewStaff(int StaffId);

	Staff EditStaff(int staffId);

	int EditStaff(Staff bo);

	Boolean DeleteStaff(int StaffId);

}
