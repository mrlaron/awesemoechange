package se.awesomoe.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("")
public class MainPage extends HttpServlet {


    private static final long serialVersionUID = 4371007148746993414L;

    public MainPage() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("mainpage");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter out = response.getWriter();

        response.setContentType("text/html");

        out.println("<html><body>");

        out.println("<h2> Change Management  6 </h2>");
        out.println("</body></html>");


        System.out.println("mainpage");

    }
}
