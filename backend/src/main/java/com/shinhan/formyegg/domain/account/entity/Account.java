package com.shinhan.formyegg.domain.account.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", updatable = false)
    private Long accountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member member;

    @Column(name = "nickname", nullable = false, length = 45)
    private String nickname;

    @Column(name = "number", nullable = false, length = 45)
    private String number;

    @Column(name = "balance", nullable = false)
    private Long balance;


}
