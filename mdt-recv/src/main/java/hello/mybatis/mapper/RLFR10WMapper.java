package hello.mybatis.mapper;

import hello.mybatis.model.RLFR10W;
import hello.mybatis.model.RLFR10WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLFR10WMapper {
    int countByExample(RLFR10WExample example);

    int deleteByExample(RLFR10WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int insert(RLFR10W record);

    int insertSelective(RLFR10W record);

    List<RLFR10W> selectByExample(RLFR10WExample example);

    RLFR10W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int updateByExampleSelective(@Param("record") RLFR10W record, @Param("example") RLFR10WExample example);

    int updateByExample(@Param("record") RLFR10W record, @Param("example") RLFR10WExample example);

    int updateByPrimaryKeySelective(RLFR10W record);

    int updateByPrimaryKey(RLFR10W record);
}