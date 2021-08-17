package ipn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletOpe extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String valorparametro = request.getParameter("triangulo");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tarea 5</title>");
        out.println("</head>");
        out.println("<body>");
        if (valorparametro.equals("LLL")) {
            out.println("<center>");
            out.println("<h1>LLL</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/LLL.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("<form method=\"get\" action=\"ServletResult\">");
            out.println("Seleccione el angulo que desea calcular:");
            out.println("<select name=\"operation\">");
            out.println("<option value=\"alpha\">alpha</option>");
            out.println("<option value=\"beta\">beta</option>");
            out.println("<option value=\"gama\">gama</option>");
            out.println("</select>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de a:<input type=\"number\" name=\"a\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de b:<input type=\"number\" name=\"b\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de c:<input type=\"number\" name=\"c\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("<input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");
            out.println("</center>");
        }
        if (valorparametro.equals("LAL")) {
            out.println("<center>");
            out.println("<h1>LAL</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/LAL.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("<form method=\"get\" action=\"ServletResult\">");
            out.println("Llene el siguiente formulario para calcular C, Alpha y Beta:");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de a:<input type=\"number\" name=\"a\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de b:<input type=\"number\" name=\"b\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de gama:<input type=\"number\" name=\"gama\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("<input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");
            out.println("</center>");
        }
        if (valorparametro.equals("LLA")) {
            out.println("<center>");
            out.println("<h1>LLA</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/LLA.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("<form method=\"get\" action=\"ServletResult\">");
            out.println("Llene el siguiente formulario para calcular gama, alpha y a:");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de b:<input type=\"number\" name=\"b\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de c:<input type=\"number\" name=\"c\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de beta:<input type=\"number\" name=\"beta\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("<input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");
            out.println("</center>");
        }
        if (valorparametro.equals("ALA")) {
            out.println("<center>");
            out.println("<h1>ALA</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/ALA.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("<form method=\"get\" action=\"ServletResult\">");
            out.println("Llene el siguiente formulario para calcular b, a y gama:");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de alpha:<input type=\"number\" name=\"alpha\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de beta:<input type=\"number\" name=\"beta\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("Seleccione el Valor de c:<input type=\"number\" name=\"c\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
            out.println("<br/>");
            out.println("<br/>");
            out.println("<input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");
            out.println("</center>");
        }
        out.println("</body>");
        out.println("</html>");
        //response.sendRedirect("Servlet2?parametro="+valorparametro+"");
        HttpSession session = request.getSession();
        session.setAttribute("claveatributo", valorparametro);
    }
}