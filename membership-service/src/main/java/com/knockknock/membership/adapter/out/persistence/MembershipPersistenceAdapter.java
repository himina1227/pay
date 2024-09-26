package com.knockknock.membership.adapter.out.persistence;

import com.knockknock.membership.application.port.out.RegisterMembershipPort;
import com.knockknock.membership.common.PersistenceAdapter;
import com.knockknock.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort {

    private final MembershipRepository membershipRepository;
    @Override
    public MembershipJpaEntity createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        return membershipRepository.save(new MembershipJpaEntity(
                membershipName.getMembershipName(),
                membershipEmail.getMembershipEmail(),
                membershipAddress.getMembershipAddress(),
                membershipIsValid.isMembershipIsValid(),
                membershipIsCorp.isMembershipIsCorp()
        ));
    }
}
