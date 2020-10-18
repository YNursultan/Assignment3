package Classes;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ShowServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] arr = req.getParameterValues("items");
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession(true);

        Cookie[] cookies = req.getCookies();
        int a = cookies[0].getMaxAge();
        int b = session.getMaxInactiveInterval() - (600 - a);

        printWriter.println("Activity interval "+ a);
        Date creation = new Date(b);
        printWriter.println("creation time "+ creation +"<br>");


    }
}
