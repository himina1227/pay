package com.knockknock.membership.application.port.in;

import com.knockknock.membership.common.UseCase;

@UseCase
public interface RegisterMemberhipUseCase {

    void registerMembership(RegisterMembershipCommand command);
}
