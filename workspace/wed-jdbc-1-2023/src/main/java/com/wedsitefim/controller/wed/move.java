package com.wedsitefim.controller.wed;

import java.io.IOException;

//import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wedsitefim.model.FimModel;
import com.wedsitefim.model.TheloaiModel;
import com.wedsitefim.service.IFimService;
import com.wedsitefim.service.ITheloaiService;
import com.wedsitefim.service.impl.FimService;
import com.wedsitefim.service.impl.TheloaiService;

@WebServlet(urlPatterns = {"/move-fim"})
public class move extends HttpServlet {

	private IFimService fimService;
	private ITheloaiService theloaiService; 
	
	public move() {
		fimService = new FimService();	
		theloaiService = new TheloaiService();
	}
	
	private static final long serialVersionUID = 1042388856279905486L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TheloaiModel theloai = new TheloaiModel();
		theloai.setListResultTheloai(theloaiService.findAll());
		request.setAttribute("theloai", theloai);
		FimModel fims = new FimModel();
		fims.setListResultFim(fimService.findAll());
		request.setAttribute("fims", fims);
		RequestDispatcher rd = request.getRequestDispatcher("/decorators/wed/move.jsp");// trả về trang mong muốn
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
