import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(value = "/hello")
public class HelloServlet extends HttpServlet {

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void init() throws ServletException {
        System.out.println("init method");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                URLConnection urlConnection = null;
                try {
                    urlConnection = new URL("http://localhost:8085/myEEProject/hello").openConnection();
                    urlConnection.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello");
        counter.incrementAndGet();
        System.out.println(counter.get());
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
        System.out.println(counter.get());
    }

}
