package dao;

import java.util.List;
import module.TStore;
import module.TStoreExample;
import org.apache.ibatis.annotations.Param;

public interface TStoreMapper {
    int countByExample(TStoreExample example);

    int deleteByExample(TStoreExample example);

    int insert(TStore record);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStoreExample example);

    int updateByExampleSelective(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByExample(@Param("record") TStore record, @Param("example") TStoreExample example);
}