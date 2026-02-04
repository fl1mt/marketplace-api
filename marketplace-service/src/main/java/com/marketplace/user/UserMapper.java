package com.marketplace.user;

import com.marketplace.user.UserPublicDTO;
import com.marketplace.user.UserRequestDTO;
import com.marketplace.user.UserResponseDTO;
import com.marketplace.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDTO requestDTO);
    UserPublicDTO toPublicDTO(User user);
    UserResponseDTO toResponseDTO(User user);
}
