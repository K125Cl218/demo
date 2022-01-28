package fr.formation.inti.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.formation.inti.entity.Employee;
import fr.formation.inti.entity.User;
import fr.formation.inti.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		service = new UserService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30); // 30 secondes avant déconnexion auto
		Employee employee = null;
		User user = service.verifyLogin(login, password);
		if (user != null)
			employee = user.getEmployee();

		if (employee != null) {
			session.setAttribute("user", user);
			session.setAttribute("employee", employee);
			session.setAttribute("message", "you are connected");
			session.setAttribute("dateConnection", new Date());

			request.setAttribute("employee", employee);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
			dispatcher.forward(request, response);
		} else {
			session.invalidate();
			response.sendRedirect("index.jsp");
		}
	}

}
