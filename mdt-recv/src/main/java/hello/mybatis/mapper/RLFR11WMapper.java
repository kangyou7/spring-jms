package hello.mybatis.mapper;

import hello.mybatis.model.RLFR11W;
import hello.mybatis.model.RLFR11WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLFR11WMapper {
    int countByExample(RLFR11WExample example);

    int deleteByExample(RLFR11WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(RLFR11W record);

    int insertSelective(RLFR11W record);

    List<RLFR11W> selectByExample(RLFR11WExample example);

    RLFR11W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") RLFR11W record, @Param("example") RLFR11WExample example);

    int updateByExample(@Param("record") RLFR11W record, @Param("example") RLFR11WExample example);

    int updateByPrimaryKeySelective(RLFR11W record);

    int updateByPrimaryKey(RLFR11W record);
}