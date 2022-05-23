package com.baidu.fsg.uid;

import com.baidu.fsg.uid.buffer.DefaultRejectedPutBufferHandler;
import com.baidu.fsg.uid.buffer.DefaultRejectedTakeBufferHandler;
import com.baidu.fsg.uid.impl.BitConfig;
import com.baidu.fsg.uid.impl.CachedUidGenerator;
import com.baidu.fsg.uid.worker.K8sPodWorkerIdAssigner;
import com.baidu.fsg.uid.worker.WorkerIdAssigner;

public class Main {

  public static void main(String[] args) throws Exception {
    final String epochStr = "2022-04-01";
    final WorkerIdAssigner workerIdAssigner = new K8sPodWorkerIdAssigner();
    final BitConfig bitConfig = new BitConfig(39, 16, 8,
            epochStr, 3,
            new DefaultRejectedPutBufferHandler(), new DefaultRejectedTakeBufferHandler(),
            10);
    final CachedUidGenerator uidGenerator = new CachedUidGenerator(workerIdAssigner, bitConfig);
    uidGenerator.afterPropertiesSet();
    for (int i = 0; i < 1000; i++) {
      System.out.println(uidGenerator.getUID());
    }

    uidGenerator.destroy();
  }

}
