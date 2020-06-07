
package com.practica2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio_1", urlPatterns = {"/ejercicio_1"})
public class ejercicio_1 extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lee Parametros Get</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_1</h1>");
            out.println("<h3>Introducir Datos por la URL</h3>");
            String nombre=request.getParameter("nombre");
            String correo=request.getParameter("correo");
            String telefono=request.getParameter("telefono");
            
            if(nombre!=null||correo!=null||telefono!=null){
                out.println("Su Nombre es:<strong>"+nombre+"</strong><br>");
                out.println("Su Correo es:<strong>"+correo+"</strong><br>");
                out.println("Su Telefono es:<strong>"+telefono+"</strong><br>");
            }
            else{
                out.println("Introduzca los parametros por la URL <br>");
                out.println("Ejemplo : ?nombre=Alcides&Correo=Alcides100@gmail.com&telefono=74767810");
            }
            out.println("<br><br>");
            out.println("<a href=\"index.html\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
        finally
        
        {
        out.close();
        }   
        
    }
    
}
