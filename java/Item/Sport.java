package Item;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

public class Sport extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LinkedList<Product> list = new LinkedList<Product>();

        Product p1 = new Product("Ball",100);
        Product p2 = new Product("Gloves",300);
        Product p3 = new Product("Boots",500);
        Product p4 = new Product("Timer",200);
        Product p5 = new Product("Helmet",400);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        req.setAttribute("list",list);
        getServletContext().getRequestDispatcher("/Page-Sport.jsp").forward(req,resp);
    }
}
