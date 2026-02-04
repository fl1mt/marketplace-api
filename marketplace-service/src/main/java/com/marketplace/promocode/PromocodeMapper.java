package com.marketplace.promocode;

import com.marketplace.product.ProductRequestDTO;
import com.marketplace.product.ProductResponseDTO;
import com.marketplace.product.Product;
import com.marketplace.promocode.Promocode;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PromocodeMapper {
    Promocode toEntity(ProductRequestDTO requestDTO);
    ProductResponseDTO toResponseDTO(Product product);
    List<ProductResponseDTO> toResponseDtoList(List<Product> products);
}
