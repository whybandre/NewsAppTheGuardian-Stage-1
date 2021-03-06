package com.example.android.newsapptheguardianstage1;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of News by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class NewsLoader extends AsyncTaskLoader<List<News>> {

    String apiKey = BuildConfig.THE_GUARDIAN_API_KEY;
    private String REQUEST_URL = "https://content.guardianapis.com/search?show-tags=contributor&api-key=" + apiKey;

    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     */
    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}