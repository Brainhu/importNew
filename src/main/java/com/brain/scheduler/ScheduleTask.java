package com.brain.scheduler;

/**
 * Created by biao.hu on 2017/10/11.
 */
/**
 * 任务定时执行管理器
 */
public interface ScheduleTask<T> {

    /**
     * 添加数据
     *
     * @param parameterObject
     */
    public void addData(final T parameterObject);

}
