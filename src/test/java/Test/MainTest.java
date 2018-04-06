package Test;


import com.brain.Singleton.ELvis;
import com.brain.Singleton.enumElvis;
import com.common.util.RedisUtil;
import com.importNew.Reflect.ClassUtil;

import org.junit.Test;

/**
 * Created by Brainhu on 15/6/14.
 */

public class MainTest {

	@Test
	public void SingletonTest() {
		ELvis.getInstance().leaveTheBuilding();
		enumElvis.INSTANCE.leaveTheBuilding();
		ClassUtil.printClassMethodMessage(enumElvis.INSTANCE);
	}
    @Test
    public void test(){
        String hello="hello";
        String lo= "lo";
        System.out.println(hello == "hello");
        System.out.println(hello == "hel"+lo);
        System.out.println(other.hello == hello);
        System.out.println(other.hello == ("hel"+lo).intern());

    }
    public class other{ public final static String hello = "hello";}
    @Test
    public void redisTest() {
    	RedisUtil.set("name","biao.hu");
    }
}
