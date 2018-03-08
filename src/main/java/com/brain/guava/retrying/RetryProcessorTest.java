package com.brain.guava.retrying;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import com.google.common.base.Predicates;

import lombok.extern.log4j.Log4j;

@Log4j
public class RetryProcessorTest {
	
    public static void main(String[] args){
    	Callable<Boolean> callable = new Callable<Boolean>() {
    		public Boolean call() throws Exception {
    			//log.info("不重试!");
    			//return true; // do something useful here
    			//log.error("先抛异常导致的重试!");
    			//throw new IOException();
    			log.info("返回false导致的重试");
				return false;
    		}
    	};
    	// 异常或者返回false都继续重试  
    	// 每秒重试一次  
    	// 最多重试5次  
    	// 允许添加多个RetryListener  
    	Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
    			.retryIfResult(Predicates.equalTo(false))
    			.retryIfRuntimeException()
                .withWaitStrategy(WaitStrategies.fixedWait(3, TimeUnit.SECONDS))  
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))  
                .withRetryListener(new EZRRetryListener<Object>())  
                //.withRetryListener(new EZRRetryListener<>())  
                .build();
/*    	final ResultBean result = new ResultBean();
		final Callable<ResultBean> callable = new Callable<ResultBean>() {
			public ResultBean call() throws Exception {
				result.setStatus(false);
				
				return result;
			}
		};
		Predicate<ResultBean> predicate1 = new Predicate<ResultBean>() {
            public boolean apply(ResultBean result) {
				return false;
            }
        };
		Retryer<ResultBean> retryer = RetryerBuilder.<ResultBean>newBuilder()
				.retryIfResult(predicate1)
				.retryIfRuntimeException()// 异常或者返回false都继续重试  
				.withWaitStrategy(WaitStrategies.fixedWait(1, TimeUnit.SECONDS))  // 每秒重试一次  
				.withStopStrategy(StopStrategies.stopAfterAttempt(3))  // 最多重试次数  
				.withRetryListener(new EZRRetryListener<ResultBean>())  // 允许添加多个RetryListener  
				.build();*/
		
    	try {
    	    retryer.call(callable);
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
}  
