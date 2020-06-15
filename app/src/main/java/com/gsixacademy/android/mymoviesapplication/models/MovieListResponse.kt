package com.gsixacademy.android.mymoviesapplication.models

class MovieListResponse (
    val page:Int,
    val results:ArrayList<MovieResult>,
    val total_results: Int,
    val total_pages: Int

)