package com.kamleshgorasiya.player.home

import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.support.test.espresso.idling.CountingIdlingResource
import android.support.v7.widget.LinearLayoutManager
import com.kamleshgorasiya.player.R
import com.kamleshgorasiya.player.dashboard.DashboardViewModel
import ja.kamleshgorasiya.base.BaseFragment
import ja.kamleshgorasiya.base.getActivityViewModel
import ja.kamleshgorasiya.base.repo.Status.*
import ja.kamleshgorasiya.base.widgets.SimpleDividerItemDecoration
import kotlinx.android.synthetic.main.fragment_home.*
import timber.log.Timber

/**
 * Created by Kamlesh Gorasiya on 3/6/2018.
 */
class HomeFragment @SuppressLint("ValidFragment")
private constructor() : BaseFragment() {

    override fun getLayoutId() = R.layout.fragment_home

    companion object {
        const val TAG = "HomeFragment"
        fun newInstance() = HomeFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    private val homeAdapter = HomeAdapter {
        dashboardViewModel.loadVideo(it)
    }
    private lateinit var dashboardViewModel: DashboardViewModel

    @VisibleForTesting
    val countingIdleResources = CountingIdlingResource(TAG)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dashboardViewModel = getActivityViewModel()
        rvMovies.layoutManager = LinearLayoutManager(activity)
        rvMovies.addItemDecoration(SimpleDividerItemDecoration(context))
        rvMovies.adapter = homeAdapter

        countingIdleResources.increment()
        dashboardViewModel.movies.observe(this, Observer {
            when (it?.status) {
                SUCCESS -> {
                    it.data?.let {
                        homeAdapter.moviesList = it.toMutableList()
                    }
                    countingIdleResources.decrement()
                }
                ERROR -> {
                    countingIdleResources.decrement()
                }
                LOADING -> {
                    Timber.e("Loading")
                    it.data?.let {
                        homeAdapter.moviesList = it.toMutableList()
                    }
                }
            }
        })
    }
}