import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WikiJsoup 
{
	public static void main(String[] args) throws IOException
	{
		String html = "https://en.wikipedia.org/wiki/Main_Page";
		Document doc = Jsoup.connect(html).get();
		System.out.println("Entering web page. it is " + html);
		
		Elements newsHeadLines = doc.select("#mp-itn li");
		
		for (Element step : newsHeadLines)
		{
			String words = step.text();
			System.out.println(words);
		}
		
	}
}
