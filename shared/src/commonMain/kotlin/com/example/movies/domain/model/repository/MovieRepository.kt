package com.example.movies.domain.model.repository

import com.example.movies.domain.model.Movie


internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}
