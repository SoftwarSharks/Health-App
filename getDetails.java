

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Servlet implementation class getDetails
 */
@WebServlet("/getDetails")
public class getDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String target_url = request.getParameter("q");
		String core_url = "https://kidshealth.org/";
		String search_param = target_url;
		String url = core_url + search_param;
		
	    Document doc = Jsoup.connect(url).get();
	    Elements links = doc.select("div#khcontent_article");
	    String output_json = "";
//	    int counter = 0; 
        for (Element link : links) {
//        	Elements str = link.select("a[href]");
//        	Elements p = link.select("p");
//        	String str_inner = "[\"" + str.text() + "\", \"" + str.attr("href") + "\", \"" + p.text() + "\"],";
//        	output_json += str_inner;
//        	counter ++;
        	output_json = link.html();
        }
//        output_json = output_json.substring(0, output_json.length() - 1);
//        output_json += "]}";
//        response.setContentType("application/json");
		response.getWriter().print(output_json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
