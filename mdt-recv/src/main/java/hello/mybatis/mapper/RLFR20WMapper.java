package hello.mybatis.mapper;

import hello.mybatis.model.RLFR20W;
import hello.mybatis.model.RLFR20WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLFR20WMapper {
    int countByExample(RLFR20WExample example);

    int deleteByExample(RLFR20WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int insert(RLFR20W record);

    int insertSelective(RLFR20W record);

    List<RLFR20W> selectByExample(RLFR20WExample example);

    RLFR20W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("carrFreqSeq") BigDecimal carrFreqSeq);

    int updateByExampleSelective(@Param("record") RLFR20W record, @Param("example") RLFR20WExample example);

    int updateByExample(@Param("record") RLFR20W record, @Param("example") RLFR20WExample example);

    int updateByPrimaryKeySelective(RLFR20W record);

    int updateByPrimaryKey(RLFR20W record);
}