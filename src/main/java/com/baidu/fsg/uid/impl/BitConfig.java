package com.baidu.fsg.uid.impl;

import com.baidu.fsg.uid.buffer.RejectedPutBufferHandler;
import com.baidu.fsg.uid.buffer.RejectedTakeBufferHandler;

// TODO: fix indent. Use builder pattern.
public final class BitConfig {

  private final int timeBits;
  private final int workerBits;
  private final int seqBits;
  private final String epochStr;

  private final int boostPower;
  private final RejectedPutBufferHandler rejectedPutBufferHandler;
  private final RejectedTakeBufferHandler rejectedTakeBufferHandler;

  private final long scheduleInterval;

  public BitConfig(int timeBits, int workerBits, int seqBits,
                   String epochStr, int boostPower,
                   RejectedPutBufferHandler rejectedPutBufferHandler,
                   RejectedTakeBufferHandler rejectedTakeBufferHandler,
                   long scheduleInterval) {
    this.timeBits = timeBits;
    this.workerBits = workerBits;
    this.seqBits = seqBits;
    this.epochStr = epochStr;
    this.boostPower = boostPower;
    this.rejectedPutBufferHandler = rejectedPutBufferHandler;
    this.rejectedTakeBufferHandler = rejectedTakeBufferHandler;
    this.scheduleInterval = scheduleInterval;
  }

  public int getTimeBits() {
    return timeBits;
  }

  public int getWorkerBits() {
    return workerBits;
  }

  public int getSeqBits() {
    return seqBits;
  }

  public String getEpochStr() {
    return epochStr;
  }

  public int getBoostPower() {
    return boostPower;
  }

  public RejectedPutBufferHandler getRejectedPutBufferHandler() {
    return rejectedPutBufferHandler;
  }

  public RejectedTakeBufferHandler getRejectedTakeBufferHandler() {
    return rejectedTakeBufferHandler;
  }

  public long getScheduleInterval() {
    return scheduleInterval;
  }

}
