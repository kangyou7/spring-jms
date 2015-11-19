package hello.mybatis.mapper;

import hello.mybatis.model.RLFR30W;
import hello.mybatis.model.RLFR30WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLFR30WMapper {
    int countByExample(RLFR30WExample example);

    int deleteByExample(RLFR30WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(RLFR30W record);

    int insertSelective(RLFR30W record);

    List<RLFR30W> selectByExample(RLFR30WExample example);

    RLFR30W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") RLFR30W record, @Param("example") RLFR30WExample example);

    int updateByExample(@Param("record") RLFR30W record, @Param("example") RLFR30WExample example);

    int updateByPrimaryKeySelective(RLFR30W record);

    int updateByPrimaryKey(RLFR30W record);
}