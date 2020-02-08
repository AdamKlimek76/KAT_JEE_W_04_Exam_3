import com.sun.javafx.scene.shape.QuadCurveToHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addquote")
public class addQuote extends HttpServlet {

    private final static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"addquote\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Autor:\n" +
            "        <input type=\"text\" name=\"author\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Cytat:\n" +
            "        <input type=\"text\" name=\"content\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; utf-8");
        response.getWriter().println(FORM);
    }

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {
        HttpSession session = request.getSession();
        String author = request.getParameter("author");
        String content = request.getParameter("content");
        Quote quote = new Quote(author, content);
        List<Quote> quotes = (List) session.getAttribute("quotes");
        if (quotes == null) {
            quotes = new ArrayList<>();
        }
        quotes.add(quote);
        session.setAttribute("quotes", quotes);
        response.getWriter().println(quotes);

    }
}

