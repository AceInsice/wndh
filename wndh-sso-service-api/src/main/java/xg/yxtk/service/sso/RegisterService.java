package xg.yxtk.service.sso;


import xg.yxtk.pojo.TbUser;
import xg.yxtk.utils.XgResult;


public interface RegisterService {

	XgResult checkData(String param, int type);
	XgResult register(TbUser user);
}
