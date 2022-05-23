package com.baidu.fsg.uid.buffer;

public final class DefaultRejectedPutBufferHandler implements RejectedPutBufferHandler {

  @Override
  public void rejectPutBuffer(RingBuffer ringBuffer, long uid) {
    System.out.println("`put` was rejected!!");
  }

}
