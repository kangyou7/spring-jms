package hello.mybatis.mapper;

import hello.mybatis.model.RLFR01W;
import hello.mybatis.model.RLFR01WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLFR01WMapper {
    int countByExample(RLFR01WExample example);

    int deleteByExample(RLFR01WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(RLFR01W record);

    int insertSelective(RLFR01W record);

    List<RLFR01W> selectByExample(RLFR01WExample example);

    RLFR01W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") RLFR01W record, @Param("example") RLFR01WExample example);

    int updateByExample(@Param("record") RLFR01W record, @Param("example") RLFR01WExample example);

    int updateByPrimaryKeySelective(RLFR01W record);

    int updateByPrimaryKey(RLFR01W record);
}