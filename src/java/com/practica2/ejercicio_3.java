
package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio_3", urlPatterns = {"/ejercicio_3"})
public class ejercicio_3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_3</h1>");
            
            out.println("<form action='' method='post'>");
            out.println("Introduzca Primer Numero:");
            out.println("<input type='text' name='numeroA' required>");
            out.println("<br><br>");
            out.println("Introduzca Segundo Numero:");
            out.println("<input type='text' name='numeroB' required>");
            out.println("<br><br>");
            
            out.println("<select name='item'>");
             out.println("<option value='1'>Suma</option>");
             out.println("<option value='2'>Resta</option>");
             out.println("<option value='3'>Multiplicacion</option>");
             out.println("<option value='4'>Division</option>");
            out.println("</select>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<a href=\"index.html\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
        out.close();
        }
    }
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String numeroA=request.getParameter("numeroA");
        String numeroB=request.getParameter("numeroB");
        String item=request.getParameter("item");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
   
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El Resultado</h1>");
            if(numeroA!=null && numeroB!=null){
                switch(Integer.parseInt(item)){
                    case 1:
                        out.println("La Suma es:"+(Integer.parseInt(numeroA)+Integer.parseInt(numeroB)) );
                    break;
                    case 2:
                        out.println("La Resta es:"+(Integer.parseInt(numeroA)-Integer.parseInt(numeroB)) );
                    break;
                    case 3:
                        out.println("La Multiplicacion es:"+(Integer.parseInt(numeroA)*Integer.parseInt(numeroB)) );
                    break;
                    case 4:
                        out.println("La Division es:"+(Integer.parseInt(numeroA)/Integer.parseInt(numeroB)) );
                    break;
                }
            }
            else{
                out.println("Vuelva a introducir los numeros");
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
