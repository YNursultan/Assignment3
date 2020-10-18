package Classes;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("reg-username");
        String password = req.getParameter("reg-password");

        Cookie user = new Cookie("username",username);
        Cookie pass = new Cookie("password",password);

        user.setMaxAge(60 * 60 * 10);
        pass.setMaxAge(60 * 60 * 10);

        resp.addCookie(user);
        resp.addCookie(pass);

        User a = new User(username,password);
        req.setAttribute("key",a);
        req.getRequestDispatcher("/Login-form.jsp").forward(req,resp);
    }
}
