package cn.sdcet.dao;
import cn.sdcet.db.User;
public interface Userdao1 {
	public void regist1(User user);
	public boolean login1(User user) throws Exception;
}
