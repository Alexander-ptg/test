package com.bb.util;

import com.bb.pojo.User;

public class UserThreadLocal {
	private static ThreadLocal<User> threadLocal = new ThreadLocal<>();
	public static void set(User user) {
		threadLocal.set(user);
	}
	public static User get() {
		return threadLocal.get();
	}
	//防止内存泄露
	public static void remove() {
		threadLocal.remove();
	}
}
