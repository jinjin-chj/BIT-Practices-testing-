package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {	// 게시판의 리스트 가져오는 것
	abstract void execute(HttpServletRequest request, HttpServletResponse response);
}
