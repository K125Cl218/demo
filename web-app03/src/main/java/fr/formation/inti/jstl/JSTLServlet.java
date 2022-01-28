package fr.formation.inti.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.inti.entity.Employee;

/**
 * Servlet implementation class JSTLServlet
 */
@WebServlet("/core")
public class JSTLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSTLServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jstl = request.getParameter("c");
		String path = "login.jsp";
		List<Employee> list = new ArrayList<Employee>();
		Employee emp = null;
		
		for (int i = 0; i < 10; i++) {
			emp = new Employee();
			emp.setFirstName("firstName"+i);
			emp.setLastName("lastName"+i);
			emp.setTitle("title"+i);
			list.add(emp);
		}
		request.setAttribute("list", list);
		
		if (jstl == null) {
			jstl = "index";
		}
		
		switch (jstl) {
		case "if":
			path = "jstl_if.jsp";
			break;

		case "forEach":
			path = "jstl_forEach.jsp";
			break;
			
		case "choose":
			path = "jstl_choose.jsp";
			break;
			
		case "set":
			path = "jstl_set.jsp";
			break;
		default:
			path = "index.jsp";
			break;
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
