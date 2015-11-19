package hello.mybatis.mapper;

import hello.mybatis.model.RLFR21W;
import hello.mybatis.model.RLFR21WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLFR21WMapper {
    int countByExample(RLFR21WExample example);

    int deleteByExample(RLFR21WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(RLFR21W record);

    int insertSelective(RLFR21W record);

    List<RLFR21W> selectByExample(RLFR21WExample example);

    RLFR21W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") RLFR21W record, @Param("example") RLFR21WExample example);

    int updateByExample(@Param("record") RLFR21W record, @Param("example") RLFR21WExample example);

    int updateByPrimaryKeySelective(RLFR21W record);

    int updateByPrimaryKey(RLFR21W record);
}