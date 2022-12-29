package com.ezenb2.recipe.controller.action.members;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.shop.controller.action.Action;
import com.ezenac.shop.dao.MemberDao;
import com.ezenac.shop.dto.MemberVO;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ���޵� ���̵�� ��й�ȣ �޽��ϴ�.
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDao mdao =MemberDao.getInstance();
		MemberVO mvo=mdao.getMember(id);
		
		// getMemeber �޼��带 �����, ���ϻ�Ȳ�� �´� if���� �̿��ؼ� �α����� �����ϼ���
		// ���� �������� main.jsp�Դϴ�.
		
		String url="member/login.jsp";
		
		if(mvo==null) {
			request.setAttribute("message", "���� ���̵��Դϴ�");
		}else if(mvo.getPwd()==null) {
			request.setAttribute("message", "�ý��ۿ���. �����ڿ��� �����ϼ���");
		}else if(!mvo.getPwd().equals(pwd)) {
			request.setAttribute("message", "��й�ȣ�� Ʋ�Ⱦ��");
		}else if(mvo.getUseyn().equals("N")) {
			request.setAttribute("message", "�޸�����Դϴ�. ����Ʈ�� �̿��Ϸ��� �����ڿ��� �����ϼ���");
		}else if(mvo.getPwd().equals(pwd)) {
			HttpSession session =request.getSession();
			session.setAttribute("loginUser",mvo);
			url="shop.do?command=index";
		}else {
			request.setAttribute("message","��Ÿ�� ������ �α����� ���� �߾��. �����ڿ��� �����ϼ���");
		}
		
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
		

	}

}
