package com.example.androidretrofitwithcoroutines

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesAPI {

    @GET("/quotes")
    fun getQuotes(@Query("page") page:Int): Response<QuoteList>
}