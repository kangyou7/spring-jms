package hello.mybatis.mapper;

import hello.mybatis.model.ITEF01W;
import hello.mybatis.model.ITEF01WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ITEF01WMapper {
    int countByExample(ITEF01WExample example);

    int deleteByExample(ITEF01WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(ITEF01W record);

    int insertSelective(ITEF01W record);

    List<ITEF01W> selectByExample(ITEF01WExample example);

    ITEF01W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") ITEF01W record, @Param("example") ITEF01WExample example);

    int updateByExample(@Param("record") ITEF01W record, @Param("example") ITEF01WExample example);

    int updateByPrimaryKeySelective(ITEF01W record);

    int updateByPrimaryKey(ITEF01W record);
}