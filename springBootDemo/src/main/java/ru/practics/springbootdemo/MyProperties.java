package ru.practics.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("listener")
public class MyProperties {
    boolean flag;
}
