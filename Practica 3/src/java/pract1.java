import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/pract1"})
public class pract1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nombre = request.getParameter("nombre");
            String apellido= request.getParameter("apellido");
            String apellido2 = request.getParameter("apellido2");
            String fechanac = request.getParameter("fechanac");
            String correo = request.getParameter("correo");
            String pswd = request.getParameter("pswd");
        
            PrintWriter writer = response.getWriter();
            response.setContentType("text/html");
            
            writer.println("<html>");
            writer.println("<head><title> servlet </title></head>");
            writer.println("<h1 <P align=\"center\"> " + request.getContextPath() + "</h1>"); 
            writer.println("<body>");
            out.println( "  <P align=\"center\"> El nombre es: " + nombre  + apellido + apellido2 + "<br>" );
            out.println( " La fecha de nacimiento es " + fechanac  );
            out.println( "<br>El correo es " + correo  );
            out.println( "<br>La contraseña es " + pswd  );
            out.println("</body>");
            out.println("</html>"); 

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        processRequest(request, response);
    }   

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
