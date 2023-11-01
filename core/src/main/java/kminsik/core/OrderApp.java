package kminsik.core;

import kminsik.core.member.Grade;
import kminsik.core.member.Member;
import kminsik.core.member.MemberService;
import kminsik.core.member.MemberServiceImpl;
import kminsik.core.order.Order;
import kminsik.core.order.OrderService;
import kminsik.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatedPrice = " + order.calculatedPrice());
    }
}
