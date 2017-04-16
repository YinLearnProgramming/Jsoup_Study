import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupGoogle 
{
	public static void main(String[] args) throws IOException
	{
		String html = "https://www.google.com/";
		Document doc = Jsoup.connect(html).get();
		String title = doc.title();
		System.out.println(title);
	}
}
