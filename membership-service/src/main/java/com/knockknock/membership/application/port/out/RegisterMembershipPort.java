package com.knockknock.membership.application.port.out;

import com.knockknock.membership.adapter.out.persistence.MembershipJpaEntity;
import com.knockknock.membership.domain.Membership;

import java.lang.reflect.Member;

public interface RegisterMembershipPort {

    MembershipJpaEntity createMembership(
            Membership.MembershipName membershipName,
            Membership.MembershipEmail membershipEmail,
            Membership.MembershipAddress membershipAddress,
            Membership.MembershipIsValid membershipIsValid,
            Membership.MembershipIsCorp membershipIsCorp
    );
}
