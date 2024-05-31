package com.example.appliances.mapper;

import com.example.appliances.entity.Order;
import com.example.appliances.model.request.OrderRequest;
import com.example.appliances.model.response.OrderResponse;
import com.example.appliances.model.response.SimpleOrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {
                DefaultMapper.class,
                OrderItemMapper.class,
                UserMapper.class
        }
)
public interface OrderMapper {
    OrderResponse entityToResponse(Order entity);

    SimpleOrderResponse entityToResponseSimple(Order entity);

    Order requestToEntity(OrderRequest request);

    void update(@MappingTarget Order entity, OrderRequest request);
}