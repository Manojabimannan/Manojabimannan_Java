package com.techymeet.Servlet.Dao;


import com.techymeet.Servlet.Bo.Staff;
import com.techymeet.Servlet.Vo.StaffVo;
import com.techymeet.Servlet.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StaffDaoImpl implements StaffDao {

	@Override
	public int CreateStaff(Staff vo) {
		Connection con = null;
		PreparedStatement ps = null;
		int status = 0;

		try {
			// Check if Location is null or empty
			if (vo.getLocation() == null || vo.getLocation().trim().isEmpty()) {
				throw new IllegalArgumentException("Location cannot be null or empty");
			}

			con = DataBaseConnection.getConnection();
			String sql = "INSERT INTO Staff (FirstName, LastName, PhoneNumber, Address, Location, State) VALUES (?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);

			ps.setString(1, vo.getFirstName());
			ps.setString(2, vo.getLastName());
			ps.setLong(3, vo.getPhoneNumber()); // PhoneNumber is a Long
			ps.setString(4, vo.getAddress());
			ps.setString(5, vo.getLocation()); // Ensure Location is not null
			ps.setString(6, vo.getState());

			status = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace(); // Consider using a logger
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace(); // Consider using a logger
			}
		}

		return status;
	}

	@Override
	public ArrayList<StaffVo> ListStaff() {

		ArrayList<StaffVo> ListVo = new ArrayList<>();
		try {
		
			Connection con = DataBaseConnection.getConnection();
			
			Statement st =  con.createStatement();
			String sql = "Select * from Staff";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				StaffVo Vo = new StaffVo();
				Vo.setStaffId(rs.getInt("StaffId"));
				Vo.setFirstName(rs.getString("FirstName"));
				Vo.setLastName(rs.getString("LastName"));
				Vo.setAddress(rs.getString("Address"));
				Vo.setLocation(rs.getString("Location"));
				Vo.setPhoneNumber(rs.getLong("PhoneNumber"));
				Vo.setState(rs.getString("State"));
				ListVo.add(Vo);
			}
			con.close();
			st.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ListVo;
	}

	@Override
	public StaffVo ViewStaff(int StaffId) {
		StaffVo Vo = new StaffVo();
		try {
			Connection con = DataBaseConnection.getConnection();
			Statement st = (Statement) con.createStatement();
			String sql = "Select * From Staff Where StaffId=" + StaffId;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Vo.setStaffId(rs.getInt("StaffId"));
				Vo.setFirstName(rs.getString("FirstName"));
				Vo.setLastName(rs.getString("LastName"));
				Vo.setAddress(rs.getString("Address"));
				Vo.setState(rs.getString("State"));
				Vo.setLocation(rs.getString("Location"));
				Vo.setPhoneNumber(rs.getLong("PhoneNumber"));
				st.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Vo;
	}

	@Override
	public int EditStaff(Staff vo) {
	    String sql = "UPDATE Staff SET "
	               + "FirstName = ?, "
	               + "LastName = ?, "
	               + "Address = ?, "
	               + "PhoneNumber = ?, "
	               + "Location = ?, "
	               + "State = ? "
	               + "WHERE StaffId = ?";

	    try (Connection con = DataBaseConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        // Setting parameters
	        ps.setString(1, vo.getFirstName());
	        ps.setString(2, vo.getLastName());
	        ps.setString(3, vo.getAddress());
	        ps.setLong(4, vo.getPhoneNumber()); // Assuming PhoneNumber is a String, change to setInt or setLong if it's a number
	        ps.setString(5, vo.getLocation());
	        ps.setString(6, vo.getState());
	        ps.setInt(7, vo.getStaffId());

	        // Execute the update
	        int rowsUpdated = ps.executeUpdate();

	        if (rowsUpdated > 0) {
	            System.out.println("An existing staff member was updated successfully!");
	        }

	        return rowsUpdated; // Return the number of rows updated

	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Log the error or rethrow it based on your requirements
	    }

	    return 0; // Return 0 if the update failed
	}


	@Override
	public Boolean DeleteStaff(int StaffId) {
	    String sql = "DELETE FROM Staff WHERE StaffId = ?";
	    
	    // Using try-with-resources to automatically close resources
	    try (Connection con = DataBaseConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {
	        
	        ps.setInt(1, StaffId);
	        int rowsDeleted = ps.executeUpdate();

	        return rowsDeleted > 0; // Return true if the deletion was successful

	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // Indicate failure in case of an exception
	    }
	}

}