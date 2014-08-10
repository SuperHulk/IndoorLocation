package dao;

import java.util.List;
import module.TProminfoIbeacons;
import module.TProminfoIbeaconsExample;
import org.apache.ibatis.annotations.Param;

public interface TProminfoIbeaconsMapper {
    int countByExample(TProminfoIbeaconsExample example);

    int deleteByExample(TProminfoIbeaconsExample example);

    int insert(TProminfoIbeacons record);

    int insertSelective(TProminfoIbeacons record);

    List<TProminfoIbeacons> selectByExample(TProminfoIbeaconsExample example);

    int updateByExampleSelective(@Param("record") TProminfoIbeacons record, @Param("example") TProminfoIbeaconsExample example);

    int updateByExample(@Param("record") TProminfoIbeacons record, @Param("example") TProminfoIbeaconsExample example);
}