package ipn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String valorparametro = request.getParameter("estructura");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>#T6 Etiquetas Estructurales.</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        if (valorparametro.equals("header")) {
            out.println("<center>");
            out.println("<header>");
            out.println("<div class=\"pos-f-t\">");
            out.println("<div class=\"collapse\" id=\"navbarToggleExternalContent\">");
            out.println("<div class=\"bg-dark p-4\">");
            out.println("<h5 class=\"text-white h4\">Collapsed content</h5>");
            out.println("<span class=\"text-muted\">Toggleable via the navbar brand.</span>");
            out.println("</div>");
            out.println("</div>");
            out.println("<nav class=\"navbar navbar-dark bg-primary\">");
            out.println("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarToggleExternalContent\" aria-controls=\"navbarToggleExternalContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
            out.println("<span class=\"navbar-toggler-icon\"></span>");
            out.println("</button>");
            out.println("</nav>");
            out.println("</div>");
            out.println("</header>");
            out.println("<header>");
            out.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-white\">");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"p-5 text-center bg-image\" style = \" background-image: url('https://mdbcdn.b-cdn.net/img/new/slides/041.jpg');height: 15rem; width: 100rem;\" >");
            out.println("<div class=\"mask\" style=\"background-color: rgba(0, 0, 0, 0.6)\">");
            out.println("<div class=\"d-flex justify-content-center align-items-center h-100\">");
            out.println("<div class=\"text-white\">");
            out.println("<h1 class=\"mb-3\">Heading</h1>");
            out.println("<h4 class=\"mb-3\">Subheading</h4>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</header>");
            out.println("<hr>");
            out.println("<h5>Header.</h5>");
            out.println("<p>El elemento de HTML Header representa un grupo de ayudas introductorias o de navegación.</p>");
            out.println("<p>Puede contener algunos elementos de encabezado, así como también un logo, un formulario de búsqueda, un nombre de autor y otros componentes.</p>");
            out.println("<hr>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</center>");
        }
        if (valorparametro.equals("nav")) {
            out.println("<center>");
            out.println("<header>");
            out.println("<hr>");
            out.println("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-primary\">");
            out.println("<a class=\"navbar-brand\" href=\"#\">Ejemplo de Navbar</a>");
            out.println("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo02\" aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
            out.println("<span class=\"navbar-toggler-icon\"></span>");
            out.println("</button>");
            out.println("<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">");
            out.println("<ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">");
            out.println("<li class=\"nav-item active\">");
            out.println("<a class=\"nav-link\" href=\"#\">Opción 1<span class=\"sr-only\"></span></a>");
            out.println("</li>");
            out.println("<li class=\"nav-item\">");
            out.println("<a class=\"nav-link\" href=\"#\">Opción 2</a>");
            out.println("</li>");
            out.println("<li class=\"nav-item\">");
            out.println("<a class=\"nav-link disabled\" href=\"#\">Opción desactivada</a>");
            out.println("</li>");
            out.println("</div>");
            out.println("<form class=\"form-inline my-2 my-lg-0\">");
            out.println("<input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar\">");
            out.println("</form>");
            out.println("</div>");
            out.println("</nav>");
            out.println("</header>");
            out.println("<hr>");
            out.println("<h5>Navbar.</h5>");
            out.println("<p>El elemento HTML nav representa una sección de una página cuyo propósito es proporcionar enlaces de navegación,</p>");
            out.println("<p>ya sea dentro del documento actual o a otros documentos. Ejemplos comunes de secciones de navegación son menús,tablas de contenido e índices.</p>");
            out.println("<hr>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</center>");
        }
        if (valorparametro.equals("article")) {
            out.println("<center>");
            out.println("<hr>");
            out.println("<hr>");
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-3 mb-2 bg-secondary text-white\">");
            out.println("<section>");///SECTION
            out.println("<hr>");
            out.println("<h4>section.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-primary text-white\">");
            out.println("<article>");///ARTICLE
            out.println("<hr>");
            out.println("<h4>article.</h4>");
            out.println("<hr>");
            out.println("<p align=\"justify\">");
            out.println("El elemento article es un contenedor de bloques de contenido que se consideran "
                    + "independientes del sitio web y pueden, por lo tanto, ser vistos, reutilizados y "
                    + "distribuidos por separado, como por ejemplo, en la sindicación. Puedes encontrar "
                    + "habitualmente a este elemento encerrando artículos, entradas de blogs o mensajes de un foro.\n" + "\n"
                    + "Cuando dos o más de estos elementos están anidados, se supone que el elemento article "
                    + "interior guarda relación con el elemento article que actúa como padre. "
                    + "Este podría ser el caso de una entrada de blog, "
                    + "donde cada comentario puede estar encerrado por un elemento article.");
            out.println("</p>");
            out.println("</article>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-secondary text-white\">");
            out.println("<aside>");///ASIDE
            out.println("<hr>");
            out.println("<h4>aside.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</aside>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<hr>");
            out.println("</center>");
        }
        if (valorparametro.equals("aside")) {
            out.println("<center>");
            out.println("<hr>");
            out.println("<hr>");
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-3 mb-2 bg-secondary text-white\">");
            out.println("<section>");///SECTION
            out.println("<hr>");
            out.println("<h4>section.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-secondary text-white\">");
            out.println("<article>");///ARTICLE
            out.println("<hr>");
            out.println("<h4>article.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</article>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-primary text-white\">");
            out.println("<aside>");///ASIDE
            out.println("<hr>");
            out.println("<h4>aside.</h4>");
            out.println("<hr>");
            out.println("<p align=\"justify\">");
            out.println("El elemento aside es un contenedor para información que se considera solo levemente "
                    + "relacionada al documento o la sección en la que es definida. En otras palabras, "
                    + "el contenido del elemento aside debe estar relacionado al contenido circundante,"
                    + " pero no ser completamente necesario para su comprensión.\n" + "\n"
                    + "El elemento aside puede ser típicamente encontrado alrededor de enlaces de blogrolls, "
                    + "enlaces al archivo, un glosario, una lista de tweets del autor, o notas, pensamientos"
                    + " o ideas que se le han ocurrido al autor durante la producción del documento.");
            out.println("</p>");
            out.println("</aside>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<hr>");
            out.println("</center>");
        }
        if (valorparametro.equals("section")) {
            out.println("<center>");
            out.println("<hr>");
            out.println("<hr>");
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-3 mb-2 bg-primary text-white\">");
            out.println("<section>");///SECTION
            out.println("<hr>");
            out.println("<h4>section.</h4>");
            out.println("<hr>");
            out.println("<p align=\"justify\">");
            out.println("El elemento section es un elemento de seccionamiento genérico, "
                    + "diseñado para contener una parte de un documento temáticamente definida."
                    + " Los contenidos de un elemento section son usualmente precedidos por un encabezado.\n" + "\n"
                    + "Los autores usualmente recurren al elemento section para dividir un documento "
                    + "extenso en capítulos, para separar las diferentes pestañas en un aplicación "
                    + "o para dividir temáticamente las secciones de un documento "
                    + "(sección de anuncios, sección de últimos artículos publicados, sección de vinculos relacionados, etc.).");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-secondary text-white\">");
            out.println("<article>");///ARTICLE
            out.println("<hr>");
            out.println("<h4>article.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</article>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-secondary text-white\">");
            out.println("<aside>");///ASIDE
            out.println("<hr>");
            out.println("<h4>aside.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</aside>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<hr>");
            out.println("</center>");
        }
        if (valorparametro.equals("footer")) {
            out.println("<center>");
            out.println("<hr>");
            out.println("<h4>header-nav.</h4>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("</p>");
            out.println("<hr>");
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm\">");
            out.println("<section>");///SECTION
            out.println("<hr>");
            out.println("<h4>section.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("<div class=\"col-sm\">");
            out.println("<article>");///ARTICLE
            out.println("<hr>");
            out.println("<h4>article.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</article>");
            out.println("</div>");
            out.println("<div class=\"col-sm\">");
            out.println("<aside>");///ASIDE
            out.println("<hr>");
            out.println("<h4>aside.</h4>");
            out.println("<hr>");
            out.println("<p align=\"center\">");
            out.println("Elemento no seleccionado.");
            out.println("<br>");
            out.println("<a href=\"index.html\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</aside>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<hr>");
            out.println("<footer class=\"p-3 mb-2 bg-dark text-white\">");////FOOTER
            out.println("<section>");
            out.println("<h5>footer</h5>");
            out.println("<p align=\"center\">");
            out.println("El Elemento HTML Footer representa un pie de página para el contenido,"
                    + "donde los autores habitualmente colocan firmas, información acerca del autor, "
                    + "información de licencias, documentos relacionados, etc. En muchos casos, "
                    + "los contenidos del pie de un documento son consistentes a lo largo de todo el sitio. © 2021 Copyright");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("</footer>");
            out.println("</center>");
        }
        if (valorparametro.equals("todos")) {
            out.println("<center>");
            out.println("<header>");
            out.println("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-primary\">");
            out.println("<a class=\"navbar-brand\" href=\"#\">Ejemplo de Navbar</a>");
            out.println("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo02\" aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
            out.println("<span class=\"navbar-toggler-icon\"></span>");
            out.println("</button>");
            out.println("<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">");
            out.println("<ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">");
            out.println("<li class=\"nav-item active\">");
            out.println("<a class=\"nav-link\" href=\"#\">Opción 1<span class=\"sr-only\"></span></a>");
            out.println("</li>");
            out.println("<li class=\"nav-item\">");
            out.println("<a class=\"nav-link\" href=\"#\">Opción 2</a>");
            out.println("</li>");
            out.println("<li class=\"nav-item\">");
            out.println("<a class=\"nav-link disabled\" href=\"#\">Opción desactivada</a>");
            out.println("</li>");
            out.println("</div>");
            out.println("<form class=\"form-inline my-2 my-lg-0\">");
            out.println("<input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar\">");
            out.println("</form>");
            out.println("</div>");
            out.println("</nav>");
            out.println("</header>");
            out.println("<header>");
            out.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-white\">");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"p-5 text-center bg-image\" style = \" background-image: url('https://mdbcdn.b-cdn.net/img/new/slides/041.jpg');height: 15rem; width: 100rem;\" >");
            out.println("<div class=\"mask\" style=\"background-color: rgba(0, 0, 0, 0.6)\">");
            out.println("<div class=\"d-flex justify-content-center align-items-center h-100\">");
            out.println("<div class=\"text-white\">");
            out.println("<h1 class=\"mb-3\">Heading</h1>");
            out.println("<h4 class=\"mb-3\">Subheading</h4>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</header>");
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-sm p-3 mb-2 bg-primary text-white\">");
            out.println("<section>");///SECTION
            out.println("<hr>");
            out.println("<h4>section.</h4>");
            out.println("<hr>");
            out.println("<p align=\"justify\">");
            out.println("El elemento section es un elemento de seccionamiento genérico, "
                    + "diseñado para contener una parte de un documento temáticamente definida."
                    + " Los contenidos de un elemento section son usualmente precedidos por un encabezado.\n" + "\n"
                    + "Los autores usualmente recurren al elemento section para dividir un documento "
                    + "extenso en capítulos, para separar las diferentes pestañas en un aplicación "
                    + "o para dividir temáticamente las secciones de un documento "
                    + "(sección de anuncios, sección de últimos artículos publicados, sección de vinculos relacionados, etc.).");
            out.println("<br>");
            out.println("<a href=\"index.html\" class=\"text-white bg-dark\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-primary text-white\">");
            out.println("<article>");///ARTICLE
            out.println("<hr>");
            out.println("<h4>article.</h4>");
            out.println("<hr>");
            out.println("<p align=\"justify\">");
            out.println("El elemento article es un contenedor de bloques de contenido que se consideran "
                    + "independientes del sitio web y pueden, por lo tanto, ser vistos, reutilizados y "
                    + "distribuidos por separado, como por ejemplo, en la sindicación. Puedes encontrar "
                    + "habitualmente a este elemento encerrando artículos, entradas de blogs o mensajes de un foro.\n" + "\n"
                    + "Cuando dos o más de estos elementos están anidados, se supone que el elemento article "
                    + "interior guarda relación con el elemento article que actúa como padre. "
                    + "Este podría ser el caso de una entrada de blog, "
                    + "donde cada comentario puede estar encerrado por un elemento article.");
            out.println("<br>");
            out.println("<a href=\"index.html\" class=\"text-white bg-dark\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</article>");
            out.println("</div>");
            out.println("<div class=\"col-sm p-3 mb-2 bg-primary text-white\">");
            out.println("<aside>");///ASIDE
            out.println("<hr>");
            out.println("<h4>aside.</h4>");
            out.println("<hr>");
            out.println("<p align=\"justify\">");
            out.println("El elemento aside es un contenedor para información que se considera solo levemente "
                    + "relacionada al documento o la sección en la que es definida. En otras palabras, "
                    + "el contenido del elemento aside debe estar relacionado al contenido circundante,"
                    + " pero no ser completamente necesario para su comprensión.\n" + "\n"
                    + "El elemento aside puede ser típicamente encontrado alrededor de enlaces de blogrolls, "
                    + "enlaces al archivo, un glosario, una lista de tweets del autor, o notas, pensamientos"
                    + " o ideas que se le han ocurrido al autor durante la producción del documento.");
            out.println("<br>");
            out.println("<a href=\"index.html\" class=\"text-white bg-dark\">Regresar a la pagina de inicio.</a>");
            out.println("</p>");
            out.println("</aside>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<hr>");
            out.println("<footer class=\"p-3 mb-2 bg-dark text-white\">");////FOOTER
            out.println("<section>");
            out.println("<h5>footer</h5>");
            out.println("<p align=\"center\">");
            out.println("El Elemento HTML Footer representa un pie de página para el contenido,"
                    + "donde los autores habitualmente colocan firmas, información acerca del autor, "
                    + "información de licencias, documentos relacionados, etc. En muchos casos, "
                    + "los contenidos del pie de un documento son consistentes a lo largo de todo el sitio. © 2021 Copyright");
            out.println("</p>");
            out.println("</section>");
            out.println("</div>");
            out.println("</footer>");
            out.println("</center>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
