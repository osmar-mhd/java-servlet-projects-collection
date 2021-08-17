package user;

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
        String dato1=request.getParameter("ecu2x2-x1");
        String dato2=request.getParameter("ecu2x2-y1");
        String dato3=request.getParameter("ecu2x2-c1");
        String dato4=request.getParameter("ecu2x2-x2");
        String dato5=request.getParameter("ecu2x2-y2");
        String dato6=request.getParameter("ecu2x2-c3");
        int p1int=Integer.parseInt(dato1);
        int p2int=Integer.parseInt(dato2);
        int p3int=Integer.parseInt(dato3);
        int p4int=Integer.parseInt(dato4);
        int p5int=Integer.parseInt(dato5);
        int p6int=Integer.parseInt(dato6);
        int determinante = ((p1int)*(p5int))-((p2int)*(p4int));
        int detx = ((p3int)*(p5int))-((p2int)*(p6int));
        int dety = ((p1int)*(p6int))-((p3int)*(p4int));
        float X = ((detx)/(determinante));
        float Y = ((dety)/(determinante));
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola mundo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Solución:</h1>");
            out.println("<h4>Datos de la Ecuación 1:</h4>");
            out.println("<p>X = "+p1int+"</p>");
            out.println("<p>Y = "+p2int+"</p>");
            out.println("<p>Valor Independiente = "+p3int+"</p>");
            out.println("<h4>Datos de la Ecuación 2:</h4>");
            out.println("<p>X = "+p4int+"</p>");
            out.println("<p>Y = "+p5int+"</p>");
            out.println("<p>Valor Independiente = "+p6int+"</p>");
            out.println("<h4>Cálculos:</h4>");
            out.println("<p>*Determinante: "+determinante+" ;     Det en X: "+detx+" ;     *Det en Y: "+dety+"</p>");
            out.println("<h4>Resultados:</h4>");
            out.println("<p>X: "+X+"</p>");
            out.println("<p>Y: "+Y+"</p>");
            out.println("<a href='index.html'>Regresar al index</a>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
    }
}
