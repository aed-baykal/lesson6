package ru.gb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<h1>" + "HelloWorld" + "</h1>");
        resp.getWriter().printf("</body></html>");
    }
}