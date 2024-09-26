package com.knockknock.membership.application.service;

import com.knockknock.membership.adapter.out.persistence.MembershipJpaEntity;
import com.knockknock.membership.adapter.out.persistence.MembershipMapper;
import com.knockknock.membership.application.port.in.RegisterMembershipUseCase;
import com.knockknock.membership.application.port.in.RegisterMembershipCommand;
import com.knockknock.membership.application.port.out.RegisterMembershipPort;
import com.knockknock.membership.common.UseCase;
import com.knockknock.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class RegisterMembershipService implements RegisterMembershipUseCase {

    private final RegisterMembershipPort registerMembershipPort;
    private final MembershipMapper membershipMapper;
    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        MembershipJpaEntity entity = registerMembershipPort.createMembership(
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipIsCorp(command.isCorp())
        );

        return membershipMapper.mapToDomainEntity(entity);
    }
}
