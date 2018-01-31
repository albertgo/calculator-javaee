/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.calculator.webapp;

import com.bonarea.calculator.service.ICalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author albert.gonzalez
 */
public class CalculatorServlet extends HttpServlet {

    private ICalculator icalculator;
    
    @Inject
    public CalculatorServlet(@Named("calculatorService")ICalculator icalculator){
        this.icalculator = icalculator;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorServlet at " + request.getContextPath() + "</h1>");
//            out.println(request.getParameter("num1"));
//            out.println(request.getParameter("num2"));
            String operation = request.getParameter("operation");
           
           
           switch(operation){
               case "add":
                   out.println("<h1>Result: "+icalculator.add(Integer.parseInt(request.getParameter("num1")), 
                                                        Integer.parseInt(request.getParameter("num2")))
                    +"</h1>");
                   break;
               case "substract":
                   out.println("<h1>Result: "+icalculator.substract(Integer.parseInt(request.getParameter("num1")), 
                                                        Integer.parseInt(request.getParameter("num2")))
                    +"</h1>");
                   break;
               case "multiply":
                    out.println("<h1>Result: "+icalculator.multiply(Integer.parseInt(request.getParameter("num1")), 
                                                        Integer.parseInt(request.getParameter("num2")))
                    +"</h1>");
                   break;
               case "divide":
                   out.println("<h1>Result: "+icalculator.divide(Integer.parseInt(request.getParameter("num1")), 
                                                        Integer.parseInt(request.getParameter("num2")))
                    +"</h1>");
                   break;
               default:
                   out.println("<h1>You don't have specified the operation</h1>");
           }
           
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
