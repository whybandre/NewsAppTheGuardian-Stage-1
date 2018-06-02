package com.example.android.newsapptheguardianstage1;

/**
 * An {@link News} object contains information related to a single Article.
 */

public class News {

    /** Title of the article */
    private String mTitle;

    /** Section of the News */
    private String mSection;

    /** Date of the article published */
    private String mDate;

    /** Website URL of the article */
    private String mUrl;

    /** Author of the article */
    private String mAuthor;

    public News(String mTitle, String mSection, String mDate, String mUrl, String mAuthor) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mDate = mDate;
        this.mUrl = mUrl;
        this.mAuthor = mAuthor;
    }

    /**
     * Returns the Article Title of the News.
     */
    public String getTitleArticle() {
        return mTitle;
    }

    /**
     * Returns the Section of the article news.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the Date when the article was published.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website of the News.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the author of the article of the News.
     */
    public String getAuthor() {
        return mAuthor;
    }
}
