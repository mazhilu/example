package zjq.service;

import java.util.List;

import zjq.model.User;

public interface UserServiceI {
	public User getUserById(Integer id);
	public User getUserByName(String name);
	public void insert(User user);
	public void delete(Integer id);
	public List<User> getAll();
	public List<User> getAll2();
	public List<User> getAll3();
	public List<User> getAll4();
	public List<User> getAll6();
	public void updateByPrimaryKeySelective(User user);
	public List<User> getAll7(Integer row,Integer size);
	public List<User> getlike(String gex,Integer row,Integer size);
	public List<User> getliketo(String gex);
}
