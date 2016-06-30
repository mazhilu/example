package zjq.dao;

import zjq.model.emp;

public interface empMapper {
    int deleteByPrimaryKey(Integer ip);

    int insert(emp record);

    int insertSelective(emp record);

    emp selectByPrimaryKey(Integer ip);

    int updateByPrimaryKeySelective(emp record);

    int updateByPrimaryKey(emp record);
}