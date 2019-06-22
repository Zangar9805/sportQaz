package com.example.sporqaz

import android.util.Log
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import java.lang.Exception

class ImplRepository: MainContract.Repository {

    val url = "https://www.alaman.kz/news?tag=Қазақ%20футболы"
    lateinit var doc: Document
    lateinit var title: String
    lateinit var img: String
    lateinit var desc: String

    override fun getNews() {

        try {
            doc = Jsoup.connect(url).get()
        }catch (e: Exception){
            Log.d("JSOUP", e.localizedMessage)
        }

        val elements = doc.select("div.body").select("div.post.fashion-post.post-default-list.post-separator-border")
        for (element in elements){
            title = element.select("div.content").select("h4").select("a").text()
            img = element.select("div.image").select("a").select("img").attr("src")
            desc = element.select("div.content").select("span.meta-item.date").text()
            Log.d("JSOUP", img+title+desc)
        }

    }

}