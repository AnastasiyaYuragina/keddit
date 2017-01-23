package com.anastasiyayuragina.keddit

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class NewsFragment : Fragment() {
    private var newsListView: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.news_fragment, container, false)
        newsListView.run {
            view.findViewById(R.id.newsList)
            this?.setHasFixedSize(true)
            this?.layoutManager = LinearLayoutManager(context)
        }

        return view
    }
}