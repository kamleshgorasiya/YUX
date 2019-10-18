package com.kamleshgorasiya.player.home

import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kamleshgorasiya.player.R
import com.kamleshgorasiya.player.data.local.Movies
import ja.kamleshgorasiya.base.loadFromUrl
import kotlinx.android.synthetic.main.row_home_feed.view.*

/**
 * Created by Kamlesh Gorasiya on 3/7/2018.
 */
class HomeAdapter(private val listener: ((Movies) -> Unit)? = null) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    var moviesList = mutableListOf<Movies>()
        set(value) {
            field.clear()
            moviesList.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_home_feed, parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount() = moviesList.count()

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(moviesList[position])
    }

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movies: Movies) = with(itemView) {
            imgPoster.loadFromUrl(movies.poster)
            txtTitle.text = movies.title
            txtDescription.text = movies.description
            setOnClickListener {
                listener?.invoke(moviesList[layoutPosition])
            }
        }
    }
}


