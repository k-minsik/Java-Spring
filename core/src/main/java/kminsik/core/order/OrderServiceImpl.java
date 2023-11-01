package kminsik.core.order;

import kminsik.core.discount.DiscountPolicy;
import kminsik.core.discount.FixDiscountPolicy;
import kminsik.core.member.Member;
import kminsik.core.member.MemberRepository;
import kminsik.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
