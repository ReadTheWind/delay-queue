package com.learn.queue.delayqueue.redis.core;

import java.io.Serializable;

/**
 * @Description: 延迟任务信息-延迟队列最小维度
 * @Author: lh
 * @Date: 2020/11/14 15:18
 **/
public class DelayQueueJob implements Serializable {

    /**
     * ID 任务唯一标识
     */
    private String jobId;

    /**
     * 任务类型（具体业务类型）
     */
    private String topic;

    /**
     * 任务的执行时间
     */
    private long delayTime;

    /**
     * 任务的执行超时时间
     */
    private long ttrTime;

    /**
     * job 信息 （JSON）
     */
    private String jobDetail;


    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(long delayTime) {
        this.delayTime = delayTime;
    }

    public long getTtrTime() {
        return ttrTime;
    }

    public void setTtrTime(long ttrTime) {
        this.ttrTime = ttrTime;
    }

    public String getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(String jobDetail) {
        this.jobDetail = jobDetail;
    }

    @Override
    public String toString() {
        return "DelayQueueJob{" +
                "jobId='" + jobId + '\'' +
                ", topic='" + topic + '\'' +
                ", delayTime=" + delayTime +
                ", ttrTime=" + ttrTime +
                ", jobDetail='" + jobDetail + '\'' +
                '}';
    }
}
