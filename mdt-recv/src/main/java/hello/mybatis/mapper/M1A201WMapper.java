package hello.mybatis.mapper;

import hello.mybatis.model.M1A201W;
import hello.mybatis.model.M1A201WExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface M1A201WMapper {
    int countByExample(M1A201WExample example);

    int deleteByExample(M1A201WExample example);

    int deleteByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int insert(M1A201W record);

    int insertSelective(M1A201W record);

    List<M1A201W> selectByExample(M1A201WExample example);

    M1A201W selectByPrimaryKey(@Param("workDay") String workDay, @Param("mdtId") String mdtId);

    int updateByExampleSelective(@Param("record") M1A201W record, @Param("example") M1A201WExample example);

    int updateByExample(@Param("record") M1A201W record, @Param("example") M1A201WExample example);

    int updateByPrimaryKeySelective(M1A201W record);

    int updateByPrimaryKey(M1A201W record);
}