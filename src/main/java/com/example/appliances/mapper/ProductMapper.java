package com.example.appliances.mapper;

import com.example.appliances.entity.Permission;
import com.example.appliances.entity.Product;
import com.example.appliances.model.request.PermissionRequest;
import com.example.appliances.model.request.ProductRequest;
import com.example.appliances.model.response.PermissionResponse;
import com.example.appliances.model.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {
                DefaultMapper.class,
                ProductCategoryMapper.class
        }
)
public interface ProductMapper {
    ProductResponse entityToResponse(Product entity);
    @Mapping(target = "productCategory", source = "productCategoryId", qualifiedByName = "setProductCategory")

    Product requestToEntity(ProductRequest request);

    void update(@MappingTarget Product entity, ProductRequest request);
}