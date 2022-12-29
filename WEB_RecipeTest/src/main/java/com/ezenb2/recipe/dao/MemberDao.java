package com.ezenb2.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ezenb2.recipe.dto.AddressVO;
import com.ezenb2.recipe.util.Dbman;

public class MemberDao {

	private MemberDao () {}
	private static MemberDao itc = new MemberDao();
	public static MemberDao getInstance() { return itc; }
	
	Connection con =null;
	PreparedStatement pstmt =null;
	ResultSet rs=null;
	
	
	public ArrayList<AddressVO> selectAddress(String dong) {
		ArrayList<AddressVO> list = new ArrayList<AddressVO>();
		
		con = Dbman.getConnection();
		
		String sql = "select * from address where dong like '%'||?||'%' ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dong);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				AddressVO avo = new AddressVO();
				
				avo.setZip_num(rs.getString("zip_num"));
		    	avo.setSido(rs.getString("sido"));
		    	avo.setGugun(rs.getString("gugun"));
		    	avo.setDong(rs.getString("dong"));
		    	avo.setZip_code(rs.getString("zip_code"));
		    	avo.setBunji(rs.getString("bunji"));
				
				list.add(avo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dbman.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	
	
	
}
