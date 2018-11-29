package com.pnut.sso.cas.config;

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

    /**
     * 设置Cookie的有效时长（1小时）
     */
    public static String COOKIE_NAME = "UToken";

    /**
     * 当前应用程序的baseUrl（注意最后面的斜线）
     */
    public static String SERVER_NAME = "http://app1.com:8181/";


    /**
     * App1 登出成功url
     */
    public static String APP_LOGOUT_PATH = SERVER_NAME + "user/logout/success";


    /**
     * CAS服务器地址
     */
    public static String CAS_SERVER_PATH = "http://cas.server.com:8888/cas";

    /**
     * CAS登陆服务器地址
     */
    public static String CAS_SERVER_LOGIN_PATH = "http://cas.server.com:8888/cas/login";

    /**
     * CAS登出服务器地址
     */
    public static String CAS_SERVER_LOGOUT_PATH = "http://cas.server.com:8888/cas/logout";
}