package com.pnut.sso.controller;

import com.pnut.sso.rest.CasServerUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lch
 * @since 2018年11月29日 13:11:59
 */
@RestController
public class ProxyController {

    @RequestMapping("/getServiceUrl")
    public String getServiceUrl(String service) {
        String tgt = CasServerUtil.getTGT("admin", "test");
        System.out.println("TGT: " + tgt);
        String st = CasServerUtil.getST(tgt, service);
        System.out.println("ST：" + st);
        System.out.println(service + "?ticket=" + st);
        return service + "?ticket=" + st;
    }
}
