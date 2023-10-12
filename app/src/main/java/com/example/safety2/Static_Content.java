package com.example.safety2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.request.TopHeadlinesRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;

public class Static_Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_content);
    getNews();
    }
       void getNews(){
           NewsApiClient newsApiClient=new NewsApiClient("8067701338014a69bb9d68d25e6483a2");
            newsApiClient.getTopHeadlines(
                    new TopHeadlinesRequest.Builder()
                            .language("en")
                            .build(),
                    new NewsApiClient.ArticlesResponseCallback() {
                        @Override
                        public void onSuccess(ArticleResponse response) {
                            Log.i("GOT RESPONSE",response.toString());
                        }

                        @Override
                        public void onFailure(Throwable throwable) {
                            Log.i("GOT FAILURE",throwable.getMessage());
                        }
                    }
            );
        }}