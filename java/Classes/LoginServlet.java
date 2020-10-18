package Classes;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Cookie[] cookies = req.getCookies();
        PrintWriter printWriter = resp.getWriter();
        int n = 0;
        for(int a = 0; a<cookies.length; a++)
        {
            if (cookies[a].getName().equals("username")){
                if (cookies[a].getValue().equals(username)){
                    n++;
                }
            }
            if (cookies[a].getName().equals("password")){
                if (cookies[a].getValue().equals(password)){
                    n++;
                }
            }
        }
        if (n == 2){
            for (int a = 0; a<cookies.length; a++){
                cookies[a].setMaxAge(10 * 60);
                resp.addCookie(cookies[a]);
            }
            HttpSession session = req.getSession(true);
            session.setMaxInactiveInterval(60 * 5);
            Integer count = 0;
            try{
                if(session.isNew()){
                    // empty case
                }
                else {
                    if(session.getAttribute("count") != null)
                    {
                        count = (Integer)session.getAttribute("count")+1;
                    }
                }
                session.setAttribute("count",count);
                session.setAttribute("date",session.getCreationTime());
                req.getRequestDispatcher("Page-1.jsp").forward(req,resp);
            }
            catch (Exception exception){
                exception.printStackTrace();
            }
        }else {
            printWriter.println("Incorrect login or password");
        }

    }
}
