package com.fmr.c360;

import java.util.ArrayList;
import java.util.List;

public class Filler
{

  private List<String> myList = null;

  public List<String> getMyList()
  {
    return insertItems();
  }

  public List<String> insertItems()
  {

    // List<String> a1 = Collections.synchronizedList(new ArrayList<String>());
    myList = new ArrayList<String>();
    myList.add("one");
    myList.add("two");
    myList.add("three");
    return myList;
  }

  public void setMyList(final List<String> myList)
  {
    this.myList = myList;
  }

}
