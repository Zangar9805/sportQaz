package com.example.sporqaz

interface MainContract {

    interface Repository{
        fun getNews()
    }

    interface Presenter {
        fun doRxMethod()
        fun showDataInView()
    }

    interface MainView{
        fun showProgress()
        fun hideProgress()
        fun showNews()
    }
}
