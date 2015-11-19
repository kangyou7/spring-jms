package hello.mybatis.mapper;

import hello.mybatis.model.LOGD21W;
import hello.mybatis.model.LOGD21WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGD21WMapper {
    int countByExample(LOGD21WExample example);

    int deleteByExample(LOGD21WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(LOGD21W record);

    int insertSelective(LOGD21W record);

    List<LOGD21W> selectByExample(LOGD21WExample example);

    LOGD21W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") LOGD21W record, @Param("example") LOGD21WExample example);

    int updateByExample(@Param("record") LOGD21W record, @Param("example") LOGD21WExample example);

    int updateByPrimaryKeySelective(LOGD21W record);

    int updateByPrimaryKey(LOGD21W record);
}