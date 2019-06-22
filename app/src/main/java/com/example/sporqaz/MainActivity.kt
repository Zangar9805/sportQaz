package com.example.sporqaz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), MainContract.MainView {

    val mPresenter = ImplPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.initilalize()
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

    override fun showNews(list: List<News>) {
        Log.d("MainActivity", list.toString())
    }
}
