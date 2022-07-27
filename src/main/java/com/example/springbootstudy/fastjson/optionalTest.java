package com.example.springbootstudy.fastjson;


import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class optionalTest {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("haode ", "wode ");
        Map map2 = new HashMap();
        map2.put("aad", "wode");

        Map map3 = new HashMap();
        map3.put("wode", "hhaha");

        map1.put("wode", map2);
        map2.put("jajaj", map3);

        Optional.ofNullable(JSONObject.parseObject("")).map(o -> o.getJSONObject(""));
    }
}
