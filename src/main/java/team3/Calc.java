package team3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.Console;
import java.io.IOException;


@WebServlet(name="Calc", urlPatterns="/Calc")
public class Calc extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rad1;
		Double result = new Double(0);
		
		rad1 = request.getParameter("rad");
		
		Double first_try;
		try {
			first_try=Double.parseDouble(rad1);
		}
		catch (NumberFormatException e) {
			first_try=0.0;
			rad1="0.0";
		}
		if (first_try < 0) {
			first_try=0.0;
		} else {}
		

		SquareCalculation radius = new SquareCalculation(first_try);
		result = radius.calculate(radius.getside1());

		request.setAttribute("rad", rad1);
		request.setAttribute("result", result);
		
 		
 		request.getRequestDispatcher("/Result.jsp").forward(request, response);
		
}
}