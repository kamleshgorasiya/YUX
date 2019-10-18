package com.kamleshgorasiya.player.data.remote

import android.arch.lifecycle.LiveData
import com.kamleshgorasiya.player.data.local.MoviesSource
import ja.kamleshgorasiya.base.api.ApiResponse
import retrofit2.http.GET

/**
 * Created by Kamlesh Gorasiya on 3/6/2018.
 */
interface WebService {
    @GET("movieslist")
    fun getMovies(): LiveData<ApiResponse<MoviesSource>>
}