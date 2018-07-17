package xg.yxtk.mapper;

import org.apache.ibatis.annotations.Param;
import xg.yxtk.pojo.TbNavigationAddress;
import xg.yxtk.pojo.TbNavigationAddressExample;

import java.util.List;

public interface TbNavigationAddressMapper {
    int countByExample(TbNavigationAddressExample example);

    int deleteByExample(TbNavigationAddressExample example);

    int deleteByPrimaryKey(String addrId);

    int insert(TbNavigationAddress record);

    int insertSelective(TbNavigationAddress record);

    List<TbNavigationAddress> selectByExample(TbNavigationAddressExample example);

    TbNavigationAddress selectByPrimaryKey(String addrId);

    int updateByExampleSelective(@Param("record") TbNavigationAddress record, @Param("example") TbNavigationAddressExample example);

    int updateByExample(@Param("record") TbNavigationAddress record, @Param("example") TbNavigationAddressExample example);

    int updateByPrimaryKeySelective(TbNavigationAddress record);

    int updateByPrimaryKey(TbNavigationAddress record);
}