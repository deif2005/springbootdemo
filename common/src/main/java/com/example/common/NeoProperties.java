package com.example.common;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author miou
 * @date 2018/8/6
 */
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;

    //省略getter settet方法
}
