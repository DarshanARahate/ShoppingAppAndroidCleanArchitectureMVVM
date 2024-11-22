package com.compose.shopping.store.data.remote

import com.compose.shopping.store.domain.model.Product
import retrofit2.http.GET

interface ProductApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}