package com.anastasiyayuragina.keddit

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anastasiyayuragina.keddit.commons.Extensions
import com.anastasiyayuragina.keddit.commons.inflate

class NewsFragment : Fragment() {
    private var newsListView: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = container?.inflate(R.layout.news_fragment)

        newsListView.run {
            view.findViewById(R.id.newsList)
            this?.setHasFixedSize(true)
            this?.layoutManager = LinearLayoutManager(context)
        }

        return view
    }
}