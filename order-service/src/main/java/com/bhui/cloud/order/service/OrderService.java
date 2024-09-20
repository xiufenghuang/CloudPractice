package com.bhui.cloud.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bhui.cloud.api.pojo.dto.OrderDTO;
import com.bhui.cloud.api.pojo.query.OrderCreateQuery;
import com.bhui.cloud.order.entity.OrderDO;


/**
 * @author mqxu
 * @date 2024/9/20
 * @description OrderService
 **/
public interface OrderService extends IService<OrderDO> {
    /**
     * 下单
     * @param orderCreateQuery
     * @return
     */
    OrderDTO createOrder(OrderCreateQuery orderCreateQuery);
}