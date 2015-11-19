package hello.mybatis.mapper;

import hello.mybatis.model.ITRF01W;
import hello.mybatis.model.ITRF01WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ITRF01WMapper {
    int countByExample(ITRF01WExample example);

    int deleteByExample(ITRF01WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(ITRF01W record);

    int insertSelective(ITRF01W record);

    List<ITRF01W> selectByExample(ITRF01WExample example);

    ITRF01W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") ITRF01W record, @Param("example") ITRF01WExample example);

    int updateByExample(@Param("record") ITRF01W record, @Param("example") ITRF01WExample example);

    int updateByPrimaryKeySelective(ITRF01W record);

    int updateByPrimaryKey(ITRF01W record);
}