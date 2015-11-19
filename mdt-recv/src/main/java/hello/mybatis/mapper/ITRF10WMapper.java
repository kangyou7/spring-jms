package hello.mybatis.mapper;

import hello.mybatis.model.ITRF10W;
import hello.mybatis.model.ITRF10WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ITRF10WMapper {
    int countByExample(ITRF10WExample example);

    int deleteByExample(ITRF10WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(ITRF10W record);

    int insertSelective(ITRF10W record);

    List<ITRF10W> selectByExample(ITRF10WExample example);

    ITRF10W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") ITRF10W record, @Param("example") ITRF10WExample example);

    int updateByExample(@Param("record") ITRF10W record, @Param("example") ITRF10WExample example);

    int updateByPrimaryKeySelective(ITRF10W record);

    int updateByPrimaryKey(ITRF10W record);
}