package ope;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String b = request.getParameter("b");
        String h = request.getParameter("h");
        String l = request.getParameter("l");
        float fb = Float.parseFloat(b);
        float fh = Float.parseFloat(h);
        float fl = Float.parseFloat(l);
        float area = (fb) * (fh) * (fl);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
            out.println("<title>Resultados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Area de Balastra.</h1>");
            out.println("<p>Datos ingresados:</p>");
            out.println("<table class=\"table table-hover table-dark\" style=\"width: 25%; height: 25%;\">");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td>B:</td>");
            out.println("<td>"+ b +"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>H:</td>");
            out.println("<td>"+ h +"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>L:</td>");
            out.println("<td>"+ l +"</td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("</table>");
            out.println("<p>Resultados:</p>");
            out.println("<table class=\"table table-hover table-dark\" style=\"width: 25%; height: 25%;\">");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td>Area:</td>");
            out.println("<td>"+ area +"</td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
