package dao;

import java.util.List;
import module.TPromInfo;
import module.TPromInfoExample;
import org.apache.ibatis.annotations.Param;

public interface TPromInfoMapper {
    int countByExample(TPromInfoExample example);

    int deleteByExample(TPromInfoExample example);

    int insert(TPromInfo record);

    int insertSelective(TPromInfo record);

    List<TPromInfo> selectByExample(TPromInfoExample example);

    int updateByExampleSelective(@Param("record") TPromInfo record, @Param("example") TPromInfoExample example);

    int updateByExample(@Param("record") TPromInfo record, @Param("example") TPromInfoExample example);
}