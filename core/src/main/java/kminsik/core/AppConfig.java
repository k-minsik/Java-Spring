package kminsik.core;

import kminsik.core.discount.DiscountPolicy;
import kminsik.core.discount.FixDiscountPolicy;
import kminsik.core.discount.RateDiscountPolicy;
import kminsik.core.member.MemberRepository;
import kminsik.core.member.MemberService;
import kminsik.core.member.MemberServiceImpl;
import kminsik.core.member.MemoryMemberRepository;
import kminsik.core.order.OrderService;
import kminsik.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
