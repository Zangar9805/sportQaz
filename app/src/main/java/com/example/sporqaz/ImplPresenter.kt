package com.example.sporqaz

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ImplPresenter(viewIetem: MainContract.MainView) : MainContract.Presenter {

    val repo = ImplRepository()
    val view = viewIetem

    override fun initilalize() {
        GlobalScope.launch {
            view.showNews(repo.getNews())
        }
    }


}