package cn.sdcet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.sdcet.base.DbaseUtil;
import cn.sdcet.dao.Userdao;
import cn.sdcet.db.User;


public class Userdaoimpl implements Userdao {

	@Override
	public void regist(User user) {
		 Connection conn=DbaseUtil.getConnection();
	 		String sql=	"insert into users (user_name,user_pw) values(?,?)";
	 		PreparedStatement ptmt;
			try {
				ptmt = conn.prepareStatement(sql);
			
	 		
	 		ptmt.setString(1, user.getUsername() );
	 		ptmt.setString(2, user.getPassword());
	 		
	 		ptmt.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public boolean login(User user) throws Exception {
boolean flag=false;
 		
 		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select user_name,user_pw from users";
 		
 		PreparedStatement ptmt=conn.prepareStatement(sql);
 		
 		ResultSet rs=ptmt.executeQuery();
 		
 		while(rs.next()){
 			
 			if(rs.getString("user_name").equals(user.getUsername())&&rs.getString("user_pw").equals(user.getPassword())){
 				flag=true;
 				break;
 			}
 		}
 		return flag;
   
 }

}
