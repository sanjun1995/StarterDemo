package com.example.starterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    /**
     * 文档扫描包路径
     */
    private String basePackage = "";

    /**
     * title 示例: 订单创建接口
     */
    private String title = "平台系统接口详情";

    /**
     * 服务条款网址
     */
    private String termsOfServiceUrl = "https://www.xxxx.com/";

    /**
     * 版本号
     */
    private String version = "V_1.0.0";

}