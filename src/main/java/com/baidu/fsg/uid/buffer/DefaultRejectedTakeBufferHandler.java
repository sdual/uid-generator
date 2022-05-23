package com.baidu.fsg.uid.buffer;

public final class DefaultRejectedTakeBufferHandler implements RejectedTakeBufferHandler {

  @Override
  public void rejectTakeBuffer(RingBuffer ringBuffer) {
    System.out.println("`take` was rejected!!");
  }

}
