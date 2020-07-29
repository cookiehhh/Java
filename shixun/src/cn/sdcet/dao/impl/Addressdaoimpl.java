package cn.sdcet.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

import cn.sdcet.dao.Addressdao;
import cn.sdcet.db.Address;

import cn.sdcet.base.DbaseUtil;

public class Addressdaoimpl implements Addressdao {

	public void add(Address ad) {
		
		 Connection conn=DbaseUtil.getConnection();
	 		String sql=	"insert into jiaren (name,telephone,qq) values(?,?,?)";
	 		PreparedStatement ptmt;
			try {
				ptmt = conn.prepareStatement(sql);
	 		ptmt.setString(1,ad.getName());
	 		ptmt.setString(2, ad.getTelephone());
	 		ptmt.setString(3, ad.getQq());
	 		ptmt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	}
	public void add1(Address ad) {
		
		 Connection conn=DbaseUtil.getConnection();
	 		String sql=	"insert into pengyou (name,telephone,qq) values(?,?,?)";
	 		PreparedStatement ptmt;
			try {
				ptmt = conn.prepareStatement(sql);
	 		ptmt.setString(1,ad.getName());
	 		ptmt.setString(2, ad.getTelephone());
	 		ptmt.setString(3, ad.getQq());
	 		ptmt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	}
	public void add2(Address ad) {
		
		 Connection conn=DbaseUtil.getConnection();
	 		String sql=	"insert into tongxue (name,telephone,qq) values(?,?,?)";
	 		PreparedStatement ptmt;
			try {
				ptmt = conn.prepareStatement(sql);
	 		ptmt.setString(1,ad.getName());
	 		ptmt.setString(2, ad.getTelephone());
	 		ptmt.setString(3, ad.getQq());
	 		ptmt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	}
	public void add3(Address ad) {
		
		 Connection conn=DbaseUtil.getConnection();
	 		String sql=	"insert into giumi (name,telephone,qq) values(?,?,?)";
	 		PreparedStatement ptmt;
			try {
				ptmt = conn.prepareStatement(sql);
	 		ptmt.setString(1,ad.getName());
	 		ptmt.setString(2, ad.getTelephone());
	 		ptmt.setString(3, ad.getQq());
	 		ptmt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	}
	public void delete(String a) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="delete from jiaren where name=? ";
 		
 	         
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			ptmt.setString(1, a );
 			ptmt.execute();
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void delete1(String a) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="delete from pengyou where name=? ";
 		
 	         
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			ptmt.setString(1, a );
 			ptmt.execute();
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void delete2(String a) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="delete from tongxue where name=? ";
 		
 	         
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			ptmt.setString(1, a );
 			ptmt.execute();
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void delete3(String a) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="delete from giumi where name=? ";
 		
 	         
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			ptmt.setString(1, a );
 			ptmt.execute();
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@Override
	public void update(Address ad) {
		Connection conn1=DbaseUtil.getConnection();
 		String sql1=	"update jiaren set name=?, telephone=?,qq= ? where name=?";
 		PreparedStatement ptmt;
		try {
			ptmt = conn1.prepareStatement(sql1);
			ptmt.setString(1, ad.getName() );
			ptmt.setString(2, ad.getTelephone() );
			ptmt.setString(3, ad.getQq() );
 		ptmt.setString(4, ad.getName() );
 		ptmt.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	public void update1(Address ad) {
		Connection conn1=DbaseUtil.getConnection();
 		String sql1=	"update pengyou set name=?, telephone=?,qq= ? where name=?";
 		PreparedStatement ptmt;
		try {
			ptmt = conn1.prepareStatement(sql1);
			ptmt.setString(1, ad.getName() );
			ptmt.setString(2, ad.getTelephone() );
			ptmt.setString(3, ad.getQq() );
 		ptmt.setString(4, ad.getName() );
 		ptmt.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	public void update2(Address ad) {
		Connection conn1=DbaseUtil.getConnection();
 		String sql1=	"update tongxue set name=?, telephone=?,qq= ? where name=?";
 		PreparedStatement ptmt;
		try {
			ptmt = conn1.prepareStatement(sql1);
			ptmt.setString(1, ad.getName() );
			ptmt.setString(2, ad.getTelephone() );
			ptmt.setString(3, ad.getQq() );
 		ptmt.setString(4, ad.getName() );
 		ptmt.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	public void update3(Address ad) {
		Connection conn1=DbaseUtil.getConnection();
 		String sql1=	"update giumi set name=?, telephone=?,qq= ? where name=?";
 		PreparedStatement ptmt;
		try {
			ptmt = conn1.prepareStatement(sql1);
			ptmt.setString(1, ad.getName() );
			ptmt.setString(2, ad.getTelephone() );
			ptmt.setString(3, ad.getQq() );
 		ptmt.setString(4, ad.getName() );
 		ptmt.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	@Override
	public void select(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from jiaren where name=?";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			ptmt.setString(1, ad.getName() );
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			int i=0;
 			if(rs.getString("name").equals(ad.getName())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		      
 	}
		          
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select01(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from jiaren ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("telephone").equals(ad.getTelephone())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void select02(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select  name,telephone,qq from jiaren ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("qq").equals(ad.getQq())){
                ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select1(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from pengyou ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("name").equals(ad.getName())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select11(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from pengyou ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("telephone").equals(ad.getTelephone())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select12(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from pengyou ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("qq").equals(ad.getQq())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select2(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from tongxue ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("name").equals(ad.getName())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select21(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from tongxue ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("telephone").equals(ad.getTelephone())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select22(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from tongxue ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("qq").equals(ad.getQq())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select3(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from giumi ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("name").equals(ad.getName())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select31(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from giumi ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("telephone").equals(ad.getTelephone())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void select32(Address ad) {
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from giumi ";
 		
 	
 		try {
 			
 			PreparedStatement ptmt = conn.prepareStatement(sql);
 			
 		ResultSet rs=ptmt.executeQuery();
 		while(rs.next()){
 			if(rs.getString("qq").equals(ad.getQq())){
 				ad.setName(rs.getString(1));
 				ad.setTelephone(rs.getString(2));
 				ad.setQq(rs.getString(3));
		
 		}
 		}
 		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void M1( Address ad) {
		int i=0,j=1;
		
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from jiaren";
 		
 		 
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
 		    ResultSet rs;
			rs = ptmt.executeQuery();
			while(rs.next()){
 				String name=rs.getString(1);
 				String tel=rs.getString(2);
 				String qq=rs.getString(3);
 				
			}
			
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
	}
		
	
	@Override
	public void M2(Address ad) {
		int i=0;
		Address a2=new Address();
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from pengyou";
 		
 		 
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
 		    ResultSet rs;
			rs = ptmt.executeQuery();
			while(rs.next()){
 				 a2.s[i]=rs.getString(1)+rs.getString(2)+rs.getString(3);
 				i++;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	@Override
	public void M3(Address ad) {
		int i=0;
		Address a3=new Address();
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from tongxue";
 		
 		 
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
 		    ResultSet rs;
			rs = ptmt.executeQuery();
			while(rs.next()){
 				 a3.s[i]=rs.getString(1)+rs.getString(2)+rs.getString(3)+"\n";
 				i++;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	@Override
	public void M4(Address ad) {
		int i=0;
		Address a4=new Address();
		Connection conn=DbaseUtil.getConnection();
 		
 		String sql="select name,telephone,qq from giumi";
 		
 		 
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
 		    ResultSet rs;
			rs = ptmt.executeQuery();
			while(rs.next()){
 				 a4.s[i]=rs.getString(1)+rs.getString(2)+rs.getString(3)+"\n";
 				i++;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
	
}
