//package com.example.appliances.mapper;
//
//import com.example.appliances.entity.SaleItem;
//import com.example.appliances.entity.SaleStatus;
//import com.example.appliances.model.request.SaleItemNowRequest;
//import com.example.appliances.model.request.SaleItemRequest;
//import com.example.appliances.model.request.SaleRequest;
//import com.example.appliances.model.response.SaleItemResponse;
//import com.example.appliances.model.response.SaleResponse;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.MappingTarget;
//import org.mapstruct.NullValuePropertyMappingStrategy;
//
//@Mapper(
//        componentModel = "spring",
//        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
//        uses = {
//                DefaultMapper.class,
//                ClientMapper.class,
//                UserMapper.class,
////                SaleMapper.class,
//                SaleStatus.class,
//                ProductMapper.class
//        }
//)
//public interface SaleItemMapper {
//    SaleItemResponse entityToResponse(SaleItem entity);
////    @Mapping(target = "user", source = "userId", qualifiedByName = "setUser")
////    @Mapping(target = "sale", source = "saleId", qualifiedByName = "setSale")
////    @Mapping(target = "product", source = "productId", qualifiedByName = "setProduct")
//    @Mapping(target = "products", source = "productIds", qualifiedByName = "setProducts")
//    SaleItem requestToEntity(SaleItemRequest request);
//
//    @Mapping(target = "products", source = "productIds", qualifiedByName = "setProducts")
//    SaleItem requestTo(SaleItemNowRequest request);
//
//    void update(@MappingTarget SaleItem entity, SaleItemRequest request);
//}