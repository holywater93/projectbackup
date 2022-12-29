package com.ezenb2.recipe.controller.action.members;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezenb2.recipe.controller.action.Action;
import com.ezenb2.recipe.dao.MemberDao;
import com.ezenb2.recipe.dto.MemberVO;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 전달된 파라미터들을 VO 객체에 넣고 insertMember메서드를 호출하세요
		
		MemberDao mdao= MemberDao.getInstance();
		MemberVO mvo= new MemberVO();
		
		
		
		

	}

}
