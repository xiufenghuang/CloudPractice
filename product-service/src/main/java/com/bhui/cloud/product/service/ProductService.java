package com.bhui.cloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bhui.cloud.api.pojo.query.ProductStockDeductQuery;
import com.bhui.cloud.product.entity.ProductDO;

/**
 * @author mqxu
 * @date 2024/9/20
 * @description ProductService
 **/
public interface ProductService extends IService<ProductDO> {

    /**
     * 减库存
     *
     * @param productStockDeductQuery 查询参数
     * @return int
     */
    int deduct(ProductStockDeductQuery productStockDeductQuery);

}
