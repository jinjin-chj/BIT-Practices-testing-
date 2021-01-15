package edu.bit.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.BDao;
import edu.bit.ex.dto.BDto;

public class BListCommand implements BCommand {	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 이 세줄은 외워라.
		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list();	// db에 있는거 자바문법으로 객체로 가져옴
		request.setAttribute("list", dtos);	//리퀘스트 객체 안에 담음. "list"란 이름으로.
	// 뿌리는 건 BFrontController 로..
	}
}
