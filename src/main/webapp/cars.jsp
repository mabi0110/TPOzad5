<%@ page import="com.example.zad5.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aplikacja samochodowa</title>
</head>
<body>
<table border="2">
    <caption>Szczegółowe informacje dot. samochodów</caption>
    <thead>
    <tr>
        <th>Typ</th>
        <th>Marka</th>
        <th>Model</th>
        <th>Rocznik</th>
        <th>Spalanie</th>
    </tr>
    </thead>
    <tbody>
<%
    List<Car> allCarsWithQuery = (List<Car>) request.getAttribute("allCarsWithQuery");
    for (Car car : allCarsWithQuery) {
        String type = car.getType();
        String brand = car.getBrand();
        String model = car.getModel();
        Integer year = car.getYear();
        Double fuelConsumption = car.getFuelConsumption();
%>
<h2>
<%--    <%=String.format("%s %s %s %s %d %.2f", id, type, brand, model, year, fuelConsumption)%>--%>
    <tr>
        <td><%=type%></td>
        <td><%=brand%></td>
        <td><%=model%></td>
        <td><%=year%></td>
        <td><%=fuelConsumption%></td>
    </tr>
</h2>

<%
    }
%>
    </tbody>
</table>
</body>
</html>