package com.foo.service;

import com.foo.model.User;

/**
 * @author mixueqiang
 * @since Jul 1, 2016
 */
public interface SessionService {

  void destorySession(String sessionId);

  User signinWithCookie(String sessionId);

  User signinWithDeviceId(String deviceId);

  void storeSession(long userId, String sessionId);

}
