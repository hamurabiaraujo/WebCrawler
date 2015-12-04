import java.awt.List;

/**
 * @author Hamurabi Araújo
 *
 */
public class Search {
	private List urls;
	private List keyWords;
	private Boolean returnAll;
	private int depth;
	
	
	/**
	 * 
	 */
	public Search() {
		// TODO Auto-generated constructor stub
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
	public List getUrls() {
		return urls;
	}


	/**
	 * @param urls the urls to set
	 */
	public void setUrls(List urls) {
		this.urls = urls;
	}


	/**
	 * @return the keyWords
	 */
	public List getKeyWords() {
		return keyWords;
	}


	/**
	 * @param keyWords the keyWords to set
	 */
	public void setKeyWords(List keyWords) {
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
