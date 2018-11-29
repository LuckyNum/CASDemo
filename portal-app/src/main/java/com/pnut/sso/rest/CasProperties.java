package com.pnut.sso.rest;

/**
 * Cas 的一些配置项
 * @author lch
 * @since 2018年11月29日 10:10:21
 */
public class CasProperties {
    /**
     * CAS登录地址的token
     */
    public static String GET_TOKEN_URL = "http://cas.server.com:8888/cas/v1/tickets";

    /**
     * 设置Cookie的有效时长（1小时）
     */
    public static int COOKIE_VALID_TIME = 1 * 60 * 60;
}
