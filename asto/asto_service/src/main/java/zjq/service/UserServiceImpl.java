package zjq.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zjq.dao.UserMapper;
import zjq.model.User;
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	//通过id获取user
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	//通过name获取user
	public User getUserByName(String name) {
		return userMapper.selectByName(name);
	}
	//插入数据
	public void insert(User user){
		userMapper.insertSelective(user);
	}
	public void delete(Integer id){
		userMapper.deleteByPrimaryKey(id);
	}
	//查询所有不带参
	public List<User> getAll() {	
		return userMapper.getAll();
	}
	//查询所有
	public List<User> getAll2() {
		return userMapper.getAll2();
	}

	public List<User> getAll3() {
		return userMapper.getAll3();
	}

	public List<User> getAll4() {
		return userMapper.getAll4();
	}

	public List<User> getAll6() {
		return userMapper.getAll6();
	}

	public void updateByPrimaryKeySelective(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public List<User> getAll7(Integer row, Integer size) {
		
		return userMapper.getAll7(row, size);
	}

	public List<User> getlike(String gex,Integer row, Integer size) {
		return userMapper.getlike(gex,row,size);
	}

	public List<User> getliketo(String gex) {
		
		return userMapper.getliketo(gex);
	}



}
