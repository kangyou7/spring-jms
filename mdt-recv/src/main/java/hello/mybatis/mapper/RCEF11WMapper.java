package hello.mybatis.mapper;

import hello.mybatis.model.RCEF11W;
import hello.mybatis.model.RCEF11WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCEF11WMapper {
    int countByExample(RCEF11WExample example);

    int deleteByExample(RCEF11WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(RCEF11W record);

    int insertSelective(RCEF11W record);

    List<RCEF11W> selectByExample(RCEF11WExample example);

    RCEF11W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") RCEF11W record, @Param("example") RCEF11WExample example);

    int updateByExample(@Param("record") RCEF11W record, @Param("example") RCEF11WExample example);

    int updateByPrimaryKeySelective(RCEF11W record);

    int updateByPrimaryKey(RCEF11W record);
}