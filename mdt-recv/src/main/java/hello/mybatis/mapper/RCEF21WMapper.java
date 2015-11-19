package hello.mybatis.mapper;

import hello.mybatis.model.RCEF21W;
import hello.mybatis.model.RCEF21WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCEF21WMapper {
    int countByExample(RCEF21WExample example);

    int deleteByExample(RCEF21WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(RCEF21W record);

    int insertSelective(RCEF21W record);

    List<RCEF21W> selectByExample(RCEF21WExample example);

    RCEF21W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") RCEF21W record, @Param("example") RCEF21WExample example);

    int updateByExample(@Param("record") RCEF21W record, @Param("example") RCEF21WExample example);

    int updateByPrimaryKeySelective(RCEF21W record);

    int updateByPrimaryKey(RCEF21W record);
}