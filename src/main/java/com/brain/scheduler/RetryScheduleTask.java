package com.brain.scheduler;

/**
 * 任务定时执行管理器 包含重试任务
 *
 * @author prime7
 */
public interface RetryScheduleTask<T> extends ScheduleTask<T> {

    /**
     * 添加重试数据
     *
     * @param parameterObject
     */
    public void addRetryData(T parameterObject, int retryMode);

}
