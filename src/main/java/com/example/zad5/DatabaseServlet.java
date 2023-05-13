package com.example.zad5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "databaseServlet", value = "/databaseServlet")
public class DatabaseServlet extends HttpServlet {

    private final CarDao carDao = new CarDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carType = (String) request.getAttribute("carType");
        String sql = "SELECT id, carType, brand, model, productionYear, fuelConsumption FROM car where carType='" + carType + "'";
        List<Car> allCarsWithQuery = carDao.findAllWithQuery(sql);
        request.setAttribute("allCarsWithQuery", allCarsWithQuery);
        request.getRequestDispatcher("/responseServlet").forward(request, response);
    }
}
