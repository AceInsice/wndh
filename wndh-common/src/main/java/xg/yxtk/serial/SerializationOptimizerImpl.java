package xg.yxtk.serial;



import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.alibaba.fastjson.JSONObject;
import xg.yxtk.pojo.TbUser;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(JSONObject.class);
        classes.add(TbUser.class);
        return classes;
    }
}
