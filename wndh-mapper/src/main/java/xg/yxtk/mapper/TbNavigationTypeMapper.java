package xg.yxtk.mapper;

import org.apache.ibatis.annotations.Param;
import xg.yxtk.pojo.TbNavigationType;
import xg.yxtk.pojo.TbNavigationTypeExample;

import java.util.List;

public interface TbNavigationTypeMapper {
    int countByExample(TbNavigationTypeExample example);

    int deleteByExample(TbNavigationTypeExample example);

    int deleteByPrimaryKey(String navigationId);

    int insert(TbNavigationType record);

    int insertSelective(TbNavigationType record);

    List<TbNavigationType> selectByExample(TbNavigationTypeExample example);

    TbNavigationType selectByPrimaryKey(String navigationId);

    int updateByExampleSelective(@Param("record") TbNavigationType record, @Param("example") TbNavigationTypeExample example);

    int updateByExample(@Param("record") TbNavigationType record, @Param("example") TbNavigationTypeExample example);

    int updateByPrimaryKeySelective(TbNavigationType record);

    int updateByPrimaryKey(TbNavigationType record);
}