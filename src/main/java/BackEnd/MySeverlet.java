package BackEnd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BackEnd.Std;
import BackEnd.Crud;

@WebServlet("/mylogin")
public class MySeverlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		String add=request.getParameter("address");
		String Email=request.getParameter("email");
		String State=request.getParameter("state");
		
		
        Std s = new Std();
		
		s.setName(name);
		s.setId(id);
		s.setAdd(add);
		s.setEmail(Email);
		s.setState(State);
		
		Crud sc = new Crud();
		
           try {
        	   PrintWriter out = response.getWriter();
    		   int count=sc.SignUp(s);
        	   if (count!=0) {
    			   out.print("data saved sucessfully");
    		} else {
    			out.print("data not saved");
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
		}
	}
	
}