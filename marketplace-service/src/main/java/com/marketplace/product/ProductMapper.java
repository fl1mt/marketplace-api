package com.marketplace.product;

import com.marketplace.product.ProductRequestDTO;
import com.marketplace.product.ProductResponseDTO;
import com.marketplace.product.ProductSnapshotDTO;
import com.marketplace.product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductRequestDTO requestDTO);
    ProductResponseDTO toResponseDTO(Product product);
    ProductSnapshotDTO toSnapshotDTO(Product product);
    void updateEntityFromDto(ProductRequestDTO dto, @MappingTarget Product product);
    List<ProductResponseDTO> toResponseDtoList(List<Product> products);
}
