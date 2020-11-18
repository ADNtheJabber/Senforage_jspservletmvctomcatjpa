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
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		if(path.equals("/login")) {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			boolean isAuth;
			User user = null;
			UserDaoImpl logger = new UserDaoImpl();
			
			//verify if logger exists
			isAuth = logger.verifyUser(username, password);
			if(isAuth) {
							
				user = logger.getUser(username);
				
				//init session
				HttpSession session = request.getSession();
				
				session.setAttribute("isAuth", isAuth);
				session.setAttribute("username", user.getUsername());
				session.setAttribute("password", user.getPassword());
				session.setAttribute("matricule", user.getMatricule());
				session.setAttribute("email", user.getEmail());
				session.setAttribute("role", user.getRole());
				
				//display welcome page
				response.sendRedirect("/SenForage/Welcome");
			}
			else {
				
				response.sendError(1, "error");
				request.getRequestDispatcher("/welcome/login.jsp").forward(request, response);
			}
		}
		
		
	}
}