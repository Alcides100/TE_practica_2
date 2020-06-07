
package com.practica2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio_5", urlPatterns = {"/ejercicio_5"})
public class ejercicio_5 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_5</h1>");
            out.println("<h3>Matriz Caracol</h3>");
              out.println("<br>");
              out.println("<form action ='' method='post'>");
              out.println("Introduzca valor de N:");
              out.println("<input type='text' name='valor1' required>");
              out.println("<br><br>");
              out.println("Introduzca valor de X:");
              out.println("<input type='text' name='valor2' required>");
              out.println("<br>");
            
            out.println("<input type='submit' value='Generar'>");
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
        
        String valor1=request.getParameter("valor1");
        String valor2=request.getParameter("valor2");
        int n=Integer.parseInt(valor1);
        int x=Integer.parseInt(valor2);
        int [][]M= new int[n+1][n+1];
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejercicio_5</h1>");
            out.println("<h3>Matriz Caracol es:</h3>");
            out.println("<br>");
                if(n>=5){
                    for (int a = 1; a <= n / 2; a++) {
                       for (int i = a; i <= n - a; i++) {
                            M[a][i] = x;
                            x++;
                        }
                        for (int i = a; i <= n - a; i++) {
                            M[i][n - a + 1] = x;
                            x++;
                        }
                        for (int i = n - a + 1; i >= a + 1; i--) {
                            M[n - a + 1][i] = x;
                            x++;
                        }
                        for (int i = n - a + 1; i >= a + 1; i--) {
                        M[i][a] = x;
                        x++;
                        }
                    }
                    if (n % 2 == 1) {
                    M[n / 2 + 1][n / 2 + 1] = x;
                    }
                }
                else{
                  out.println("Vuelva a introducir los numeros");
                }
            for(int k=1; k<M.length;k++){
                for(int r=1;r<M[k].length;r++){
                    out.println(" \t |" +M[k][r]);
                }
                out.println("<br>");
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
