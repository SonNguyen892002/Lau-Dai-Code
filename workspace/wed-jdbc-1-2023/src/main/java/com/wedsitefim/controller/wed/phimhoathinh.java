package com.wedsitefim.controller.wed;

import java.io.IOException;

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

/**
 * Servlet implementation class phimmoi
 */
@WebServlet("/phimhoathinh")
public class phimhoathinh extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IFimService fimService;
	private ITheloaiService theloaiService; 
	
	public phimhoathinh() {
//		userfimService = new UserfimService();
		fimService = new FimService();	
		theloaiService = new TheloaiService();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TheloaiModel theloai = new TheloaiModel();
		theloai.setListResultTheloai(theloaiService.findAll());
		request.setAttribute("theloai", theloai);
		FimModel fims = new FimModel();
		String pageStr =  request.getParameter("page");
		String maxPageItemStr =  request.getParameter("maxPageItem");
		if (pageStr != null) {
			fims.setPage(Integer.parseInt(pageStr));
		} else {
			fims.setPage(1);
		}
		if (maxPageItemStr != null) {
			fims.setMaxPageItem(Integer.parseInt(maxPageItemStr));
		}
		Integer offset = ( fims.getPage() - 1 ) * fims.getMaxPageItem();
		fims.setListResultFim(fimService.findAll(offset, fims.getMaxPageItem()));
		fims.setTotalItem(fimService.getTotalItem());
		fims.setTotalPage((int) Math.ceil((double) fims.getTotalItem() / fims.getMaxPageItem()));
		request.setAttribute("fims", fims);
		RequestDispatcher rd = request.getRequestDispatcher("/decorators/wed/phimhoathinh.jsp");// trả về trang mong muốn
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
