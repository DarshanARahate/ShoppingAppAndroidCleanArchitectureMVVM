package com.compose.shopping.store.domain.repository

import arrow.core.Either
import com.compose.shopping.store.domain.model.NetworkError
import com.compose.shopping.store.domain.model.Product

interface ProductsRepository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}


