package com.wedsitefim.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wedsitefim.model.FimModel;
import com.wedsitefim.model.TheloaiModel;
import com.wedsitefim.model.UserfimModel;
import com.wedsitefim.service.IFimService;
import com.wedsitefim.service.IUserfimService;
import com.wedsitefim.service.impl.FimService;
import com.wedsitefim.service.impl.UserfimService;

@WebServlet(urlPatterns = { "/admin-home"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1042388856279905486L;
	
	private IUserfimService userfimService;
	private IFimService fimService;
	
	public HomeController() {
		fimService = new FimService();	
		userfimService = new UserfimService();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserfimModel model = new UserfimModel();
		model.setListResult(userfimService.findAll());
		request.setAttribute("model", model);
		FimModel fims = new FimModel();
		fims.setListResultFim(fimService.findAll());
		request.setAttribute("fims", fims);
		RequestDispatcher rd = request.getRequestDispatcher("/common/admin/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
