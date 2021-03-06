package com.foo.service.impl;

import com.foo.dao.EntityDao;

import javax.annotation.Resource;

/**
 * @author mixueqiang
 * @since Apr 24, 2014
 */
public abstract class BaseService {

  public static final long MINUTE = 60 * 1000L;
  public static final long HOUR = 60 * MINUTE;
  public static final long DAY = 24 * HOUR;

  @Resource
  protected EntityDao entityDao;

}
