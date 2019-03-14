package com.aulaestudio;

import com.aulaestudio.controllers.AcademiaController;
import com.aulaestudio.models.Alumno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "AcademiaServlet")
public class AcademiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Connection con= Conexion.obtener();
            System.out.println("CONEXION ON");
            String query= "insert into usuarios (nombre,contrasenha) values(?,?)";
            String selectSQL = "select nombre from usuarios";
            //create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,request.getParameter("nombre"));
            preparedStmt.setString(2,request.getParameter("contrasenha"));
            //execute the preparedstatement
            preparedStmt.execute();

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*PrintWriter out = response.getWriter();
        out.println("hola mundo");
        out.close();*/
/*
        response.sendRedirect("nuevo.jsp");
*/
        AcademiaController controller = new AcademiaController(true);//llamamos al controlador
        ArrayList<Alumno> al= controller.getListaAlumnos();//me devuelve la lista de alumnos
        request.setAttribute("alumnos",al);//request:peticion que recibe,es un objeto,le paso la lista de alumnos
        // al archivo nuevo.jsp
        request.getRequestDispatcher("nuevo.jsp").forward(request,response);
    }
}
