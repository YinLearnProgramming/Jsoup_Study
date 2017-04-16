import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupLearning 
{
	public static void main(String[] args) throws IOException 
	{
		Document d=Jsoup.connect("http://www.wikihow.com/wikiHowTo?search=adjust+bass+on+computer").timeout(6000).get();
		Elements ele=d.select("div#searchresults_list");
		for (Element element : ele.select("div.result")) 
		{
			String img_url = element.select("div.result_thumb img").attr("src");
			System.out.println(img_url);
			
			String title = element.select("div.result_data a").text();
			System.out.println(title);
		}
	}
}
