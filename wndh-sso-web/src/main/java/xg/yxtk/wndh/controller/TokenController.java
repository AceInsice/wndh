package xg.yxtk.wndh.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xg.yxtk.constant.Const;
import xg.yxtk.service.sso.UserService;
import xg.yxtk.utils.XgResult;


/**
 * 根据token查询用户信息Controller
 * <p>Title: TokenController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class TokenController {

	@Reference(version = Const.WNDH_SSO_VERSION)
	private UserService userService;
	
	/*@RequestMapping(value="/user/token/{token}", 
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE"application/json;charset=utf-8")
	@ResponseBody
	public String getUserByToken(@PathVariable String token, String callback) {
		XgResult result = tokenService.getUserByToken(token);
		//响应结果之前，判断是否为jsonp请求
		if (StringUtils.isNotBlank(callback)) {
			//把结果封装成一个js语句响应
			return callback + "(" + JsonUtils.objectToJson(result)  + ");";
		}
		return JsonUtils.objectToJson(result);
	}*/
	@RequestMapping(value="/user/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {
		XgResult result = userService.token(token,callback);
		return result;
	}
}
