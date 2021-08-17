package alumno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String dato1=request.getParameter("parametro1");
        String dato2=request.getParameter("parametro2");
        int parametro1int=Integer.parseInt(dato1);
        int parametro2int=Integer.parseInt(dato2);
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola mundo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Datos ingresados.</h1>");
            out.println("<h2>Dato uno:"+parametro1int+"</h1>");
            out.println("<h2>Dato dos:"+parametro2int+"</h1>");
            out.println("</body>");
            out.println("</html>");
    }
}
