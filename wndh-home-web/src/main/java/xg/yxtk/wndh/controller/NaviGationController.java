package xg.yxtk.wndh.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xg.yxtk.constant.Const;
import xg.yxtk.pojo.TbNavigationType;
import xg.yxtk.pojo.TbUser;
import xg.yxtk.service.navigation.NavaGationService;
import xg.yxtk.utils.CookieUtils;
import xg.yxtk.utils.XgResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * 用户登录注册 Controller
 *
 * @author xubin.
 * @create 2017-04-08
 */

@Controller
public class NaviGationController {


   /* @Reference(version = Const.WNDH_SSO_VERSION)
    private NavaGationService navaGationService;

*/

    /**
     * 显示注册页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String showRegister(Model model) {

    /*   model.addAttribute("uid", UUID.randomUUID().toString());
        XgResult resultType = navaGationService.loadAllNavagationType();
        //XgResult resultTypeItem = navaGationService.loadNavaItemByType("");
        //XgResult resultAddress = navaGationService.loadAddresssByNavaItem("");
        List<TbNavigationType> navigationTypes = (List<TbNavigationType>)resultType.getData();
        model.addAttribute("navigationTypes",navigationTypes);*/
        return "hometest";
    }



}
