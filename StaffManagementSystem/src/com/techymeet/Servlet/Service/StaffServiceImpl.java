package com.techymeet.Servlet.Service;

import java.util.ArrayList;

import com.techymeet.Servlet.Bo.Staff;
import com.techymeet.Servlet.Dao.StaffDao;
import com.techymeet.Servlet.Dao.StaffDaoImpl;
import com.techymeet.Servlet.Vo.StaffVo;

public class StaffServiceImpl implements StaffService {
	StaffDao Dao = new StaffDaoImpl();

	@Override
	public int CreateStaff(Staff Bo) {
		Staff Vo = new Staff();
		int StaffId = 0;

		if (null != Bo) {
			Vo.setFirstName(Bo.getFirstName());
			Vo.setLastName(Bo.getLastName());
			Vo.setAddress(Bo.getAddress());
			Vo.setLocation(Bo.getLocation());
			Vo.setPhoneNumber(Bo.getPhoneNumber());
			Vo.setState(Bo.getState());
		}
		StaffId = Dao.CreateStaff(Vo);

		return StaffId;
	}

	@Override
	public ArrayList<Staff> StaffList() {

		ArrayList<Staff> ListBo = new ArrayList<>();
		ArrayList<StaffVo> listVo = Dao.ListStaff();
		if (null != listVo && 0 < listVo.size()) {
			for (StaffVo Vo : listVo) {
				Staff Bo = new Staff();
				Bo.setStaffId(Vo.getStaffId());
				Bo.setFirstName(Vo.getFirstName());
				Bo.setLastName(Vo.getLastName());
				Bo.setAddress(Vo.getAddress());
				Bo.setLocation(Vo.getLocation());
				Bo.setPhoneNumber(Vo.getPhoneNumber());
				Bo.setState(Vo.getState());
				ListBo.add(Bo);
			}
		}

		return ListBo;
	}

	@Override
	public Staff ViewStaff(int StaffId) {
		Staff Bo = new Staff();
		StaffVo Vo = Dao.ViewStaff(StaffId);
		if (null != Vo) {

			Bo.setStaffId(Vo.getStaffId());
			Bo.setFirstName(Vo.getFirstName());
			Bo.setLastName(Vo.getLastName());
			Bo.setAddress(Vo.getAddress());
			Bo.setLocation(Vo.getLocation());
			Bo.setState(Vo.getState());
			Bo.setPhoneNumber(Vo.getPhoneNumber());
		}

		return Bo;
	}

	

	@Override
	public int EditStaff(Staff bo) {
		int StaffId ;
		Staff Vo=new Staff();
		Staff Bo=new Staff();

		if (null != bo) {
			Vo.setStaffId(bo.getStaffId());
			Vo.setFirstName(bo.getFirstName());
			Vo.setLastName(bo.getLastName());
			Vo.setAddress(bo.getAddress());
			Vo.setLocation(bo.getLocation());
			Vo.setPhoneNumber(bo.getPhoneNumber());
			Vo.setState(bo.getState());
		}
		StaffId = Dao.EditStaff(Vo);
		return StaffId;
	}

	@Override
	public Staff EditStaff(int staffId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean DeleteStaff(int StaffId) {
		Boolean Id=Dao.DeleteStaff(StaffId);
		return Id;
	}

}
