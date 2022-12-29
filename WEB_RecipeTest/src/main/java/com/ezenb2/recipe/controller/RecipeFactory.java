package com.ezenb2.recipe.controller;

import com.ezenb2.recipe.controller.action.Action;
import com.ezenb2.recipe.controller.action.IndexAction;
import com.ezenb2.recipe.controller.action.admin.AdminAction;
import com.ezenb2.recipe.controller.action.admin.AdminMemListAction;
import com.ezenb2.recipe.controller.action.admin.AdminQnaListAction;
import com.ezenb2.recipe.controller.action.admin.AdminRecipeListAction;
import com.ezenb2.recipe.controller.action.admin.AdminReplyListAction;
import com.ezenb2.recipe.controller.action.members.ContractAction;
import com.ezenb2.recipe.controller.action.members.JoinAction;
import com.ezenb2.recipe.controller.action.members.JoinFormAction;

public class RecipeFactory {

	private RecipeFactory() {}
	private static RecipeFactory rf = new RecipeFactory();
	public static RecipeFactory getInstance() { return rf; }
	
	public Action getAction(String command) {
		Action ac = null;
		
		if( command.equals("index") ) ac = new IndexAction();
		else if( command.equals("admin") ) ac = new AdminAction();
		else if( command.equals("adminRecipeList") ) ac = new AdminRecipeListAction();
		else if( command.equals("adminMemList") ) ac = new AdminMemListAction();
		else if( command.equals("adminReplyList") ) ac = new AdminReplyListAction();
		else if( command.equals("adminQnaList") ) ac = new AdminQnaListAction();
//		-------------join---
		else if( command.equals("contract")) ac = new ContractAction();
		else if( command.equals("joinForm")) ac = new JoinFormAction();
		else if( command.equals("join")) ac =new JoinAction();
		else if( command.equals("findZipNum")) ac = new FindZipNumAction(); 
		
		
		
		return ac;
	}
	
	
}