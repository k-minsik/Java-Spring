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
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
//        if (memoryMemberRepository가 이미 스프링 컨테이너에 등록) {
//          return 스프링 컨테이너에서 찾아서 반환;
//        } else { 스프링 컨테이너에 없으면
//            기존 로직을 호출해서 MemoryMemberRepository를 생성하고 스프링 컨테이너에 등록 return 반환
//        }
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
