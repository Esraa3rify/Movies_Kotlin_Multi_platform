package com.example.movies.data.remote.repository

import com.example.movies.data.remote.RemoteDataSource
import com.example.movies.domain.model.Movie
import com.example.movies.data.remote.util.toMovie
import com.example.movies.domain.model.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}