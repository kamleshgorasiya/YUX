package com.kamleshgorasiya.player.dashboard

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.kamleshgorasiya.player.PlayerApp
import com.kamleshgorasiya.player.data.MoviesRepository
import com.kamleshgorasiya.player.data.local.Movies
import com.kamleshgorasiya.player.di.components.DaggerActivityComponent
import ja.kamleshgorasiya.base.liveUtils.SingleLiveEvent
import ja.kamleshgorasiya.base.repo.Resource
import javax.inject.Inject

/**
 * Created by Kamlesh Gorasiya on 3/6/2018.
 */
class DashboardViewModel(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var moviesRepository: MoviesRepository
    val movies: LiveData<Resource<List<Movies>>>
    val moviesSelectionListener = SingleLiveEvent<Movies>()
    val controllersListener = SingleLiveEvent<ViewsEvents>()

    private val viewClicked = ViewsEvents.CLICKED()
    private val viewShow = ViewsEvents.SHOW()
    private val viewHide = ViewsEvents.HIDE()
    private val viewLongPress = ViewsEvents.LONGPRESS()

    init {
        DaggerActivityComponent.builder()
                .baseNetworkComponent(PlayerApp.baseNetworkComponent)
                .build()
                .inject(this)

        movies = moviesRepository.getMoviesTrailers()
    }

    fun loadVideo(movies: Movies) {
        moviesSelectionListener.value = movies
    }

    fun showControllers(isShown: Boolean) {
        controllersListener.value = if (isShown) viewShow else viewHide
    }

    fun onClicked(isLongPress: Boolean = false) {
        controllersListener.value = if (isLongPress) viewLongPress else viewClicked
    }


    fun getMoviesDetails(movieId: Int) = moviesRepository.getMoviesDetails(movieId)
}