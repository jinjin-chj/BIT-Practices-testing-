package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {	// �Խ����� ����Ʈ �������� ��
	abstract void execute(HttpServletRequest request, HttpServletResponse response);
}
