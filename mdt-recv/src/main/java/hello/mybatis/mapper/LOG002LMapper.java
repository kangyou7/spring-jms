package hello.mybatis.mapper;

import hello.mybatis.model.LOG002L;
import hello.mybatis.model.LOG002LExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOG002LMapper {
    int countByExample(LOG002LExample example);

    int deleteByExample(LOG002LExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("fileNm") String fileNm);

    int insert(LOG002L record);

    int insertSelective(LOG002L record);

    List<LOG002L> selectByExample(LOG002LExample example);

    LOG002L selectByPrimaryKey(@Param("workDay") String workDay, @Param("fileNm") String fileNm);

    int updateByExampleSelective(@Param("record") LOG002L record, @Param("example") LOG002LExample example);

    int updateByExample(@Param("record") LOG002L record, @Param("example") LOG002LExample example);

    int updateByPrimaryKeySelective(LOG002L record);

    int updateByPrimaryKey(LOG002L record);
}