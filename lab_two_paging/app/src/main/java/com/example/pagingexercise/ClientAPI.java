package com.example.pagingexercise;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ClientAPI {
        @GET("everything?from=2024-04-13&to=2024-04-13&sortBy=popularity&apiKey=e9887424debb455594908fa5e8ce3560")
        Call<NewsResponse> getNews(
                @Query("q") String query
        );
}
