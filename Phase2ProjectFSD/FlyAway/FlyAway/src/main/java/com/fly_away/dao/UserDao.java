package com.fly_away.dao;

import java.sql.*;

import com.fly_away.entities.User;

public class UserDao {

	private Connection con;

	public UserDao(Connection con) {
		super();
		this.con = con;
	}

	// Method to insert user data into DB

	public boolean saveUser(User user) {

		boolean f = false;

		try {

			// user--->>>DB

			String query = "insert into user(name,email,password,gender,role) values (?,?,?,?,?)";

			PreparedStatement pstmt = this.con.prepareStatement(query);

			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getRole());

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return f;
	}

//	Get user by user email and password

	public User getUserByEmailAndPassword(String email, String password) {

		User user = null;

		try {

			String query = "Select * from user where email=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, email);
			pstmt.setString(2, password);

			ResultSet set = pstmt.executeQuery();

			if (set.next()) {

				user = new User();
//				 Data from data base
				String name = set.getString("name");
//				 Set to user object
				user.setName(name);

				user.setId(set.getInt("id"));
				user.setEmail(set.getString("email"));
				user.setPassword(set.getString("password"));
				user.setGender(set.getString("gender"));
				user.setRole(set.getString("role"));
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

}
