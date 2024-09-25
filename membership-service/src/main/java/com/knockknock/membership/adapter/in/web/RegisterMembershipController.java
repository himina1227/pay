package com.knockknock.membership.adapter.in.web;

import com.knockknock.membership.application.port.in.RegisterMemberhipUseCase;
import com.knockknock.membership.application.port.in.RegisterMembershipCommand;
import com.knockknock.membership.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    private final RegisterMemberhipUseCase registerMemberhipUseCase

    @PostMapping(path = "/membership/register")
    public void registerMembership(@RequestBody RegisterMembershipRequest request) {
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .isValid(true)
                .isCorp(request.isCorp())
                .build();

        registerMemberhipUseCase.registerMembership(command);
    }
}
