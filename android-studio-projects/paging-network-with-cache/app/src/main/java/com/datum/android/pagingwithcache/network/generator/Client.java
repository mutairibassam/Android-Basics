package com.datum.android.pagingwithcache.network.generator;

import android.media.MediaRouter;

import com.datum.android.pagingwithcache.network.Routes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static final String TAG = Client.class.getSimpleName();

    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Routes.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
