package ru.raralux.superhero_retrofit.`interface`

import retrofit2.Call
import retrofit2.http.GET
import ru.raralux.superhero_retrofit.model.Movie

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}