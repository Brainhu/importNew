package Test;


import com.common.util.RedisUtil;
import org.junit.Test;

/**
 * Created by Brainhu on 15/6/14.
 */

public class MainTest {

    @Test
    public void test(){/*
        //String s=args[0];
        //System.out.println("s= "+s);
        ELvis.getInstance().leaveTheBuilding();
        enumElvis.INSTANCE.leaveTheBuilding();
    */
        RedisUtil.set("name","biao.hu");
    }
}
