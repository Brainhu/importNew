package com.importNew.redis;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by Brainhu on 2017/6/20.
 */
public class RedisCount {

    /*static  Map<String,String> resultMap = new HashMap<String, String>();
    public static void main(String smsPhone){
        String redisKey = "SMS_LIMIT_" + smsPhone;
        long count = redisTemplate.opsForValue().increment(redisKey, 1);
        if (count == 1) {
            //设置有效期一分钟
            redisTemplate.expire(redisKey, 60, TimeUnit.SECONDS);
        }
        if (count > 1) {
            resultMap.put("retCode", "-1");
            resultMap.put("retMsg", "每分钟只能发送一次短信");
            //outPrintJson(resultMap);
            return;
        }
        //发送短信
        //记录发送日志
    }*/

/*    private static byte[] LOCK = new byte[0];
    private static SMSendUtil smSendUtil;
    *//**
     * @Description：单例 （防并发）
     * @param：@return
     * @return：SMSendUtil
     * @throws：
     * @author：pengl
     * @Date：2016年8月17日 下午4:16:08
     *//*
    public static SMSendUtil getInstance(){
        if(smSendUtil != null)
            return smSendUtil;
        synchronized (LOCK) {
            if(smSendUtil == null)
                smSendUtil = new SMSendUtil();
        }
        return smSendUtil;
    }
    *//**
     * 发送登陆验证短信(使用全局锁synchronized避免并发请求)
     *//*
    public synchronized Map<String, Object> sendSms(String smsPhone) {
        *//** 查询最近一次发送时间 **//*
        *//** 一分钟时间限制判断 **//*
        *//** 发送短信 **//*
        *//** 记录发送日志 *//*
    }*/


    private static ConcurrentHashMap<Long, Byte[]> lockerStore = new ConcurrentHashMap<Long, Byte[]>();

    private static Object getPhoneNumberLock(long phone) {
        lockerStore.putIfAbsent(phone, new Byte[]{});
        Byte[] ret = lockerStore.get(phone);
        return ret;
    }
    /**
     * 发送登陆验证短信(使用号码颗粒级锁synchronized避免并发请求)
     */
//    public Map<String, Object> sendSms(String smsPhone,boolean flag) {
//        synchronized (getPhoneNumberLock(Long.parseLong(smsPhone))) {
//            /** 查询最近一次发送时间 **/
//            /** 一分钟时间限制判断 **/
//            /** 发送短信 **/
//            /** 记录发送日志 */
//        }
//    }
}
