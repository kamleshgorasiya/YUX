package com.kamleshgorasiya.player.data

import android.arch.lifecycle.LiveData
import com.kamleshgorasiya.player.data.local.Movies
import com.kamleshgorasiya.player.data.local.MoviesDao
import com.kamleshgorasiya.player.data.local.MoviesSource
import com.kamleshgorasiya.player.data.remote.WebService
import ja.kamleshgorasiya.base.repo.AppExecutors
import ja.kamleshgorasiya.base.repo.NetworkBoundResource
import ja.kamleshgorasiya.base.repo.Resource
import javax.inject.Inject

/**
 * Repository abstracts the logic of fetching the data and persisting it for
 * offline. They are the data source as the single source of truth.
 *
 * @author Akshay Chordiya
 * @since 6/5/2017.
 */
class MoviesRepository @Inject constructor(val moviesDao: MoviesDao,
                                           val webService: WebService) {

    val appExecutors: AppExecutors = AppExecutors()
    /**
     * Fetch the news movies from database if exist else fetch from web
     * and persist them in the database
     */
    fun getMoviesTrailers(): LiveData<Resource<List<Movies>>> {
        return object : NetworkBoundResource<List<Movies>, MoviesSource>(appExecutors) {
            override fun saveCallResult(item: MoviesSource) {
                moviesDao.insertMovies(item.movies)
            }

            override fun shouldFetch(data: List<Movies>?) = true

            override fun loadFromDb() = moviesDao.getMovies()

            override fun createCall() = webService.getMovies()
        }.asLiveData()
    }

    fun getMoviesDetails(movieId: Int): LiveData<Resource<Movies>> {
        return object : NetworkBoundResource<Movies, MoviesSource>(appExecutors) {
            override fun saveCallResult(item: MoviesSource) {
               // moviesDao.insertMovies(item.movies)
            }

            override fun shouldFetch(data: Movies?) = false

            override fun loadFromDb() = moviesDao.getMoviesDetails(movieId)

            override fun createCall() = webService.getMovies()
        }.asLiveData()
    }

}