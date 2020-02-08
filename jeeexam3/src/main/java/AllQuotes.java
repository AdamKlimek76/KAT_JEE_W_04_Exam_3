import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/allquotes")
public class AllQuotes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = (List) session.getAttribute("quotes");
        for (int i=0; i<quotes.size(); i++){
            String author = quotes.get(i).getAuthor();
            String content = quotes.get(i).getContent();
            response.getWriter().println("Cytat: " + content + " Autor: " + author);
        }
    }
}
