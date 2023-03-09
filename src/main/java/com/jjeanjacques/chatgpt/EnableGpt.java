package com.jjeanjacques.chatgpt;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@EnableFeignClients
@Target(ElementType.TYPE)
@ComponentScan(basePackages = {"com.jjeanjacques.chatgpt"})
public @interface EnableGpt {
}
