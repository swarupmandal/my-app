package htmlparser;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class HtmlPerser {

	public static void main(String[] args) {
		
		try {
			
			String filePath = "/home/swarup/Desktop/commands/filepath/forgotPassword.html";
			
			Document doc = Jsoup.parse(new File(filePath), "utf-8");
			
			Elements htags = doc.select("h1, h2, h3, h4, h5, h6");
			
			Elements h1tags = htags.select("h1");
			
			System.out.println(h1tags);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
