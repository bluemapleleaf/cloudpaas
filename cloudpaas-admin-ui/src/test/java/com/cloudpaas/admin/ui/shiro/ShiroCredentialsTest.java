/**
 * 
 */
package com.cloudpaas.admin.ui.shiro;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author 大鱼
 *
 * @date 2019年8月15日 下午7:17:38
 */
public class ShiroCredentialsTest {
	
	public static void main(String[] args){
		//生成盐（部分，需要存入数据库中）
		//String random=new SecureRandomNumberGenerator().nextBytes().toHex();
		//将原始密码加盐（上面生成的盐），并且用md5算法加密二次，将最后结果存入数据库中
		//String result = new Md5Hash("password",random,2).toString();
		
		String hashAlgorithmName = "MD5";
        String credentials = "123456";
        int hashIterations = 2;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);
        System.out.println(obj);
		
	}

}
