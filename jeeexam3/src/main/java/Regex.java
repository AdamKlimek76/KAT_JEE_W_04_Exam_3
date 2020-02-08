import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet("/regex")
public class Regex extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputRegex = request.getParameter("param1");
        boolean resultRegex = Pattern.matches("[a-z]+\\.((gif)|(jpg)|(png))", inputRegex);
        if (resultRegex) {
            String urlAddress = "https://www.google.pl/#q=cat.jpg";
            String changedUrlAddress = urlAddress.replaceAll("cat.jpg", inputRegex);
            response.sendRedirect(changedUrlAddress);
        } else {
            getServletContext().getRequestDispatcher("/regex.jsp")
                    .forward(request, response);
        }

    }
}
