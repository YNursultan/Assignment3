package Classes;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        for (int a = 0; a<cookies.length; a++){
            cookies[a].setMaxAge(0);
            cookies[a].setValue("");
            resp.addCookie(cookies[a]);
        }
        req.getRequestDispatcher("Login-form.jsp").forward(req,resp);
    }
}
