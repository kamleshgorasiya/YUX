package com.kamleshgorasiya.player.subscriptions

import android.os.Bundle
import android.view.View
import com.kamleshgorasiya.player.R
import ja.kamleshgorasiya.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_trending.*

class SubscriptionFragment : BaseFragment() {

    companion object {
        val TAG = SubscriptionFragment::class.java.simpleName

        fun newInstance() = SubscriptionFragment()
    }

    override fun getLayoutId() = R.layout.fragment_trending

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtLabel.text = "Subscriptions"
    }
}