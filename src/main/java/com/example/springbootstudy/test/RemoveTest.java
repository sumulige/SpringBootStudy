package com.example.springbootstudy.test;

import com.google.common.collect.Lists;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@Transactional
public class RemoveTest {
    public static void main(String[] args) {
        List<String> strings = Lists.newArrayList("1", "2", "3");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("3")) {
                strings.remove("2");
            }
        }

//        while(iterator.hasNext()){
//            String s = iterator.next();
//            if(s.equals("3")){
//                iterator.remove();
//            }
//        }
    }
}
