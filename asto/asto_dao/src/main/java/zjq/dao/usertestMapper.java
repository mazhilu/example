package zjq.dao;

import java.util.List;

import zjq.model.User;
import zjq.model.usertest;

public interface usertestMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(usertest record);

    int insertSelective(usertest record);

    usertest selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(usertest record);

    int updateByPrimaryKey(usertest record);

}