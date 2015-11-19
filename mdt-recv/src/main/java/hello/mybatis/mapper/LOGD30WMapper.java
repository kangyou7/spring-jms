package hello.mybatis.mapper;

import hello.mybatis.model.LOGD30W;
import hello.mybatis.model.LOGD30WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGD30WMapper {
    int countByExample(LOGD30WExample example);

    int deleteByExample(LOGD30WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(LOGD30W record);

    int insertSelective(LOGD30W record);

    List<LOGD30W> selectByExample(LOGD30WExample example);

    LOGD30W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") LOGD30W record, @Param("example") LOGD30WExample example);

    int updateByExample(@Param("record") LOGD30W record, @Param("example") LOGD30WExample example);

    int updateByPrimaryKeySelective(LOGD30W record);

    int updateByPrimaryKey(LOGD30W record);
}