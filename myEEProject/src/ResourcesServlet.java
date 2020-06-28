import model.Resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

@WebServlet(value = "/resource")
public class ResourcesServlet extends HttpServlet {

    @RequestScoped
    @Inject
    private Resource resource;

    private int counter = 0;

    @Override
    public void init() throws ServletException {
        for(int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    URLConnection connection = new URL("http://localhost:8085/myEEProject/resource").openConnection();
                    connection.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resource.setName(Thread.currentThread().getName() + " resource");
        resource.setData(++counter);
        resp.getWriter().write(resource.toString());
    }

    @Override
    public void destroy() {
        System.out.println(resource.toString());
    }
}
