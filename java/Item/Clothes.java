package Item;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Clothes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LinkedList<Product> list = new LinkedList<Product>();

        Product p1 = new Product("T-shirt",200);
        Product p2 = new Product("Tie",100);
        Product p3 = new Product("Socks",100);
        Product p4 = new Product("Pants",300);
        Product p5 = new Product("Sneakers",500);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        req.setAttribute("list",list);
        req.getRequestDispatcher("/Page-Clothes.jsp").forward(req,resp);
    }
}
