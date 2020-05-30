package com.employee.app.Member.domain;

import java.util.Arrays;

public class Fixture {

    private Fixture() {
    }

    public static Member member1 = Member
            .builder()
            .id(new Id("000"))
            .name(new Name("홍길동"))
            .email(new Email("test@test.com"))
            .rank(Rank.LEADER)
            .build();

    public static Member member2 = Member
            .builder()
            .id(new Id("001"))
            .name(new Name("김유정"))
            .email(new Email("test@test.com"))
            .rank(Rank.STAFF)
            .build();

    public static Member member3 = Member
            .builder()
            .id(new Id("002"))
            .name(new Name("박보검"))
            .email(new Email("test@test.com"))
            .rank(Rank.PROFESSIONAL)
            .build();

    public static Members twoMembers() {
        return new Members(Arrays.asList(member1, member2));
    }

}
