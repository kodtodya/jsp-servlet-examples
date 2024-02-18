package com.kodtodya.practice.web.servlet.controller;

import com.kodtodya.practice.web.servlet.model.Bike;
import com.kodtodya.practice.web.servlet.service.BikeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class BikeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // write code to retrieve bike information
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Extracting values from request parameters
        int bikeId = Integer.parseInt(request.getParameter("bike_id"));
        String make = request.getParameter("make");
        String model = request.getParameter("model");
        String color = request.getParameter("color");
        String numberPlate = request.getParameter("numberPlate");
        String year = request.getParameter("year");

        try {
            BikeService bikeService = new BikeService();
            Bike bike = new Bike();
            bike.setBike_id(bikeId);
            bike.setColor(color);
            bike.setMake(make);
            bike.setYear(year);
            bike.setModel(model);
            bike.setNumberPlate(numberPlate);
            bike.setYear(year);

            // Inserting data into the database (replace this with your database logic)
            bikeService.addBikeForNewCustomer(0, bike);
            response.getWriter().write("Bike information inserted into the database successfully!");
        } catch (SQLException e) {
            response.getWriter().write("Failed to insert bike information into the database.");
            throw new ServletException("Database error", e);
        }
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("-------method: " + request.getMethod() + " -----------");
        if (request.getMethod().equalsIgnoreCase("post")) {
            this.doPost(request, response);
        }
    }

    public void destroy() {
    }
}