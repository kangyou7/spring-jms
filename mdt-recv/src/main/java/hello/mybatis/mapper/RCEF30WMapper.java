package hello.mybatis.mapper;

import hello.mybatis.model.RCEF30W;
import hello.mybatis.model.RCEF30WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RCEF30WMapper {
    int countByExample(RCEF30WExample example);

    int deleteByExample(RCEF30WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(RCEF30W record);

    int insertSelective(RCEF30W record);

    List<RCEF30W> selectByExample(RCEF30WExample example);

    RCEF30W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") RCEF30W record, @Param("example") RCEF30WExample example);

    int updateByExample(@Param("record") RCEF30W record, @Param("example") RCEF30WExample example);

    int updateByPrimaryKeySelective(RCEF30W record);

    int updateByPrimaryKey(RCEF30W record);
}