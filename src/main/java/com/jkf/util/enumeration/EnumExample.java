package com.jkf.util.enumeration;

import com.jkf.util.enumeration.core.EnumBuilder;

/**
 * @author jkf
 * @date 2023-01-15 21:59:00
 * @description 生成枚举类的样例
 */
public class EnumExample {
    public static void main(String[] args) {
        stringExample();
//        integerExample();
//        longExample();
    }

    /**
     * 生成字符串枚举类
     */
    private static void stringExample() {
        EnumBuilder.stringBuilder()
                .enumConfig("test", "测试", "测试环境")
                .enumConfig("dev", "开发环境")
                .print("EnvironmentEnum", "环境枚举", "jkf");

    }

    public static void integerExample() {
        EnumBuilder.integerBuilder()
                .enumConfig("NORMAL", 1, "正常")
                .enumConfig("DELETE", -1, "删除")
                .print("StatusEnum", "用户状态枚举");
    }

    public static void longExample() {
        EnumBuilder.longBuilder()
                .enumConfig("OK", 1000L, "成功")
                .enumConfig("SYSTEM_ERROR", 5000L, "系统异常")
                .enumConfig("NETWORK_ERROR", 3000L, "网络异常")
                .print("ErrorCodeEnum", "错误码");
    }
}
