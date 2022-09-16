package com.sausage.api.dao;

public class Sausage {

  private final int id;
  private final String name;

  public Sausage(){}

  public Sausage(final int id, final String name)
  {
    this.id = id;
    this.name = name;
  }

  public int getId()
  {
    return this.id;
  }

  public void setId(final int id)
  {
    return this.id;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(final String name)
  {
    this.name = name;
  }

}
