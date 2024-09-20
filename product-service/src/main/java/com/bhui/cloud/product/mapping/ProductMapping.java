package com.bhui.cloud.product.mapping;

import com.bhui.cloud.api.pojo.dto.ProductDTO;
import com.bhui.cloud.common.handler.BaseMapping;
import com.bhui.cloud.product.entity.ProductDO;
import org.mapstruct.Mapper;


/**
 * @author mqxu
 * @date 2024/9/20
 * @description ProductMapping
 **/
@Mapper(componentModel = "spring")
public interface ProductMapping extends BaseMapping<ProductDO, ProductDTO> {

}