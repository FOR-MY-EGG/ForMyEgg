package com.shinhan.formyegg.domain.account.entity;

import com.shinhan.formyegg.domain.account.dto.AccountDto;
import lombok.*;

import javax.persistence.*;

import com.shinhan.formyegg.domain.member.entity.Member;

@Entity(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", updatable = false)
    private Long accountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member memberId;

    @Column(name = "nickname", nullable = false, length = 45)
    private String nickname;

    @Column(name = "number", nullable = false, length = 45, unique = true)
    private String number;

    @Column(name = "balance", nullable = false)
    private Long balance;

    public static Account from(AccountDto accountDto){
        return Account.builder()
                .accountId(accountDto.getAccountId())
                .memberId(Member.from(accountDto.getMemberId()))
                .nickname(accountDto.getNickname())
                .balance(accountDto.getBalance())
                .number(accountDto.getNumber())
                .build();
    }

    public void updateNickname(String nickname) {
    }
}
