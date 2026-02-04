package com.marketplace.review;

import com.marketplace.user.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface ReviewMapper {
    Review toEntity(ReviewRequestDTO requestDTO);
    @Mapping(target = "userPublicDTO", source = "user")
    ReviewResponseDTO toResponseDTO(Review review);
    List<ReviewResponseDTO> toResponseDtoList(List<Review> reviews);
}
