package xg.yxtk.mapper;

import org.apache.ibatis.annotations.Param;
import xg.yxtk.pojo.TbNavigationTypeItem;
import xg.yxtk.pojo.TbNavigationTypeItemExample;

import java.util.List;

public interface TbNavigationTypeItemMapper {
    int countByExample(TbNavigationTypeItemExample example);

    int deleteByExample(TbNavigationTypeItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbNavigationTypeItem record);

    int insertSelective(TbNavigationTypeItem record);

    List<TbNavigationTypeItem> selectByExample(TbNavigationTypeItemExample example);

    TbNavigationTypeItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbNavigationTypeItem record, @Param("example") TbNavigationTypeItemExample example);

    int updateByExample(@Param("record") TbNavigationTypeItem record, @Param("example") TbNavigationTypeItemExample example);

    int updateByPrimaryKeySelective(TbNavigationTypeItem record);

    int updateByPrimaryKey(TbNavigationTypeItem record);
}