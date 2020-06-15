package com.gsixacademy.android.mymoviesapplication.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gsixacademy.android.mymoviesapplication.R
import com.gsixacademy.android.mymoviesapplication.api.MovieDatabaseApi
import com.gsixacademy.android.mymoviesapplication.api.ServiceBuilder
import com.gsixacademy.android.mymoviesapplication.models.MovieListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.movies_list_fragment, container, false)
        val request = ServiceBuilder.buildService(MovieDatabaseApi::class.java)

        val category = arguments?.getString("category")
        val call = request.getMovies(category, 1)
        call.enqueue(object : Callback<MovieListResponse> {
            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                Toast.makeText(activity, "Error", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>
            ) {
                if (response.isSuccessful) {
                    var movieResponse = response.body()
                    var movieList = movieResponse?.results
                    if (movieList != null) {
                    } else {
                    }
                }

            }

        })
        return view
    }
}

