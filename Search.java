import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Hamurabi Araújo
 *
 */
public class Search {
	private ArrayList<String> urls;
	private ArrayList<String> keyWords;
	private Boolean returnAll;
	private int depth;
	private Set<URL> relatedLinks;
	
	
	/**
	 * 
	 */
	public Search() {
		// TODO Auto-generated constructor stub
		returnAll = false;
	}


	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}


	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}


	/**
	 * @return the urls
	 */
	public ArrayList<String> getUrls() {
		return urls;
	}


	/**
	 * @param urls the urls to set
	 */
	public void setUrls(ArrayList<String> urls) {
		this.urls = urls;
	}


	/**
	 * @return the keyWords
	 */
	public ArrayList<String> getKeyWords() {
		return keyWords;
	}


	/**
	 * @param keyWords the keyWords to set
	 */
	public void setKeyWords(ArrayList<String> keyWords) {
		this.keyWords = keyWords;
	}


	/**
	 * @return the returnAll
	 */
	public Boolean getReturnAll() {
		return returnAll;
	}


	/**
	 * @param returnAll the returnAll to set
	 */
	public void setReturnAll(Boolean returnAll) {
		this.returnAll = returnAll;
	}
	
	public void getRelatedLinksOfPage(URL link) throws IOException {
		Document doc = Jsoup.connect(link.toString())
				  .data("query", "Java")
				  .userAgent("Mozilla")
				  .timeout(3000)
				  .post();
		
		Elements urls = doc.select("a[href]");
		
		if (this.returnAll == true){
			for (Element url : urls) {
				this.relatedLinks.add(new URL(url.toString()));
				System.out.println(url.attr("abs:href"));
			}
		} else {
			for (Element url : urls) {
				for (String keyWord : this.keyWords) {
					if (url.toString().toLowerCase().contains(keyWord.toLowerCase()))
						this.relatedLinks.add(new URL(url.toString()));
				}
			}
		}
	}

}
