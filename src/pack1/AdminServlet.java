package pack1;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession(true);
		double prod_id = (double)request.getAttribute("prod_id");
		String prod_name = request.getParameter("prod_name");
		double quantity = (double) request.getAttribute("quantity");
		double price = (double) request.getAttribute("price");
		double store_price = (double)request.getAttribute("store_price");
		//HttpSession session = request.getSession();
		try {
			
			DBHelper.addDetails(prod_id, prod_name, quantity, price, store_price);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
		System.out.println("AdminServlet:doPost():" + " " + prod_name
				+ " " + prod_id + " " + price);
		System.out.println("AdminServlet:doPost():going to Register.jsp");

		rd.forward(request, response);
		return;
	}
}
	


