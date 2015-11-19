package hello.mybatis.mapper;

import hello.mybatis.model.PCTR01W;
import hello.mybatis.model.PCTR01WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PCTR01WMapper {
    int countByExample(PCTR01WExample example);

    int deleteByExample(PCTR01WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(PCTR01W record);

    int insertSelective(PCTR01W record);

    List<PCTR01W> selectByExample(PCTR01WExample example);

    PCTR01W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") PCTR01W record, @Param("example") PCTR01WExample example);

    int updateByExample(@Param("record") PCTR01W record, @Param("example") PCTR01WExample example);

    int updateByPrimaryKeySelective(PCTR01W record);

    int updateByPrimaryKey(PCTR01W record);
}