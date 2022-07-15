package com.epam.jconference.controller;

import com.epam.jconference.api.UserApi;
import com.epam.jconference.controller.assembler.UserAssembler;
import com.epam.jconference.controller.model.UserModel;
import com.epam.jconference.dto.UserDto;
import com.epam.jconference.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserServiceImpl userService;

    private final UserAssembler userAssembler;

    public UserModel create(UserDto userDto) {
        return userAssembler.toModel(userService.create(userDto));
    }

    public UserModel update(UserDto userDto) {
        return userAssembler.toModel(userService.update(userDto));
    }

    public UserModel getById(Long id) {
        return userAssembler.toModel(userService.getById(id));
    }

    public UserModel login(UserDto userDto) {
        return userAssembler.toModel(userService.login(userDto));
    }

    public ResponseEntity<Void> logout() {
        return userService.logout();
    }

    public UserModel profile() {
        return userAssembler.toModel(userService.profile());
    }
}
