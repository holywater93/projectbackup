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
		
		// ���޵� �Ķ���͵��� VO ��ü�� �ְ� insertMember�޼��带 ȣ���ϼ���
		
		MemberDao mdao= MemberDao.getInstance();
		MemberVO mvo= new MemberVO();
		
		
		
		

	}

}
