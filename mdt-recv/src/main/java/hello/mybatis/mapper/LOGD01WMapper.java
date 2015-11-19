package hello.mybatis.mapper;

import hello.mybatis.model.LOGD01W;
import hello.mybatis.model.LOGD01WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGD01WMapper {
    int countByExample(LOGD01WExample example);

    int deleteByExample(LOGD01WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(LOGD01W record);

    int insertSelective(LOGD01W record);

    List<LOGD01W> selectByExample(LOGD01WExample example);

    LOGD01W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") LOGD01W record, @Param("example") LOGD01WExample example);

    int updateByExample(@Param("record") LOGD01W record, @Param("example") LOGD01WExample example);

    int updateByPrimaryKeySelective(LOGD01W record);

    int updateByPrimaryKey(LOGD01W record);
}