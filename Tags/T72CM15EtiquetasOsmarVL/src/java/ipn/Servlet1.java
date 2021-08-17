package ipn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String valorparametro = request.getParameter("data");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tarea 7</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<header>");
        out.println("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-primary\">");    
        out.println("<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">");
        out.println("<ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">");    
        out.println("<li class=\"nav-item active\">");        
        out.println("<a class=\"nav-link\" href=\"index.html\">Tarea #7 Etiquetas.<span class=\"sr-only\"></span></a>");
        out.println("</li>");
        out.println("</ul>");
        out.println("</div>");
        out.println("</nav>");
        out.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-white\">");    
        out.println("<div class=\"container-fluid\">");        
        out.println("<div class=\"p-5 text-center bg-image\" style = \" background-image: url('https://mdbcdn.b-cdn.net/img/new/slides/052.jpg');height: 15rem; width: 100rem;\" >");
        out.println("<div class=\"mask\" style=\"background-color: rgba(0, 0, 0, 0.6)\">");
        out.println("<div class=\"d-flex justify-content-center align-items-center h-100\">");
        out.println("<div class=\"text-white\">");
        out.println("<h1 class=\"mb-3\">Tarea #7 Etiquetas.</h1>");
        out.println("<h4 class=\"mb-3\"> Aplicación Web que presente dinámicamente el siguiente grupo de etiquetas:</h4>");
        out.println("<h4 class=\"mb-3\"> area, article, audio, video, cite, command, div, embed, img, menu, object, progress, source, textarea.</h4>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</nav>");
        out.println("</header>");
        if (valorparametro.equals("area")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>area.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"area\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("article")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>article.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"article\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("audio")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>audio.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"audio\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");
        }
        if (valorparametro.equals("video")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>video.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"video\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("cite")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>cite.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"cite\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("command")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>command.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"command\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("div")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>div.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"div\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("embed")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>embed.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"embed\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("img")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>img.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"img\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("menu")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>menu.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"menu\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("object")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>object.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"object\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("progress")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>progress.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"progress\" value=\"1\" min=\"1\" max=\"100\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("source")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>source.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"source\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        if (valorparametro.equals("textarea")) {
        out.println("<div class=\"container\">");    
        out.println("<div class=\"row\">");        
        out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");            
        out.println("<section>");
        out.println("<h4>textarea.</h4>");
        out.println("<p>Seleccione la cantidad que desea y presione el boton agregar:</p>");
        out.println("<br>");
        out.println("<article>");                    
        out.println("<form method=\"get\" action=\"Servlet2\">");
        out.println("cantidad:<input type=\"number\" name=\"textarea\" value=\"1\" min=\"1\" max=\"1000\" step=\"1\"/>");
        out.println("<br><br><br>");
        out.println("<input type=\"submit\" value=\"Agregrar\">");
        out.println("<br><br>");
        out.println("</form>");
        out.println("</article>");
        out.println("</section>");        
        out.println("</div>");    
        out.println("</div>");
        out.println("</div>");    
        }
        out.println("<footer class=\"p-2  bg-dark text-white\">");
        out.println("<section>");    
        out.println("<p align=\\\"center\\\"> Osmar Viorato Lozada © 2021.</p>");
        out.println("</section>");    
        out.println("</div>");    
        out.println("</footer>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        //response.sendRedirect("Servlet2?parametro="+valorparametro+"");
        HttpSession session = request.getSession();
        session.setAttribute("claveatributo", valorparametro);
    }
}