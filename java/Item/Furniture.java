package Item;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Furniture extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LinkedList<Product> list = new LinkedList<Product>();

        Product p1 = new Product("Chair",500);
        Product p2 = new Product("Table",300);
        Product p3 = new Product("Lamp",200);
        Product p4 = new Product("Shelf",700);
        Product p5 = new Product("Mirror",400);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        req.setAttribute("list",list);
        req.getRequestDispatcher("/Page-Furniture.jsp").forward(req,resp);
    }
}
