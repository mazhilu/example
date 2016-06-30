package zjq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zjq.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    User selectByName(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getAll();
    
	List<User> getAll2();
	
	List<User> getAll3();
	
	List<User> getAll4();
	
	List<User> getAll6();
	
	List<User> getAll7(@Param(value = "row") Integer row,@Param (value = "size") Integer size);

	List<User> getlike(@Param(value="gex") String gex,@Param(value = "row") Integer row,@Param (value = "size") Integer size);

    List<User> getliketo(@Param(value="gex") String gex);
}