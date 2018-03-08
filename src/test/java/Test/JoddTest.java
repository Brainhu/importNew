package Test;

import jodd.datetime.JDateTime;
import jodd.datetime.Period;
import org.junit.Test;

/**
 * Created by biao.hu on 2017/9/11.
 */
public class JoddTest {

    @Test
    public void  testbegin(){
        JDateTime jdt = new JDateTime();            // 当前的日期以及时间
        jdt.getFormat();//获取格式化字符串，默认是 YYYY-MM-DD hh:mm:ss.mss
        jdt.setFormat("YYYY年MM月DD日 hh时mm分ss秒 mss毫秒");//设置格式化字符串
        System.out.println(jdt);                   //JDateTime重写了toString方法,使用了JdtFormatter来格式化输出字符串
        jdt = new JDateTime(2012, 12, 21);        // 2012年12月21日
        System.out.println(jdt.toString());
        jdt = new JDateTime(System.currentTimeMillis());    // 根据当前系统毫秒说来获取时间
        System.out.println(jdt.toString("MM/DD/YYYY hh:mm:ss mss"));//toString还有一个JdtFormat做完参数的方法，但是不太方便
        jdt = new JDateTime(2012, 12, 21, 11, 54, 22, 124); // 设置日期以及时、分、秒、毫秒
        System.out.println(jdt);
        jdt = new JDateTime("2012-12-21 11:54:22.124");     // 使用格式化字符串设置时间
        System.out.println(jdt);
        jdt = new JDateTime("12/21/2012", "MM/DD/YYYY");    // 使用自己定义的时间字符串设置时间
        System.out.println(jdt);
    }

    public void testSetup(){
        JDateTime jdt = new JDateTime();
        System.out.println(jdt);
        jdt.set(2012, 12, 21, 11, 54, 22, 124);  // 设置日期和时间
        System.out.println(jdt);
        jdt.set(2012, 12, 21);                   // 设置日期 这种方法会默认时间为零点
        System.out.println(jdt);
        jdt.setDate(2012, 12, 21);               // 另一种设置日期的方法 这种方法会默认时间为零点
        System.out.println(jdt);
        jdt.setCurrentTime();                    // 设置为当前日期和时间
        System.out.println(jdt);
        jdt.setYear(1973);                       // 改变年(也有单独改变月、日的方法，大家自己尝试)
        System.out.println(jdt);
        jdt.setHour(22);                         // 改变小时(也有单独改变分、毫秒的方法，大家自己尝试)
        System.out.println(jdt);
        jdt.setTime(18, 00, 12, 853);             // 设置时间
        System.out.println(jdt);
    }

    public void testCat(){
        JDateTime jdt=new JDateTime("2015-7-14");
        JDateTime jdtTow=new JDateTime("2016-7-14");
        Period period=new Period(jdt,jdtTow);
        System.out.println(period.getDays()); //获取两个时间中天数部分的差
        System.out.println(period.getHours()); //获取两个时间中小时部分的差（只包括显示部分而并不是总差的小时数）
        //System.out.println(period.getMilliseconds());//获取两个时间中毫秒部分的差（只包括显示部分而并不是总差的小时数）
        System.out.println(period.getMinutes());//获取两个时间中分钟部分的差（只包括显示部分而并不是总差的小时数）
        System.out.println(period.getSeconds());//获取两个时间中秒部分的差（只包括显示部分而并不是总差的小时数）

        JDateTime newjdt=new JDateTime("2015-7-14 14:23:53.123");
        JDateTime newjdtTow=new JDateTime("2016-7-14 16:10:22.23");
        Period newperiod=new Period(newjdt,newjdtTow);
        System.out.println(newperiod.getDays()); //获取两个时间中天数部分的差
        System.out.println(newperiod.getHours()); //获取两个时间中小时部分的差（只包括显示部分而并不是总差的小时数）
        //System.out.println(newperiod.getMilliseconds());//获取两个时间中毫秒部分的差（只包括显示部分而并不是总差的小时数）
        System.out.println(newperiod.getMinutes());//获取两个时间中分钟部分的差（只包括显示部分而并不是总差的小时数）
        System.out.println(newperiod.getSeconds());//获取两个时间中秒部分的差（只包括显示部分而并不是总差的小时数）
    }
}
