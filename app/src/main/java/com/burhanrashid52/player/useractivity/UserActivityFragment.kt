package com.kamleshgorasiya.player.useractivity

import android.os.Bundle
import android.view.View
import com.kamleshgorasiya.player.R
import ja.kamleshgorasiya.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_trending.*

class UserActivityFragment : BaseFragment() {

    companion object {
        val TAG = UserActivityFragment::class.java.simpleName
        fun newInstance() = UserActivityFragment()
    }

    override fun getLayoutId() = R.layout.fragment_trending

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtLabel.text = "Your Activities"
    }
}