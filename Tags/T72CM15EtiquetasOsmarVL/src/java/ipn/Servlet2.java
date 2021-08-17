package ipn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String valor = (String) session.getAttribute("claveatributo");
        String s1 = request.getParameter("area");
        String s2 = request.getParameter("article");
        String s3 = request.getParameter("audio");
        String s4 = request.getParameter("video");
        String s5 = request.getParameter("cite");
        String s6 = request.getParameter("command");
        String s7 = request.getParameter("div");
        String s8 = request.getParameter("embed");
        String s9 = request.getParameter("img");
        String sA = request.getParameter("menu");
        String sB = request.getParameter("object");
        String sC = request.getParameter("progress");
        String sD = request.getParameter("source");
        String sE = request.getParameter("textarea");
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
        if (valor.equals("area")) {
            int i1 = Integer.parseInt(s1);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas area seleccionadas: " + i1 + ".</h4>");
            out.println("<p>Haga clic en la computadora, el teléfono o la taza de café para regresar al index</p>");
            for (int i = 0; i < i1; i++) {
                out.println("<img src=\"/T72CM15EtiquetasOsmarVL/utilidades/workplace.jpg\" usemap=\"#workmap\" width=\"400\" height=\"379\">");
                out.println("<map name=\"workmap\">");
                out.println("<area shape=\"rect\" coords=\"34,44,270,350\" alt=\"Computer\" href=\"index.html\">");
                out.println("<area shape=\"rect\" coords=\"290,172,333,250\" alt=\"Phone\" href=\"index.html\">");
                out.println("<area shape=\"circle\" coords=\"337,300,44\" alt=\"Cup of coffee\" href=\"index.html\">");
                out.println("</map>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("article")) {
            int i2 = Integer.parseInt(s2);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas article seleccionadas:" + i2 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por article</p>");
            for (int i = 1; i <= i2; i++) {
                out.println("<article>");
                out.println("<h2>Boostrap Backgournd Color article"+i+"</h2>");
                out.println("<p>Similar to the contextual text color classes, easily set the background of an element to any contextual class. Anchor components will darken on hover, just like the text classes. Background utilities do not set color, so in some cases you’ll want to use .text-* utilities.</p>");
                out.println("</article>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("audio")) {
            int i3 = Integer.parseInt(s3);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas audio seleccionadas:" + i3 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por audio</p>");
            for (int i = 1; i <= i3; i++) {
                out.println("<audio controls autoplay>");
                out.println("<source src=\"a.ogg\" type=\"audio/ogg\">");
                out.println("<source src=\"b.mp3\" type=\"audio/mpeg\">");
                out.println("</audio>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("video")) {
            int i4 = Integer.parseInt(s4);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas video seleccionadas:" + i4 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por video</p>");
            for (int i = 1; i <= i4; i++) {
                out.println("<video width=\"400\" controls>");
                out.println("<source src=\"a.mp4\" type=\"video/mp4\">");
                out.println("<source src=\"b.ogg\" type=\"video/ogg\">");
                out.println("</video>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("cite")) {
            int i5 = Integer.parseInt(s5);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas cite seleccionadas:" + i5 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por cite, en la palabra Galileo.</p>");
            for (int i = 1; i <= i5; i++) {
                out.println("<p><cite>Galileo</cite> dijo: \"... y sin embargo, se mueve.\"</p>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("command")) {
            int i6 = Integer.parseInt(s6);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas command seleccionadas:" + i6 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por command, solo tiene soporte en el navegador internet explorer.</p>");
            for (int i = 1; i <= i6; i++) {
                out.println("<command type=\"command\" label=\"Save\" onclick=\"save()\">command</command>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("div")) {
            int i7 = Integer.parseInt(s7);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas div seleccionadas:" + i7 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por div</p>");
            for (int i = 1; i <= i7; i++) {
                out.println("<div class=\"p-3 mb-2 bg-success text-white\">");
                out.println("</div>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("embed")) {
            int i8 = Integer.parseInt(s8);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas embed seleccionadas:" + i8 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por embed</p>");
            for (int i = 1; i <= i8; i++) {
                
                out.println("<embed type=\"image/jpg\" src=\"/T72CM15EtiquetasOsmarVL/utilidades/workplace.jpg\" width=\"300\" height=\"200\">");        
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("img")) {
            int i9 = Integer.parseInt(s9);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas img seleccionadas:" + i9 + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por img</p>");
            for (int i = 1; i <= i9; i++) {
            
            out.println("<img src=\"/T72CM15EtiquetasOsmarVL/utilidades/workplace.jpg\" width=\"400\" height=\"379\">");
            
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("menu")) {
            int iA = Integer.parseInt(sA);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas menu seleccionadas:" + iA + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por menu</p>");
            for (int i = 1; i <= iA; i++) {
                out.println("<menu>");
                out.println("<li>primer elemento del menu "+i+"</li>");
                out.println("<li>segundo elemento del menu "+i+"</li>");
                out.println("<li>tercer elemento del menu "+i+"</li>");
                out.println(" </menu>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("object")) {
            int iB = Integer.parseInt(sB);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas object seleccionadas:" + iB + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por object.</p>");
            for (int i = 1; i <= iB; i++) {
                out.println("<object data='/T72CM15EtiquetasOsmarVL/utilidades/img_pink_flowers.jpg' width=\"300\" height=\"200\"></object>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("progress")) {
            int iC = Integer.parseInt(sC);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas progress seleccionadas:" + iC + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por progress, aumente la cantidad para que la barrita suba de porcentaje.</p>");
            for (int i = 1; i <= iC; i++) {
                out.println("Porcentaje="+i+"<progress id=\"file\" value="+i+" max=\"100\"> "+i+"% </progress>");
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("source")) {
            int iD = Integer.parseInt(sD);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas source seleccionadas:" + iD + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por source.</p>");
            for (int i = 1; i <= iD; i++) {
            out.println("<source media=\"(min-width:650px)\" srcset='/T72CM15EtiquetasOsmarVL/utilidades/img_pink_flowers.jpg'>");    
            out.println("<source media=\"(min-width:465px)\" srcset='/T72CM15EtiquetasOsmarVL/utilidades/img_white_flower.jpg'>");    
            out.println("<img src='/T72CM15EtiquetasOsmarVL/utilidades/img_orange_flowers.jpg' alt=\"Flowers\" style=\"width:auto;\">");    
            out.println("</picture>");    
            }
            out.println("<br>");
            out.println("<br>");
            out.println("</section>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
        }
        if (valor.equals("textarea")) {
            int iE = Integer.parseInt(sE);
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-8 mb-2 bg-primary text-white\">");
            out.println("<section>");
            out.println("<h4>Cantidad de etiquteas textarea seleccionadas:" + iE + "</h4>");
            out.println("<p>La siguiente estructura esta compuesta por textarea</p>");
            for (int i = 1; i <= iE; i++) {
                out.println("<textarea id=\"w3review\" name=\"w3review\" rows=\"4\" cols=\"50\">");
                out.println("texttarea.");
                out.println("</textarea>");
            }
            out.println("<br>");
            out.println("<br>");
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
    }
}