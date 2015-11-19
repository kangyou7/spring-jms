package hello.mybatis.mapper;

import hello.mybatis.model.ITEF10W;
import hello.mybatis.model.ITEF10WExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ITEF10WMapper {
    int countByExample(ITEF10WExample example);

    int deleteByExample(ITEF10WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int insert(ITEF10W record);

    int insertSelective(ITEF10W record);

    List<ITEF10W> selectByExample(ITEF10WExample example);

    ITEF10W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId, @Param("ncellSeq") BigDecimal ncellSeq);

    int updateByExampleSelective(@Param("record") ITEF10W record, @Param("example") ITEF10WExample example);

    int updateByExample(@Param("record") ITEF10W record, @Param("example") ITEF10WExample example);

    int updateByPrimaryKeySelective(ITEF10W record);

    int updateByPrimaryKey(ITEF10W record);
}