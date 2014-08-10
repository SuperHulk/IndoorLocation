package dao;

import java.util.List;
import module.TStoreIbeacons;
import module.TStoreIbeaconsExample;
import org.apache.ibatis.annotations.Param;

public interface TStoreIbeaconsMapper {
    int countByExample(TStoreIbeaconsExample example);

    int deleteByExample(TStoreIbeaconsExample example);

    int insert(TStoreIbeacons record);

    int insertSelective(TStoreIbeacons record);

    List<TStoreIbeacons> selectByExample(TStoreIbeaconsExample example);

    int updateByExampleSelective(@Param("record") TStoreIbeacons record, @Param("example") TStoreIbeaconsExample example);

    int updateByExample(@Param("record") TStoreIbeacons record, @Param("example") TStoreIbeaconsExample example);
}