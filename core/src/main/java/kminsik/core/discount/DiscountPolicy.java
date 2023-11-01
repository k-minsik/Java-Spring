package kminsik.core.discount;

import kminsik.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
