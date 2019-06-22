package com.example.sporqaz

import io.reactivex.Observable

interface MainContract {

    interface Repository{
        fun getNews(): List<News>
    }

    interface Presenter {
        fun initilalize()
    }

    interface MainView{
        fun showProgress()
        fun hideProgress()
        fun showNews(list: List<News>)
    }
}
