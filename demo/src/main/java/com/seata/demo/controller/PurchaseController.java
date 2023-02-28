package com.seata.demo.controller;

import com.seata.demo.service.PurchaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className PurchaseController
 * @description TODO
 * @date 2023/2/28
 */
@RestController
@RequestMapping("test")
public class PurchaseController {
    @Resource
    PurchaseService purchaseService;

    @GetMapping("/purchase")
    public void purchase() {
        purchaseService.puchase();
    }
}
