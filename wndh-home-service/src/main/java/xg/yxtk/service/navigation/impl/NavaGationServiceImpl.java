package xg.yxtk.service.navigation.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import xg.yxtk.mapper.TbNavigationAddressMapper;
import xg.yxtk.mapper.TbNavigationTypeItemMapper;
import xg.yxtk.mapper.TbNavigationTypeMapper;
import xg.yxtk.pojo.*;
import xg.yxtk.service.navigation.NavaGationService;
import xg.yxtk.utils.XgResult;

import java.util.Date;
import java.util.List;

public class NavaGationServiceImpl implements NavaGationService {
    @Autowired
    private TbNavigationTypeMapper navigationTypeMapper;
    @Autowired
    private TbNavigationTypeItemMapper navigationTypeItemMapper;
    @Autowired
    private TbNavigationAddressMapper navigationAddressMapper;
    @Override
    public XgResult loadAllNavagationType() {
        TbNavigationTypeExample tbNavigationTypeExample = new TbNavigationTypeExample();
        //TbNavigationTypeExample.Criteria criteria = tbNavigationTypeExample.createCriteria();
        List<TbNavigationType> list = navigationTypeMapper.selectByExample(tbNavigationTypeExample);
        return XgResult.ok(list);
    }

    @Override
    public XgResult addNavagationType(TbNavigationType navigationType) {

       int result =  navigationTypeMapper.insert(navigationType);
       return XgResult.build(result,"");
    }

    @Override
    public XgResult addNavagationTypeItem(String navaTypeId, TbNavigationTypeItem navigationTypeItem) {
        return null;
    }

    @Override
    public XgResult addNavagationDddress(String itemId, TbNavigationAddress navigationAddress) {
        return null;
    }

    @Override
    public XgResult loadNavaItemByType(String navaTypeId) {
        return null;
    }

    @Override
    public XgResult loadAddresssByNavaItem(String navaTypeItemId) {
        return null;
    }
}
