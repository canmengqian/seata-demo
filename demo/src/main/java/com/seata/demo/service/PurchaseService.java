package com.seata.demo.service;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className PurchaseService
 * @description 采购服务
 * @date 2023/2/28
 */
@Service
@Slf4j
public class PurchaseService {
    @Resource
    AmountService amountService;

    @GlobalTransactional
    public void puchase() {
        log.info("扣减账户余额");
        amountService.reduceAmount();
    }
}
