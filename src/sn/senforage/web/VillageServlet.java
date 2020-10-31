package sn.senforage.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.VillageDaoImpl;
import sn.senforage.domaine.Village;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet(urlPatterns = {"/addVillage", "/listVillage"})
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private VillageDaoImpl metierV;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		metierV = new VillageDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		if(path.equals("/addVillage")) {
			
			request.getRequestDispatcher("WEB-INF/views/village/add.jsp").forward(request, response);
		}
		else if(path.equals("/listVillage")) {

			request.setAttribute("villages", metierV.listAll());
			request.getRequestDispatcher("WEB-INF/views/village/list.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Village v = new Village();
		
		v.setNom(request.getParameter("nom"));
		v.setCommune(request.getParameter("commune"));
		v.setRegion(request.getParameter("region"));

		metierV.add(v);
		
		request.setAttribute("villages", metierV.listAll());
		request.getRequestDispatcher("WEB-INF/views/village/list.jsp").forward(request, response);
	}

}
