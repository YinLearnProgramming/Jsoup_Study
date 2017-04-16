import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupLearningTwo 
{
	public static void main(String[] args) throws IOException 
	{
		Document dc=Jsoup.connect("http://www.wikihow.com/Adjust-Bass-on-Computer").timeout(6000).get();
		Elements body = dc.select("div#bodycontents");
		
		for (Element step : body)
		{
			String method = step.select("div.steps h3 div.altblock").text();
			System.out.println(method);
			String title = step.select("div.steps h3 span.mw-headline").text();
			System.out.println(title);
			
			for(Element img : step.select(".section_text img"))
			{
				String img_url = img.attr("data-src");
				System.out.println(img_url);
			}
		}
	}
}
