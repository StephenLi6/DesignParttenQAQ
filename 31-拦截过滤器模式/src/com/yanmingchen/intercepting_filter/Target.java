package com.yanmingchen.intercepting_filter;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:06 2018/6/15
 * @Description:目标类
 */
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }

}
