package com.tom.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tom.Member;

public class MemberTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegist() {
		Member m = new Member("william", "1122", "112233", "will@com.tw");
		boolean validated = m.validate();
		assertTrue(validated);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://j.snpy.org/a105?user=a105&password=a105.33");
			PreparedStatement pstmt = conn.prepareStatement(
					"select * from users where userid=? and " +
			" passwd=? and email=?");
			pstmt.setString(1, m.getUserid());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getEmail());
			ResultSet rs = pstmt.executeQuery();
			assertTrue(rs.next());
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}
}
