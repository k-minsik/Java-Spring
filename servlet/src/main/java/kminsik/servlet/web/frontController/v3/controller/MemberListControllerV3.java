package kminsik.servlet.web.frontController.v3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kminsik.servlet.domain.member.Member;
import kminsik.servlet.domain.member.MemberRepository;
import kminsik.servlet.web.frontController.ModelView;
import kminsik.servlet.web.frontController.MyView;
import kminsik.servlet.web.frontController.v3.ControllerV3;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
