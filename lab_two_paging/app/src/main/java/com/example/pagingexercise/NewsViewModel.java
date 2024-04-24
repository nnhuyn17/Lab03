package com.example.pagingexercise;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsViewModel extends ViewModel {
    private MutableLiveData<List<Article>> articles;
    private ClientAPI clientAPI;

    public NewsViewModel() {
        articles = new MutableLiveData<>();
        clientAPI = Client.getClient().create(ClientAPI.class);
    }

    public LiveData<List<Article>> getArticles(String keyword) {
        clientAPI.getNews(keyword).enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()) {
                    articles.setValue(response.body().getArticles());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                // Handle failure
            }
        });

        return articles;
    }
}
