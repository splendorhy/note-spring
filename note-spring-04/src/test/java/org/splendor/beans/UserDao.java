package org.splendor.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * @author splendor.s
 * @create 2022/10/20 上午10:51
 * @description
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "splendor_10001");
        hashMap.put("10002", "splendor_10002");
        hashMap.put("10003", "splendor_10003");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
