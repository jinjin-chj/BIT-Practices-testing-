package edu.bit.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.EDao;
import edu.bit.ex.dto.EDto;

public class EListCommand implements ECommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		EDao dao = new EDao();
		ArrayList<EDto> dtos = dao.list();
		request.setAttribute("list", dtos);

	}
}
