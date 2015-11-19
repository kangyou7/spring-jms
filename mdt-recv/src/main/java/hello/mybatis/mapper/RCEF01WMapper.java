package hello.mybatis.mapper;

import hello.mybatis.model.RCEF01W;
import hello.mybatis.model.RCEF01WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCEF01WMapper {
    int countByExample(RCEF01WExample example);

    int deleteByExample(RCEF01WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(RCEF01W record);

    int insertSelective(RCEF01W record);

    List<RCEF01W> selectByExample(RCEF01WExample example);

    RCEF01W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") RCEF01W record, @Param("example") RCEF01WExample example);

    int updateByExample(@Param("record") RCEF01W record, @Param("example") RCEF01WExample example);

    int updateByPrimaryKeySelective(RCEF01W record);

    int updateByPrimaryKey(RCEF01W record);
}