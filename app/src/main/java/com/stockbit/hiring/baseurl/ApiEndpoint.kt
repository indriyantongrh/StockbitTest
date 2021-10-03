package com.stockbit.hiring.baseurl

import com.stockbit.hiring.model.Base
import retrofit2.Call
import com.stockbit.hiring.model.ResponseCoin
import retrofit2.http.GET

/**
 *  Create by Indriyantongrh on 03/10/21
 */
interface ApiEndpoint {

    @GET("totaltoptiervolfull?limit=50&tsym=IDR")
    fun data(): Call<Base.Base>
}