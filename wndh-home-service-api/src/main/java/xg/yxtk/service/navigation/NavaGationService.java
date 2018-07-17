package xg.yxtk.service.navigation;

import xg.yxtk.pojo.TbNavigationAddress;
import xg.yxtk.pojo.TbNavigationType;
import xg.yxtk.pojo.TbNavigationTypeItem;
import xg.yxtk.utils.XgResult;

public interface NavaGationService {
    /*
      加载所有导航类型
     */
    XgResult loadAllNavagationType();

    /*
     添加导航类型
    */
    XgResult addNavagationType(TbNavigationType navigationType);

    /*
     根据导航类型添加导航子类型
    */
    XgResult addNavagationTypeItem(String navaTypeId, TbNavigationTypeItem navigationTypeItem);

    /*
     根据导航子类型添加导航网址
    */
    XgResult addNavagationDddress(String itemId, TbNavigationAddress navigationAddress);

    /*
     根据导航类型加载导航子类型
    */
    XgResult loadNavaItemByType(String navaTypeId);

    /*
     根据导航子类型，加载网址
    */
    XgResult loadAddresssByNavaItem(String navaTypeItemId);
}
