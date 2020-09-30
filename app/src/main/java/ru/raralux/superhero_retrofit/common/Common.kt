package ru.raralux.superhero_retrofit.common

import ru.raralux.superhero_retrofit.`interface`.RetrofitServices
import ru.raralux.superhero_retrofit.retrofit.RetrofitClient

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"

    val retrofitServices: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}