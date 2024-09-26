package com.knockknock.membership.adapter.out.persistence;

import com.knockknock.membership.domain.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<MembershipJpaEntity, Long> {
}
