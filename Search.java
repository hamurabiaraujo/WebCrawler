import java.awt.List;
import java.util.ArrayList;

/**
 * @author Hamurabi Araújo
 *
 */
public class Search {
	private ArrayList<String> urls;
	private ArrayList<String> keyWords;
	private Boolean returnAll;
	private int depth;
	
	
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

}
