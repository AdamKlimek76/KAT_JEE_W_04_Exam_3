import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomQuote")
public class RandomQuote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = (List) session.getAttribute("quotes");
        Random r = new Random();
        int quoteIndex = r.nextInt(quotes.size()+1);
            String randomContent = quotes.get(quoteIndex).getContent();
            response.getWriter().println("Losowy cytat: " + randomContent);
        }
    }

