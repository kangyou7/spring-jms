package hello.mybatis.mapper;

import hello.mybatis.model.LOGD20W;
import hello.mybatis.model.LOGD20WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGD20WMapper {
    int countByExample(LOGD20WExample example);

    int deleteByExample(LOGD20WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int insert(LOGD20W record);

    int insertSelective(LOGD20W record);

    List<LOGD20W> selectByExample(LOGD20WExample example);

    LOGD20W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int updateByExampleSelective(@Param("record") LOGD20W record, @Param("example") LOGD20WExample example);

    int updateByExample(@Param("record") LOGD20W record, @Param("example") LOGD20WExample example);

    int updateByPrimaryKeySelective(LOGD20W record);

    int updateByPrimaryKey(LOGD20W record);
}