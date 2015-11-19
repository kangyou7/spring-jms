package hello.mybatis.mapper;

import hello.mybatis.model.RCEF20W;
import hello.mybatis.model.RCEF20WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCEF20WMapper {
    int countByExample(RCEF20WExample example);

    int deleteByExample(RCEF20WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int insert(RCEF20W record);

    int insertSelective(RCEF20W record);

    List<RCEF20W> selectByExample(RCEF20WExample example);

    RCEF20W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int updateByExampleSelective(@Param("record") RCEF20W record, @Param("example") RCEF20WExample example);

    int updateByExample(@Param("record") RCEF20W record, @Param("example") RCEF20WExample example);

    int updateByPrimaryKeySelective(RCEF20W record);

    int updateByPrimaryKey(RCEF20W record);
}