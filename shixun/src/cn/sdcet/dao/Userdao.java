package cn.sdcet.dao;
import cn.sdcet.db.User;
public interface Userdao {
	public void regist(User user);
	public boolean login(User user) throws Exception;
}
