package hello.mybatis.mapper;

import hello.mybatis.model.LOG003L;
import hello.mybatis.model.LOG003LExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOG003LMapper {
    int countByExample(LOG003LExample example);

    int deleteByExample(LOG003LExample example);

    int deleteByPrimaryKey(String workDay);

    int insert(LOG003L record);

    int insertSelective(LOG003L record);

    List<LOG003L> selectByExample(LOG003LExample example);

    LOG003L selectByPrimaryKey(String workDay);

    int updateByExampleSelective(@Param("record") LOG003L record, @Param("example") LOG003LExample example);

    int updateByExample(@Param("record") LOG003L record, @Param("example") LOG003LExample example);

    int updateByPrimaryKeySelective(LOG003L record);

    int updateByPrimaryKey(LOG003L record);
}