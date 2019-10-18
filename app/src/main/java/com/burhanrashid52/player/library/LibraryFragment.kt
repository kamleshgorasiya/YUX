package com.kamleshgorasiya.player.library

import android.os.Bundle
import android.view.View
import com.kamleshgorasiya.player.R
import ja.kamleshgorasiya.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_trending.*

class LibraryFragment : BaseFragment() {

    companion object {
        val TAG = LibraryFragment::class.java.simpleName
        fun newInstance() = LibraryFragment()
    }

    override fun getLayoutId() = R.layout.fragment_trending

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtLabel.text = "Videos Library"
    }
}