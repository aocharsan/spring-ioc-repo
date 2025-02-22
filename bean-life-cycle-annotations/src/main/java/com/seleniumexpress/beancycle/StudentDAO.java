package com.seleniumexpress.beancycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	@Value("${mysql.driver}")
	private String driver;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.user}")
	private String user;
	@Value("${mysql.password}")
	private String password;

	private Connection conn;

	@PostConstruct
	public void createDBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("DB Connection created successfully........");

	}

	public void selectAllRows() {

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM sys.student");
			while (rs.next()) {
				int stuId = rs.getInt(1);
				int stuAge = rs.getInt(2);
				String stuDept = rs.getString(3);
				String stuName = rs.getString(4);

				System.out.println(stuId + "  " + stuAge + "  " + stuDept + "  " + stuName);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void deleteStuRecordById(int studentID) {

		try {
			Statement stmt = conn.createStatement();
			int row = stmt.executeUpdate("delete from sys.student where id =" + studentID);
			if (row >= 1) {
				System.out.println("Student record successfully deleted for ID :" + studentID);
			} else {
				System.out.println("Record doesn't exist");
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	@PreDestroy
	public void closeDBConnection() throws SQLException {
		conn.close();
		System.out.println("DB Connection closed successfully......");
	}

};