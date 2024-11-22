package com.compose.shopping.store.data.repository

import arrow.core.Either
import com.compose.shopping.store.data.maper.toGeneralError
import com.compose.shopping.store.data.remote.ProductApi
import com.compose.shopping.store.domain.model.NetworkError
import com.compose.shopping.store.domain.model.Product
import com.compose.shopping.store.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductApi
) : ProductsRepository {

    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toGeneralError() }
    }

}