package com.example.zad5;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "requestServlet", value = "/requestServlet")
public class RequestServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String carType = request.getParameter("carType");
        request.setAttribute("carType", carType);
        request.getRequestDispatcher("/databaseServlet").forward(request, response);
    }

}