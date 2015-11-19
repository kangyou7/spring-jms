package hello.mybatis.mapper;

import hello.mybatis.model.LOGD11W;
import hello.mybatis.model.LOGD11WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGD11WMapper {
    int countByExample(LOGD11WExample example);

    int deleteByExample(LOGD11WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(LOGD11W record);

    int insertSelective(LOGD11W record);

    List<LOGD11W> selectByExample(LOGD11WExample example);

    LOGD11W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") LOGD11W record, @Param("example") LOGD11WExample example);

    int updateByExample(@Param("record") LOGD11W record, @Param("example") LOGD11WExample example);

    int updateByPrimaryKeySelective(LOGD11W record);

    int updateByPrimaryKey(LOGD11W record);
}