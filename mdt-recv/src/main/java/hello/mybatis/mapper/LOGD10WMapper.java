package hello.mybatis.mapper;

import hello.mybatis.model.LOGD10W;
import hello.mybatis.model.LOGD10WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGD10WMapper {
    int countByExample(LOGD10WExample example);

    int deleteByExample(LOGD10WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int insert(LOGD10W record);

    int insertSelective(LOGD10W record);

    List<LOGD10W> selectByExample(LOGD10WExample example);

    LOGD10W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int updateByExampleSelective(@Param("record") LOGD10W record, @Param("example") LOGD10WExample example);

    int updateByExample(@Param("record") LOGD10W record, @Param("example") LOGD10WExample example);

    int updateByPrimaryKeySelective(LOGD10W record);

    int updateByPrimaryKey(LOGD10W record);
}