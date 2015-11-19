package hello.mybatis.mapper;

import hello.mybatis.model.RCEF10W;
import hello.mybatis.model.RCEF10WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCEF10WMapper {
    int countByExample(RCEF10WExample example);

    int deleteByExample(RCEF10WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int insert(RCEF10W record);

    int insertSelective(RCEF10W record);

    List<RCEF10W> selectByExample(RCEF10WExample example);

    RCEF10W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int updateByExampleSelective(@Param("record") RCEF10W record, @Param("example") RCEF10WExample example);

    int updateByExample(@Param("record") RCEF10W record, @Param("example") RCEF10WExample example);

    int updateByPrimaryKeySelective(RCEF10W record);

    int updateByPrimaryKey(RCEF10W record);
}