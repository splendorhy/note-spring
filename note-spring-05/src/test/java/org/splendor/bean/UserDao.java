package org.splendor.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author splendor.s
 * @create 2022/11/10 上午11:40
 * @description
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "splendor");
        hashMap.put("10002", "yanfa");
        hashMap.put("10003", "test");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
