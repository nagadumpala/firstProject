package com.fmr.c360;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadTest implements Runnable
{

  public String modifyItem(final String item)
  {
    return item.concat("changed");

  }

  @Override
  public void run()
  {

    System.out.println("inside Thread" + Thread.currentThread().getName());

    List<String> a1;
    final List<String> a2 = null;

    final Filler filler = new Filler();
    a1 = filler.getMyList();
    System.out.println(a1);

    final CopyOnWriteArrayList<String> syncList = new CopyOnWriteArrayList<String>(a1);
    System.out.println(syncList);
    // final List<String> syncList = Collections.synchronizedList(a1);
    // synchronized (a1)

    for (final String item : syncList)
    {
      final String itemNew = modifyItem(item);
      syncList.remove("one");
      System.out.println("Hello FMR !" + itemNew);

    }
    System.out.println("synclist: " + syncList);
    System.out.println(a1);
  }
}
