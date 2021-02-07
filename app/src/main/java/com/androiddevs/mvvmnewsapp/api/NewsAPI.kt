package com.androiddevs.mvvmnewsapp.api

import com.androiddevs.mvvmnewsapp.db.models.NewsResponse
import com.androiddevs.mvvmnewsapp.util.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by A SaMa on 06/02/2021 at 16:08.
 * GGApp
 * tranhuuluong888@gmail.com
 */
interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}