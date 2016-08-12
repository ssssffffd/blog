package com.kp.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密工具类
 */
public class CryptographyUtil {

	
	/**
	 * Md5加密
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
}
