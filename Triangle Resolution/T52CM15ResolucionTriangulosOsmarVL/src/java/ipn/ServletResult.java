package ipn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletResult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String valor =(String) session.getAttribute("claveatributo");
        String valora = request.getParameter("a");
        String valorb = request.getParameter("b");
        String valorc = request.getParameter("c");
        String valoralpha = request.getParameter("alpha");
        String valorbeta = request.getParameter("beta");
        String valorgama = request.getParameter("gama");
        String op= request.getParameter("operation");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tarea 5</title>");
        out.println("</head>");
        out.println("<body>");
        if (valor.equals("LLL")) {
            out.println("<center>");
            out.println("<h1>LLL</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/LLL.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("El Valor de a seleccionado es:"+valora);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de b seleccionado es:"+valorb);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de c seleccionado es:"+valorc);
            out.println("<br/>");
            double fa = Double.parseDouble(valora);
            double fb = Double.parseDouble(valorb);
            double fc = Double.parseDouble(valorc);
            double LLL;
            switch (op) {
                case "alpha":
                    LLL = Math.acos(((fb*fb)+(fc*fc)-(fa*fa))/(2*fb*fc));
                    out.println("<h4>Resultado de alpha:</h4>"+LLL);
                    break;
                case "beta":
                    LLL = Math.acos(((fa*fa)+(fc*fc)-(fb*fb))/(2*fa*fc));
                    out.println("<h4>Resultado de beta:</h4>"+LLL);
                    break;
                default:
                    LLL = Math.acos(((fa*fa)+(fb*fb)-(fc*fc))/(2*fa*fb));
                    out.println("<h4>Resultado de Gama:</h4>"+LLL);
                    break;
            }
            out.println("</center>");
        }
        if (valor.equals("LAL")) {
            out.println("<center>");
            out.println("<h1>LAL</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/LAL.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("El Valor de a:"+valora);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de b:"+valorb);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de gama:"+valorgama);
            out.println("<br/>");
            double fa = Double.parseDouble(valora);
            double fb = Double.parseDouble(valorb);
            double fgama = Double.parseDouble(valorgama);
            double LLL1;
            double LLL2;
            double LLL3;
            LLL1 = ((fa*fa)+(fb*fb)-(2*fa*fb*Math.cos(fgama)));
            LLL2 = Math.acos(((fb*fb)+(LLL1*LLL1)-(fa*fa))/(2*fb*LLL1));
            LLL3 = (180)-(LLL2)-(fgama);
            out.println("<h4>Resultado de c:</h4>"+LLL1);
            out.println("<h4>Resultado de Alpha:</h4>"+LLL2);
            out.println("<h4>Resultado de Betha:</h4>"+LLL3);       
            out.println("</center>");
        }
        if (valor.equals("LLA")) {
            out.println("<center>");
            out.println("<h1>LLA</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/LLA.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("El Valor de b:"+valorb);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de c:"+valorc);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de beta:"+valorbeta);
            out.println("<br/>");
            double fb = Double.parseDouble(valorb);
            double fc = Double.parseDouble(valorc);
            double fbeta = Double.parseDouble(valorbeta);
            double LLL1;
            double LLL2;
            double LLL3;
            LLL1 = Math.asin(((fc/fb))*(Math.sin(fb)));//gama
            LLL2 = (180)-(fbeta)-(LLL1);//alpha
            LLL3 = (fb)*((Math.sin(LLL1)/Math.sin(fbeta)));
            out.println("<h4>Resultado de Gama:</h4>"+LLL1);
            out.println("<h4>Resultado de Alpha:</h4>"+LLL2);
            out.println("<h4>Resultado de a:</h4>"+LLL3);
            out.println("</center>");
        }
        if (valor.equals("ALA")) {
            out.println("<center>");
            out.println("<h1>ALA</h1>");
            out.println("<hr>");
            out.println("<img src=\"/T52CM15ResolucionTriangulosOsmarVL/images/ALA.png\" width=\"150\" height=\"100\">");
            out.println("<hr>");
            out.println("El Valor de alpha:"+valoralpha);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de beta:"+valorbeta);
            out.println("<br/>");
            out.println("<br/>");
            out.println("El Valor de c:"+valorc);
            out.println("<br/>");
            out.println("<h4>Resultado:</h4>");
            double falpha = Double.parseDouble(valoralpha);
            double fbeta = Double.parseDouble(valorbeta);
            double fc = Double.parseDouble(valorc);
            double LLL1;
            double LLL2;
            double LLL3;
            LLL1 = (180)-(falpha)-(fbeta);
            LLL2 = (fc)*((Math.sin(falpha)/Math.sin(LLL1)));
            LLL3 = (fc)*((Math.sin(fbeta)/Math.sin(LLL1)));
            out.println("<h4>Resultado de Gama:</h4>"+LLL1);
            out.println("<h4>Resultado de b:</h4>"+LLL2);
            out.println("<h4>Resultado de a:</h4>"+LLL3);
            out.println("</center>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}