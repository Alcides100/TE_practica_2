package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ejercicio_4"})
public class ejercicio_4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_4</h1>");
            out.println("<h3>Juego de Dos Dados</h3>");
            out.println("<br><br>");
            out.println("<form action ='' method='post'>");
            out.println("Digite lanzar para jugar");
            out.println("<br>");
            out.println("<input type='submit' value='jugar'>");
            out.println("<br><br>");
            out.println("<a href=\"index.html\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int dado1=(int)(Math.random()*6)+1;
            int dado2=(int)(Math.random()*6)+1;
            int suma=dado1+dado2;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_4</h1>");
            out.println("<h3>Los Resultados son:</h3>");
            out.println("<br><br>");
            
            if(suma==7||suma==11){
                out.println("Felicidades has GANADO");
            }
            if(suma==2||suma==3||suma==4||suma==5||suma==6||suma==8||suma==9||suma==10||suma==12){
                out.println("Lo siento Perdiste....");
            }
            out.println("<br><br>");
            out.println("<a href=\"index.html\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        } 
    }
}
