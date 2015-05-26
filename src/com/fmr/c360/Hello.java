package com.fmr.c360;

public class Hello
{

  public static void main(final String a[])
  {

    for (int i = 0; i < 1; i++)
    {
      new Thread(new ThreadTest()).start();
    }

  }

}
