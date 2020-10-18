package Item;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Gadgets extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LinkedList<Product> list = new LinkedList<Product>();

        Product p1 = new Product("Phone",800);
        Product p2 = new Product("PC",1000);
        Product p3 = new Product("Watch",200);
        Product p4 = new Product("Laptop",600);
        Product p5 = new Product("Earphone",300);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        req.setAttribute("list",list);
        req.getRequestDispatcher("/Page-Gadgets.jsp").forward(req,resp);
    }
}
