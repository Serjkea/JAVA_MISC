import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/param")
public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameterMap().isEmpty()) {
            getServletContext().getRequestDispatcher("/postform.jsp").forward(req,resp);
        } else {
            resp.getWriter().write(reqHandle(req));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(reqHandle(req));
    }

    private String reqHandle(HttpServletRequest req) {
        String name = (String) req.getParameter("name");
        String age = (String) req.getParameter("age");
        return "Name: " + name + "\n" + "Age: " + age;
    }
}
