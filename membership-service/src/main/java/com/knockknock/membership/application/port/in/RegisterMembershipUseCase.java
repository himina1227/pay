package com.knockknock.membership.application.port.in;

import com.knockknock.membership.common.UseCase;
import com.knockknock.membership.domain.Membership;

public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
