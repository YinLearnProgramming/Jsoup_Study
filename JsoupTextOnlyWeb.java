import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTextOnlyWeb 
{
	public static void main(String[] args) throws IOException 
	{
		// for text input
		String html = "<p>An	<a href='http://example.com/'><b>example</b></a> link.</p>";
		Document doc = Jsoup.parse(html); // only for text web site
		String text = doc.body().text(); //take <a href="/text">example</a>
		String html2 = "<html><head><title>jsoup: input with string</title></head><body>Such an easy task.</body></html>";
		Document d = Jsoup.parse(html2);
		System.out.println(d);
		String texts = d.select("head").text();
		System.out.println(texts);
		
		/*************************
		 *  //this is for file input 
		 * Try 
		 * {
		 * 	File file = new File("index.html");
		 *  Document doc = Jsup.parse(file, "utf-8");
		 * }
		 * catch(IOException ioe)
		 * {
		 * 	ioe.printStackTrace();
		 * }
		 */
		
		/***************************
		 * //for URL input
		 * Document docu = Jsoup.connect(www.example.com).get();
		 */
		
		//Elements result = docu.select("div.results");
		
		//Elements dls = result.select("dl");
	
		//for (Element dl : dls)
		//{
			//String url = dl.select("a").attr("abs:href");
		//}
	}
}