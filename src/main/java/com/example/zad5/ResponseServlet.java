package com.example.zad5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "responseServlet", value = "/responseServlet")
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Car> allCarsWithQuery = (List<Car>) request.getAttribute("allCarsWithQuery");
        request.setAttribute("allCarsWithQuery", allCarsWithQuery);
        request.getRequestDispatcher("/cars.jsp").forward(request, response);

    }
}
