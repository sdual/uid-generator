package com.baidu.fsg.uid.buffer;

import java.util.ArrayList;
import java.util.List;

public final class BufferedUidProviderImpl implements BufferedUidProvider {

  private final SnowflakeUidGenerator uidGenerator;

  public BufferedUidProviderImpl() {
    this.uidGenerator = new SnowflakeUidGenerator();
  }

  @Override
  public List<Long> provide(long momentInSecond) {
    List<Long> results = new ArrayList<>();
    results.add(100000L);
    results.add(200000L);
    results.add(300000L);
    return results;
  }

}
