package com.example.newsapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsApiService {
    @GET("everything?q=apple&from=2024-04-13&to=2024-04-13&sortBy=popularity&apiKey=e9887424debb455594908fa5e8ce3560")
    Call<NewsResponse> getNews();
}

