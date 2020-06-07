
package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio_2", urlPatterns = {"/ejercicio_2"})
public class ejercicio_2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_2</h1>");
            out.println("<h3>Introduzca Monto </h3>");
            out.println("<br><br>");
            
            out.println("<form action ='' method='post'>");
            out.println("Monto:");
            out.println("<input type='number' name='monto' required>");
            out.println("<br>");
            out.println("<select name='item'>");
             out.println("<option value='1'>A Bolivianos</option>");
             out.println("<option value='2'>A Dolares</option>");
            out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='Calcular'>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<a href=\"index.html\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }finally{
             out.close();
         }
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String monto = request.getParameter("monto");
        String item = request.getParameter("item");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El monto calculado es:</h1>");
            if(monto!=null){
                switch(Integer.parseInt(item)){
                    case 1:
                        out.println("La Suma es:"+(Integer.parseInt(monto)*6.69) );
                    break;
                    case 2:
                        out.println("La Resta es:"+(Integer.parseInt(monto)/6.69) );
                    break;
                }
            }    
            else{
                out.println("Gracias por participar");
            }
            out.println("<br><br>");
            out.println("<a href=\"index.html\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
            }
    }
   
}
