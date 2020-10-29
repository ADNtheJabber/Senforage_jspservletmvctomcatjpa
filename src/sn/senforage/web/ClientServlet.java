package sn.senforage.web;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.ClientDaoImpl;
import sn.senforage.dao.IClient;
import sn.senforage.domaine.Client;
import sn.senforage.domaine.Village;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet(urlPatterns = {"/addClient", "/listClient"})
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClientDaoImpl metierC;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		metierC = new ClientDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		if(path.equals("/addClient")) {
			
			request.getRequestDispatcher("WEB-INF/views/client/add.jsp").forward(request, response);
		}
		else if(path.equals("/listClient")) {

			List<Client> clients = metierC.listAll();
			request.setAttribute("clients", clients);
			request.getRequestDispatcher("WEB-INF/views/client/list.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client c = new Client();
		
		//String nom = request.getParameter("nom");
//		String prenom = request.getParameter("prenom");
//		String dateNaiss = request.getParameter("dateNaissance");
//		String lieuNaiss = request.getParameter("lieuNaissance");
//		String email = request.getParameter("email");
//		String tel = request.getParameter("tel");
//		String cni = request.getParameter("cni");
//		String village_id = request.getParameter("village");
		
		c.setNom(request.getParameter("nom"));
		c.setPrenom(request.getParameter("prenom"));
		c.setDateNaiss(request.getParameter("dateNaissance"));
		c.setLieuNaiss(request.getParameter("lieuNaissance"));
		c.setCni(request.getParameter("cni"));
		c.setEmail(request.getParameter("email"));
		c.setCni(request.getParameter("cni"));
		c.setTel(request.getParameter("tel"));
		c.setVillage(request.getParameter("village"));

		
	}

}
