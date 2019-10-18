package com.kamleshgorasiya.player.network

import android.arch.lifecycle.LiveData
import com.kamleshgorasiya.player.data.local.MoviesSource
import com.kamleshgorasiya.player.data.remote.WebService
import ja.kamleshgorasiya.base.api.ApiResponse

/**
 *
 * @author <a href="https://github.com/kamleshgorasiya">Kamlesh Gorasiya</a>
 * @since 6/22/2018
 */
class TestWebService : WebService {
    override fun getMovies(): LiveData<ApiResponse<MoviesSource>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}