package xg.yxtk.service.sso;


import xg.yxtk.utils.XgResult;

/**
 * 根据token查询用户信息
 * <p>Title: TokenService</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
public interface TokenService {

	XgResult getUserByToken(String token);
}
