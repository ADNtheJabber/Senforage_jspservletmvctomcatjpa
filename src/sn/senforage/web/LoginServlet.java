package sn.senforage.web;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sn.senforage.dao.UserDaoImpl;
import sn.senforage.domaine.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		if(path.equals("/login")) {
			
			System.out.println("im in login servlet");
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			User user = null;
			UserDaoImpl logger = new UserDaoImpl();
			//verify if logger exists
			if(logger.getUser(username, password) != null) {
				user = logger.getUser(username, password);
				//init session
				HttpSession session = request.getSession();
				
				session.setAttribute("matricule", user.getMatricule());
				session.setAttribute("email", user.getEmail());
				session.setAttribute("role", user.getRole());
				//display welcome page
				
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
				
			}
			else {
				response.sendRedirect("login.jsp");
			}
		}
		
		
	}
}