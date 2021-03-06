package br.com.eastcustom.model;

/*
 * @author Diego Troiani
 * 
 * Description: Class for one feed message.
 * Last modified: 22/05/2018.
 * Obs: *.
 */
public class FeedMessage {
	private String title;
	private String description;
	private String link;
	private String author;
	private String guid;
	private String pubDate;
	private String imgDescription;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPubDate() {
		return pubDate;
	}

	public String getImgDescription() {
		return imgDescription;
	}

	public void setImgDescription(String imgDescription) {
		this.imgDescription = imgDescription;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "FeedMessage [title=" + title + ", description=" + description + ", link=" + link + ", author=" + author
				+ ", guid=" + guid + ", pubDate=" + pubDate + ", imgDescription=" + imgDescription + "]";
	}
}
