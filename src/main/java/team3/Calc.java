package team3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;

@WebServlet(name="Calc", urlPatterns="/Calc")
public class Calc extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		request.getRequestDispatcher("/Result.jsp").forward(request, response);	
	}
	private static class RequestCalc{
		private String radius;
		private double result;
		
		private RequestCalc(String first){
		this.radius=first;
		}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
					request.getParameter("rad"));	
		}
		
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			request.setAttribute("rad", radius);
			Double first_try;
			try {
				first_try=Double.parseDouble(radius);
			}
			catch (NumberFormatException e) {
				first_try=0.0;
			}
			if (first_try >= 0) {
				result=(first_try*first_try*Math.PI);
				request.setAttribute("result", result);
			} else {
				result = 0.0;
				request.setAttribute("result", result);
			}
			
		}
		
	}
	
}